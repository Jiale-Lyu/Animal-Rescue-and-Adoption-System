/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.VolunteerManager;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.EcoSystem.EcoSystem;
import model.Enterprise.VolunteerEnterprise;
import model.Network.Network;
import model.Organization.VolunteerManagementOrganization;
import model.Role.VolunteerRole;
import model.UserAccount.UserAccount;
import model.WorkQueue.VolunteerRequest;
import model.WorkQueue.WorkRequest;

/**
 *
 * @author YifeiChen
 */
public class VolunteerManagerWorkArea extends javax.swing.JPanel {

    private final JPanel workArea;
    private final VolunteerManagementOrganization organization;
    private final VolunteerEnterprise enterprise;
    private final Network network;
    private final EcoSystem ecosystem;
    private final UserAccount userAccount;    
    
    //Creates new form VolunteerManagerWorkArea 
    public VolunteerManagerWorkArea(JPanel userProcessContainer, UserAccount account, VolunteerManagementOrganization organization, VolunteerEnterprise enterprise, Network network, EcoSystem ecosystem) {
        initComponents();
        
        this.workArea = userProcessContainer;
        this.network = network;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
        
        this.ecosystem = ecosystem;
        
        //pupolate combo
        populateCombo();
        
        //populate table
        populateTable();
        
        
    }



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequests = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        lblVolunteer = new javax.swing.JLabel();
        cmbVolunteer = new javax.swing.JComboBox();
        lblRequestOrigin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(155, 209, 249));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Assign Volunteer");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        tblWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Animal Shelter", "Volunteer Manager", "Volunteer Assigned", "Enterprise", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequests);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 890, 310));

        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, -1, 30));

        lblVolunteer.setText("Volunteer:");
        add(lblVolunteer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, 30));

        cmbVolunteer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbVolunteer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 420, 30));

        lblRequestOrigin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_volunteer.png"))); // NOI18N
        add(lblRequestOrigin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        UserAccount selectedVolunteer = (UserAccount) cmbVolunteer.getSelectedItem();
        
        int selectedRow = tblWorkRequests.getSelectedRow();
        
        //if no row selected
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "You should choose a request first please", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        VolunteerRequest selectedRequest = (VolunteerRequest) tblWorkRequests.getValueAt(selectedRow, 0);
        
        //if the selectedrequest has been completed
        
        if (selectedRequest.getStatus().equals("Completed")) {
            JOptionPane.showMessageDialog(this, "This Request already completed. Please select another one.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        //if selected request has assigned a volunteer
        
        if (selectedRequest.getStatus().equals("Assigned")) {
            JOptionPane.showMessageDialog(this, "This request has assigned a volunteer. Please select another request.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        for (WorkRequest request : network.getWorkQueue().getWorkRequestList()){
            
            if (request instanceof VolunteerRequest) {
                
                VolunteerRequest vr = (VolunteerRequest)request;
                
                if (vr.getAssignedVolunteer() == selectedVolunteer 
                        
                && !request.getStatus().equals("Completed")){
                    
                JOptionPane.showMessageDialog(this, "This volunteer is busy, Please select another one.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
                }
            }
        }

        selectedVolunteer.getWorkQueue().getWorkRequestList().add(selectedRequest);
        selectedRequest.setReceiver(userAccount);
        selectedRequest.setStatus("Assigned");
        selectedRequest.setAssignedVolunteer(selectedVolunteer);
        
        JOptionPane.showMessageDialog(this, "Volunteer Assigned","Information",JOptionPane.INFORMATION_MESSAGE);
        populateTable();
                         
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JComboBox cmbVolunteer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRequestOrigin;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVolunteer;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables

    
    //populate the table
    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblWorkRequests.getModel();
        model.setRowCount(0);
        
        //traverse
        for (WorkRequest request : network.getWorkQueue().getWorkRequestList()){
            
            if (request instanceof VolunteerRequest){
                
                Object[] row = new Object[7];
                row[0] = request;
                row[1] = request.getSender();
                row[2] = request.getSender().getEnterprise();
                row[3] = request.getReceiver() == null ? null : request.getReceiver();
                row[4] = ((VolunteerRequest) request).getAssignedVolunteer();
                row[5] = request.getReceiver() == null ? null :request.getReceiver().getEnterprise();
                row[6] = request.getStatus();
                
                model.addRow(row);
            }
        }
        

    }

    //populate combo function
    private void populateCombo() {

        cmbVolunteer.removeAllItems();
        
        for (UserAccount ua : ecosystem.getUserAccountDirectory().getUserAccountList()) {
            
            if (ua.getRole() instanceof VolunteerRole && ua.getEnterprise() == enterprise) {
                
                cmbVolunteer.addItem(ua);
            }
        }
        
    }

}
