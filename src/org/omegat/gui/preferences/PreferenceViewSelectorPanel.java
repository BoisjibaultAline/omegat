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

package org.omegat.gui.preferences;

import org.omegat.util.OStrings;
import org.omegat.util.gui.ReasonablySizedPanel;

/**
 * @author Aaron Madlon-Kay
 */
@SuppressWarnings("serial")
public class PreferenceViewSelectorPanel extends javax.swing.JPanel {

    /**
     * Creates new form PreferenceViewSelectorPanel
     */
    public PreferenceViewSelectorPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewHolder = new ReasonablySizedPanel();
        innerViewHolder = new org.omegat.util.gui.ReasonablySizedPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        resetButton = new javax.swing.JButton();
        undoButton = new javax.swing.JButton();
        mainSplitPane = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        availablePrefsScrollPane = new javax.swing.JScrollPane();
        availablePrefsTree = new javax.swing.JTree();
        selectedPrefsScrollPane = new javax.swing.JScrollPane();
        selectedPrefsPlaceholderPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        viewHolder.setLayout(new java.awt.BorderLayout());

        innerViewHolder.setLayout(new java.awt.BorderLayout());
        viewHolder.add(innerViewHolder, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 10, 10));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(resetButton, OStrings.getString("PREFERENCES_BUTTON_RESET")); // NOI18N
        jPanel2.add(resetButton);

        org.openide.awt.Mnemonics.setLocalizedText(undoButton, OStrings.getString("PREFERENCES_BUTTON_UNDO")); // NOI18N
        jPanel2.add(undoButton);

        jPanel1.add(jPanel2, java.awt.BorderLayout.EAST);

        viewHolder.add(jPanel1, java.awt.BorderLayout.SOUTH);

        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.lightGray));
        setLayout(new java.awt.BorderLayout());

        mainSplitPane.setBorder(null);
        mainSplitPane.setDividerSize(0);

        leftPanel.setBackground(availablePrefsTree.getBackground());
        leftPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, java.awt.Color.lightGray));
        leftPanel.setLayout(new java.awt.BorderLayout());

        searchPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 3, 5));
        searchPanel.setOpaque(false);
        searchPanel.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/omegat/gui/resources/appbar.magnify.png"))); // NOI18N
        jLabel2.setLabelFor(searchTextField);
        searchPanel.add(jLabel2, java.awt.BorderLayout.WEST);
        searchPanel.add(searchTextField, java.awt.BorderLayout.CENTER);

        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/omegat/gui/resources/clear-button.png"))); // NOI18N
        clearButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        clearButton.setBorderPainted(false);
        clearButton.setContentAreaFilled(false);
        clearButton.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/org/omegat/gui/resources/clear-button-disabled.png"))); // NOI18N
        clearButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/omegat/gui/resources/clear-button-pressed.png"))); // NOI18N
        searchPanel.add(clearButton, java.awt.BorderLayout.EAST);

        leftPanel.add(searchPanel, java.awt.BorderLayout.NORTH);

        availablePrefsScrollPane.setBorder(null);
        availablePrefsScrollPane.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        availablePrefsTree.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
        availablePrefsTree.setRootVisible(false);
        availablePrefsTree.setShowsRootHandles(true);
        availablePrefsScrollPane.setViewportView(availablePrefsTree);

        leftPanel.add(availablePrefsScrollPane, java.awt.BorderLayout.CENTER);

        mainSplitPane.setLeftComponent(leftPanel);

        selectedPrefsScrollPane.setBorder(null);
        selectedPrefsScrollPane.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        selectedPrefsPlaceholderPanel.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(OStrings.getString("PREFERENCES_EMPTY_SELECTION_PLACEHOLDER")); // NOI18N
        jLabel1.setEnabled(false);
        selectedPrefsPlaceholderPanel.add(jLabel1, java.awt.BorderLayout.CENTER);

        selectedPrefsScrollPane.setViewportView(selectedPrefsPlaceholderPanel);

        mainSplitPane.setRightComponent(selectedPrefsScrollPane);

        add(mainSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JScrollPane availablePrefsScrollPane;
    javax.swing.JTree availablePrefsTree;
    javax.swing.JButton clearButton;
    org.omegat.util.gui.ReasonablySizedPanel innerViewHolder;
    javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    javax.swing.JPanel leftPanel;
    javax.swing.JSplitPane mainSplitPane;
    public javax.swing.JButton resetButton;
    private javax.swing.JPanel searchPanel;
    javax.swing.JTextField searchTextField;
    javax.swing.JPanel selectedPrefsPlaceholderPanel;
    javax.swing.JScrollPane selectedPrefsScrollPane;
    public javax.swing.JButton undoButton;
    javax.swing.JPanel viewHolder;
    // End of variables declaration//GEN-END:variables
}
