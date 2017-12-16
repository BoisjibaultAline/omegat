/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2014, 2017 Aaron Madlon-Kay
               Home page: http://www.omegat.org/
               Support center: http://groups.yahoo.com/group/OmegaT/

 This file is part of OmegaT. The real license is reproduced below.

 OmegaT is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 OmegaT is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **************************************************************************/

package org.omegat.core.machinetranslators;

import java.awt.Window;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.omegat.core.Core;
import org.omegat.filters2.html2.HTMLUtils;
import org.omegat.gui.exttrans.MTConfigDialog;
import org.omegat.tokenizer.ITokenizer;
import org.omegat.util.DeNormalize;
import org.omegat.util.Language;
import org.omegat.util.OStrings;
import org.omegat.util.Preferences;

/**
 * Support for Moses Server
 *
 * @author Aaron Madlon-Kay
 */
public class MosesTranslate extends BaseTranslate {

    private static final String PROPERTY_MOSES_URL = "moses.server.url";

    @Override
    protected String getPreferenceName() {
        return Preferences.ALLOW_MOSES_TRANSLATE;
    }

    public String getName() {
        return OStrings.getString("MT_ENGINE_MOSES");
    }

    @Override
    protected String translate(Language sLang, Language tLang, String text) throws Exception {

        String server = getServerUrl();

        if (server == null) {
            return OStrings.getString("MT_ENGINE_MOSES_URL_NOTFOUND");
        }

        Map<String, String> mosesParams = new HashMap<String, String>();

        XmlRpcClient client = new XmlRpcClient();
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();

        config.setServerURL(new URL(server));
        client.setConfig(config);

        mosesParams.put("text", mosesPreprocess(text, sLang.getLocale()));

        Object[] xmlRpcParams = new Object[] { mosesParams };

        String result;
        try {
            HashMap<?, ?> response = (HashMap<?, ?>) client.execute("translate", xmlRpcParams);
            result = (String) response.get("text");
        } catch (XmlRpcException e) {
            return e.getLocalizedMessage();
        }
        return mosesPostprocess(result, tLang);
    }

    private String getServerUrl() {
        return System.getProperty(PROPERTY_MOSES_URL, Preferences.getPreference(PROPERTY_MOSES_URL));
    }

    private String mosesPreprocess(String text, Locale locale) {
        ITokenizer tokenizer = Core.getProject().getSourceTokenizer();
        StringBuilder sb = new StringBuilder();
        for (String t : tokenizer.tokenizeVerbatimToStrings(text)) {
            sb.append(t);
            sb.append(" ");
        }
        String result = sb.toString();
        return result.toLowerCase(locale);
    }

    private String mosesPostprocess(String text, Language targetLanguage) {
        String result = HTMLUtils.entitiesToChars(text);

        result = DeNormalize.processSingleLine(result).replaceAll("\\s+", " ").trim();

        if (!targetLanguage.isSpaceDelimited()) {
            result = result.replaceAll("(?<=[\u3001-\u9fa0])\\s+(?=[\u3001-\u9fa0])", "");
        }

        return cleanSpacesAroundTags(result, text);
    }

    @Override
    public boolean isConfigurable() {
        return true;
    }

    @Override
    public void showConfigurationUI(Window parent) {
        MTConfigDialog dialog = new MTConfigDialog(parent, getName()) {
            @Override
            protected void onConfirm() {
                String url = panel.valueField1.getText().trim();
                System.setProperty(PROPERTY_MOSES_URL, url);
                Preferences.setPreference(PROPERTY_MOSES_URL, url);
            }
        };

        dialog.panel.valueLabel1.setText(OStrings.getString("MT_ENGINE_MOSES_URL_LABEL"));
        dialog.panel.valueField1.setText(getServerUrl());
        dialog.panel.valueField1.setColumns(20);

        dialog.panel.valueLabel2.setVisible(false);
        dialog.panel.valueField2.setVisible(false);

        dialog.panel.temporaryCheckBox.setVisible(false);

        dialog.show();
    }
}