/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Vet;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.CardLayout;
import model.Enterprise.Enterprise;
import javax.swing.table.DefaultTableModel;
import model.Network.Network;
import model.Enterprise.MedicalCareEnterprise;
import model.EcoSystem.EcoSystem;
import model.UserAccount.UserAccount;
import model.WorkQueue.MedCareRequest;
import model.Organization.VetOrganization;
import model.WorkQueue.WorkRequest;
import model.Animal.Animal;
import model.Animal.AnimalDirectory;


/**
 *
 * @author Yifei Chen
 */
public class VetWorkArea extends javax.swing.JPanel {

    private final JPanel workArea;
    private final MedicalCareEnterprise enterprise;
    private final Network network;
    private final VetOrganization vetOrganization;
    private final UserAccount userAccount;
    private final EcoSystem ecoSystem;
    Animal animal;
    AnimalDirectory animalDirectory;

    
    // Creates new form VolunteerWorkArea

    public VetWorkArea(JPanel userProcessContainer, UserAccount account,
            
            VetOrganization vetOrganization, MedicalCareEnterprise enterprise, Network network, EcoSystem ecoSystem) {
        
        initComponents();
        
        this.workArea = userProcessContainer;
        this.userAccount = account;
        this.network = network;
        this.animalDirectory = animalDirectory;
        this.vetOrganization = vetOrganization;
        this.enterprise = enterprise;
 
        
        this.ecoSystem = ecoSystem;
        
        //traverse

        for (Network net : ecoSystem.getNetworkList()) {
            
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                
                if (ent.equals(enterprise)) {
                    
                    network = net;
                }
            }
        }

        populateRequestTable();
    }

    public void populateRequestTable() {
        
        //populate request table
        
        DefaultTableModel model = (DefaultTableModel) tblWorkRequests.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest request : network.getWorkQueue().getWorkRequestList()) {
            
            if (request instanceof MedCareRequest) {
                
                Object[] row = new Object[model.getColumnCount()];
                
                //get information 
                row[0] = request;
                row[1] = request.getAnimal().getId();
                row[2] = request.getAnimal().getName();
                row[3] = request.getSender();
                row[4] = request.getReceiver() == null ? null : request.getReceiver();
               
                row[5] = request.getStatus();
                
                
                String result = ((MedCareRequest) request).getVetResult();
                
                
                row[6] = result == null ? "Waiting" : result;
                
                model.addRow(row);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequests = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        btnAssignToMe = new javax.swing.JButton();
        btnViewDetial = new javax.swing.JButton();
        icon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(155, 209, 249));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Animal ID", "Animal Name", "Sender", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 890, 350));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Vet Work Area");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        btnAssignToMe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_assign.png"))); // NOI18N
        btnAssignToMe.setText("Assign To Me");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });
        add(btnAssignToMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, 150, 40));

        btnViewDetial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_view.PNG"))); // NOI18N
        btnViewDetial.setText("View Detail");
        btnViewDetial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetialActionPerformed(evt);
            }
        });
        add(btnViewDetial, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, 150, 40));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_vet.png"))); // NOI18N
        add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblWorkRequests.getSelectedRow();
        
        //if select a row
        if (selectedRow >= 0) {
            
            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
            
            if (request.getStatus().equalsIgnoreCase("Processed")) {
                
                JOptionPane.showMessageDialog(this, "Request has already been processed.","Warning",
                        
                        JOptionPane.WARNING_MESSAGE);
                
                return;
                
                //if the request has been completed
                
            } else if (request.getStatus().equalsIgnoreCase("Completed")) {
                
                JOptionPane.showMessageDialog(this, "Request has already been completed.", "Thank you!", 
                        
                        JOptionPane.INFORMATION_MESSAGE);
                
                return;
                
            } else {
                
                request.setReceiver(userAccount);
                
                request.setStatus("Processed");
                
                populateRequestTable();
                
      
            }

            //if no request selected
        } else {
            JOptionPane.showMessageDialog(this, "Please select a request.","Warning",
                    
                    JOptionPane.WARNING_MESSAGE);
            
            return;
            
        }


    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnViewDetialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetialActionPerformed
        
        int selectedRow = tblWorkRequests.getSelectedRow();

        //if no row selected
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "You should select a row first","Warning",
                    
                    JOptionPane.WARNING_MESSAGE);
            
            return;
            
        }
        
        WorkRequest wr = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
        
         if (wr.getReceiver() != userAccount) {
             //if the request has been assigned
             
            JOptionPane.showMessageDialog(this, "This request is not assigned to you.","Warning",
                    
                    JOptionPane.WARNING_MESSAGE);
            
            return;
           
        }
        MedCareRequest request = (MedCareRequest) tblWorkRequests.getValueAt(selectedRow, 0);
        
        if (request.getStatus().equalsIgnoreCase("Completed")) {
            
            //if the selected request is completed
            
            JOptionPane.showMessageDialog(this, "Request has already been completed.","Warning",
                    
                    JOptionPane.WARNING_MESSAGE);
            
            return;
        }

        VetAnimalDetail vetAnimalDetailJPanel = new VetAnimalDetail(workArea, request, userAccount, 
                
                vetOrganization, enterprise, animal, animalDirectory, ecoSystem);
        
            
            workArea.add("vetAnimalDetailJPanel", vetAnimalDetailJPanel);
            
            CardLayout layout = (CardLayout) workArea.getLayout();
            
            layout.next(workArea);
    }//GEN-LAST:event_btnViewDetialActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnViewDetial;
    private javax.swing.JLabel icon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables
}
