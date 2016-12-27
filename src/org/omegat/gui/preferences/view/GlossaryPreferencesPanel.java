/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool 
          with fuzzy matching, translation memory, keyword search, 
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2016 Aaron Madlon-Kay
               Home page: http://www.omegat.org/
               Support center: http://groups.yahoo.com/group/OmegaT/

 This file is part of OmegaT.

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

package org.omegat.gui.preferences.view;

import javax.swing.JPanel;

import org.omegat.util.OStrings;


/**
 * @author Aaron Madlon-Kay
 */
@SuppressWarnings("serial")
public class GlossaryPreferencesPanel extends JPanel {

    /** Creates new form GlossaryPanel */
    public GlossaryPreferencesPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayContextCheckBox = new javax.swing.JCheckBox();
        useSeparateTermsCheckBox = new javax.swing.JCheckBox();
        useStemmingCheckBox = new javax.swing.JCheckBox();
        replaceHitsCheckBox = new javax.swing.JCheckBox();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jPanel1 = new javax.swing.JPanel();
        enableTransTipsCheckBox = new javax.swing.JCheckBox();
        transTipsExactMatchCheckBox = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setMinimumSize(new java.awt.Dimension(250, 200));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(displayContextCheckBox, OStrings.getString("PREFS_GLOSSARY_TBX_DISPLAY_CONTEXT")); // NOI18N
        add(displayContextCheckBox);

        org.openide.awt.Mnemonics.setLocalizedText(useSeparateTermsCheckBox, OStrings.getString("PREFS_GLOSSARY_EXACT_MATCH")); // NOI18N
        add(useSeparateTermsCheckBox);

        org.openide.awt.Mnemonics.setLocalizedText(useStemmingCheckBox, OStrings.getString("PREFS_GLOSSARY_STEMMING")); // NOI18N
        add(useStemmingCheckBox);

        org.openide.awt.Mnemonics.setLocalizedText(replaceHitsCheckBox, OStrings.getString("PREFS_GLOSSARY_REPLACE_ON_INSERT")); // NOI18N
        add(replaceHitsCheckBox);
        add(filler1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(OStrings.getString("PREFS_GLOSSARY_TRANSTIPS"))); // NOI18N
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(enableTransTipsCheckBox, OStrings.getString("PREFS_GLOSSARY_TRANSTIPS_ENABLE")); // NOI18N
        jPanel1.add(enableTransTipsCheckBox);

        org.openide.awt.Mnemonics.setLocalizedText(transTipsExactMatchCheckBox, OStrings.getString("PREFS_GLOSSARY_TRANSTIPS_EXACTMATCH")); // NOI18N
        jPanel1.add(transTipsExactMatchCheckBox);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JCheckBox displayContextCheckBox;
    javax.swing.JCheckBox enableTransTipsCheckBox;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel jPanel1;
    javax.swing.JCheckBox replaceHitsCheckBox;
    javax.swing.JCheckBox transTipsExactMatchCheckBox;
    javax.swing.JCheckBox useSeparateTermsCheckBox;
    javax.swing.JCheckBox useStemmingCheckBox;
    // End of variables declaration//GEN-END:variables
}
