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

package org.omegat.gui.glossary.taas;

import javax.swing.JPanel;

import org.omegat.util.OStrings;

/**
 * @author Aaron Madlon-Kay
 */
@SuppressWarnings("serial")
public class TaaSPreferencesPanel extends JPanel {

    /** Creates new form TaaSPreferencesPanel */
    public TaaSPreferencesPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        messagePanel = new javax.swing.JPanel();
        messageTextArea = new javax.swing.JTextArea();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        getKeyButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        apiKeyTextField = new javax.swing.JTextField();
        temporaryCheckBox = new javax.swing.JCheckBox();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        lookupCheckBox = new javax.swing.JCheckBox();
        browseCollectionsButton = new javax.swing.JButton();
        selectDomainButton = new javax.swing.JButton();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, "jLabel1");

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setMinimumSize(new java.awt.Dimension(250, 200));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setAlignmentX(0.0F);
        jPanel1.setLayout(new java.awt.BorderLayout());

        messagePanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 5, 0));
        messagePanel.setAlignmentX(0.0F);
        messagePanel.setAlignmentY(0.0F);
        messagePanel.setLayout(new javax.swing.BoxLayout(messagePanel, javax.swing.BoxLayout.PAGE_AXIS));

        messageTextArea.setEditable(false);
        messageTextArea.setFont(jLabel1.getFont());
        messageTextArea.setLineWrap(true);
        messageTextArea.setText(OStrings.getString("TAAS_API_KEY_NOT_FOUND")); // NOI18N
        messageTextArea.setWrapStyleWord(true);
        messageTextArea.setAlignmentX(0.0F);
        messageTextArea.setOpaque(false);
        messagePanel.add(messageTextArea);
        messagePanel.add(filler1);

        org.openide.awt.Mnemonics.setLocalizedText(getKeyButton, OStrings.getString("TAAS_GET_KEY_BUTTON")); // NOI18N
        messagePanel.add(getKeyButton);

        jPanel1.add(messagePanel, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, OStrings.getString("TAAS_API_KEY_LABEL")); // NOI18N
        jPanel2.add(jLabel2);
        jPanel2.add(filler3);
        jPanel2.add(apiKeyTextField);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        org.openide.awt.Mnemonics.setLocalizedText(temporaryCheckBox, OStrings.getString("PREFS_CREDENTIAL_TEMPORARY_LABEL")); // NOI18N
        jPanel1.add(temporaryCheckBox, java.awt.BorderLayout.PAGE_END);

        add(jPanel1);
        add(filler2);

        org.openide.awt.Mnemonics.setLocalizedText(lookupCheckBox, OStrings.getString("PREFS_TAAS_LOOKUP")); // NOI18N
        lookupCheckBox.setAlignmentY(0.0F);
        add(lookupCheckBox);

        org.openide.awt.Mnemonics.setLocalizedText(browseCollectionsButton, OStrings.getString("TAAS_MENU_BROWSE")); // NOI18N
        browseCollectionsButton.setAlignmentY(0.0F);
        add(browseCollectionsButton);

        org.openide.awt.Mnemonics.setLocalizedText(selectDomainButton, OStrings.getString("TAAS_MENU_DOMAINS")); // NOI18N
        selectDomainButton.setAlignmentY(0.0F);
        add(selectDomainButton);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextField apiKeyTextField;
    javax.swing.JButton browseCollectionsButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    javax.swing.JButton getKeyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    javax.swing.JCheckBox lookupCheckBox;
    javax.swing.JPanel messagePanel;
    javax.swing.JTextArea messageTextArea;
    javax.swing.JButton selectDomainButton;
    javax.swing.JCheckBox temporaryCheckBox;
    // End of variables declaration//GEN-END:variables
}
