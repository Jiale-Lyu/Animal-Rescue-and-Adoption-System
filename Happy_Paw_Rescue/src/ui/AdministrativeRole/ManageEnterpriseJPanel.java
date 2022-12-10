/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.EcoSystem.EcoSystem;
import model.Enterprise.Enterprise;
import model.Network.Network;

/**
 *
 * @author fanyesun
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    
    private Network selectedNetwork;

    //create ManageOrganizationJPanel
    public ManageEnterpriseJPanel(JPanel jPanel, EcoSystem system) {
        initComponents();
        this.userProcessContainer = jPanel;
        this.ecoSystem = system;
        
        populateNetworkCombo();

    }
    

    @SuppressWarnings("unchecked")
    //create class init Components
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblSelectNetwork = new javax.swing.JLabel();
        lblSelectEnterpriseType = new javax.swing.JLabel();
        cmbNetworkList = new javax.swing.JComboBox();
        lblAdd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterprises = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        cmbEnterprise = new javax.swing.JComboBox();
        lblEnterpriseList = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblEnterpriseName = new javax.swing.JLabel();
        //set background color
        setBackground(new java.awt.Color(224, 254, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        //set background color
        btnBack.setBackground(new java.awt.Color(245, 255, 254));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_enterprise.png"))); // NOI18N
        lblTitle.setText("Manage Enterprise");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));
        lblSelectNetwork.setVisible(false);
        lblSelectNetwork.setText("Select Network:");
        add(lblSelectNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));
        cmbNetworkList.setVisible(false);
        cmbNetworkList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNetworkList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkListActionPerformed(evt);
            }
        });
        add(cmbNetworkList, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 231, -1));

        tblEnterprises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Type", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEnterprises);
        if (tblEnterprises.getColumnModel().getColumnCount() > 0) {
            tblEnterprises.getColumnModel().getColumn(0).setResizable(false);
            tblEnterprises.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 890, 250));

        cmbEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterpriseActionPerformed(evt);
            }
        });
        add(cmbEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 250, -1));

        lblEnterpriseList.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEnterpriseList.setText("Enterprise List:");
        add(lblEnterpriseList, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        lblAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAdd.setText("Add Enterprise:");
        add(lblAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));

        lblSelectEnterpriseType.setText("Select Enterprise Type:");
        add(lblSelectEnterpriseType, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, -1, -1));

        btnAdd.setBackground(new java.awt.Color(245, 245, 255));
        btnAdd.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_add.png"))); // NOI18N
        btnAdd.setText("Create Enterprise");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 500, 170, -1));

        txtName.setBackground(new java.awt.Color(245, 245, 255));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, 250, -1));

        lblEnterpriseName.setText("Enterprise Name:");
        add(lblEnterpriseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String name = txtName.getText();    
        
        if (selectedNetwork != null) {
            if (!name.isEmpty()) {
                if (selectedNetwork.getEnterpriseDirectory().nameIsUnique(name)) {
                    Enterprise.Type type = (Enterprise.Type) cmbEnterprise.getSelectedItem();
                    selectedNetwork.getEnterpriseDirectory().createAndAddEnterprise(name, type);
                    JOptionPane.showMessageDialog(this, "new Enterprise added", "Information", JOptionPane.INFORMATION_MESSAGE);
                    txtName.setText("");
                    populateTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Enterprise already existed", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Name cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Network cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
        }
                
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }

    private void cmbEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterpriseActionPerformed
        // TODO add your handling code here:
    }

    private void cmbNetworkListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkListActionPerformed
        
        selectedNetwork = (Network) cmbNetworkList.getSelectedItem();
        populateTable();
        populateEnterpriseCombo();

    }

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }

    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox cmbEnterprise;
    private javax.swing.JComboBox cmbNetworkList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblEnterpriseList;
    private javax.swing.JLabel lblEnterpriseName;
    private javax.swing.JLabel lblSelectEnterpriseType;
    private javax.swing.JLabel lblSelectNetwork;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEnterprises;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void populateNetworkCombo() {

        cmbNetworkList.removeAllItems();
        
        if (!ecoSystem.getNetworkList().isEmpty()){
            for (Network n : ecoSystem.getNetworkList()){
                cmbNetworkList.addItem(n);
            }
        }
    }
    
    private void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) tblEnterprises.getModel();
        model.setRowCount(0);
        
        
        if (selectedNetwork != null){
            
            for (Enterprise e : selectedNetwork.getEnterpriseDirectory().getEnterpriseList()){
                Object[] row = new Object[2];
                row[0] = e.getType();
                row[1] = e;
                model.addRow(row);
            }
        }
    }

    private void populateEnterpriseCombo() {
        cmbEnterprise.removeAllItems();
        
        for (Enterprise.Type type : Enterprise.Type.values()){
                cmbEnterprise.addItem(type);      
        }
        
    }
}
