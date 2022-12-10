
package ui.AdministrativeRole;

import javax.swing.table.DefaultTableModel;
import model.EcoSystem.EcoSystem;
import model.Network.Network;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author fanyesun
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {
    //create new Jpanel
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;

    //
    //create new class network
    public ManageNetworkJPanel(JPanel jPanel, EcoSystem system) {
        initComponents();
        this.userProcessContainer = jPanel;
        this.ecoSystem = system;
        
        refreshNetworkList();
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNetwork = new javax.swing.JTable();
        lblEmployeeList = new javax.swing.JLabel();
        lblOrganizationList1 = new javax.swing.JLabel();
        lblEmployeeName = new javax.swing.JLabel();
        txtNetworkName = new javax.swing.JTextField();
        btnCreateNetwork = new javax.swing.JButton();

        setBackground(new java.awt.Color(224, 227, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_network.png"))); // NOI18N
        lblTitle.setText("Manage Network");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        btnBack.setBackground(new java.awt.Color(245, 245, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        tblNetwork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNetwork);
        if (tblNetwork.getColumnModel().getColumnCount() > 0) {
            tblNetwork.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 890, 250));

        lblEmployeeList.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmployeeList.setText("Network List:");
        add(lblEmployeeList, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 88, -1, -1));

        lblOrganizationList1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOrganizationList1.setText("New Network:");
        add(lblOrganizationList1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));

        lblEmployeeName.setText("Name:");
        add(lblEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 445, -1, -1));
        add(txtNetworkName, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 360, -1));

        btnCreateNetwork.setBackground(new java.awt.Color(245, 245, 255));
        btnCreateNetwork.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnCreateNetwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_add.png"))); // NOI18N
        btnCreateNetwork.setText("Create Network");
        btnCreateNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNetworkActionPerformed(evt);
            }
        });
        add(btnCreateNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNetworkActionPerformed
        //create new btnCreateNetworkActionPerformed
        String name = txtNetworkName.getText();
                
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Network name cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //judge if ecosystem can get network list
        if (ecoSystem.getNetworkList().isEmpty() || ecoSystem.nameIsUnique(name)){
            Network newNetwork = ecoSystem.createNetwork(name);
            txtNetworkName.setText("");
            //update network list
            refreshNetworkList();
            JOptionPane.showMessageDialog(this, "New network added", "Information", JOptionPane.INFORMATION_MESSAGE);
        } 
        else {
            JOptionPane.showMessageDialog(this, "Network existed", "Warning", JOptionPane.WARNING_MESSAGE);
        }

        
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        //remove userProcessContainer
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }

    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateNetwork;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmployeeList;
    private javax.swing.JLabel lblEmployeeName;
    private javax.swing.JLabel lblOrganizationList1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblNetwork;
    private javax.swing.JTextField txtNetworkName;

    private void refreshNetworkList() {

        DefaultTableModel model = (DefaultTableModel)tblNetwork.getModel();
        model.setRowCount(0);

        for (Network n : ecoSystem.getNetworkList()){

            Object objects[] = new Object[1];
            objects[0] = n;
            //add new row
            model.addRow(objects);
        }
        
    }
}
