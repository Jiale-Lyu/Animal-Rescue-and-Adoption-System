
package ui.Adpoter;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Animal.Animal;
import model.EcoSystem.EcoSystem;
import model.Enterprise.AdoptionEnterprise;
import model.Enterprise.AnimalShelterEnterprise;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.AdopterOrganization;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import model.WorkQueue.AdoptionRequest;
import model.WorkQueue.BTWorkRequest;
import model.WorkQueue.MedCareRequest;
import model.WorkQueue.PharmacistWorkRequest;
import model.WorkQueue.WorkRequest;

/**
 *
 * @author fanyesun
 */
public class AdopterWorkArea extends javax.swing.JPanel {

    private JPanel workArea;
    private Network network;

    private AdoptionEnterprise enterprise;
    private AdopterOrganization organization;


    private EcoSystem ecosystem;
    private UserAccount userAccount;
    

     //Creates new AdopterWorkArea
    public AdopterWorkArea(JPanel userProcessContainer, UserAccount account, AdopterOrganization organization, AdoptionEnterprise enterprise, Network network, EcoSystem ecosystem) {
        initComponents();
        
        this.workArea = userProcessContainer;
        this.ecosystem = ecosystem;
        this.organization = organization;
        this.userAccount = account;
        this.network = network;
        this.enterprise = enterprise;


        //create status
        String getStatus = userAccount.getWorkQueue().getWorkRequestList().get(0).getStatus();
        txtAuthorizationStatus.setText(getStatus);
        
        if (!txtAuthorizationStatus.getText().equalsIgnoreCase("Approved")){
            hideInfo();
            return;
        }
        
        populateAnimalTable();
        populateRequestTable();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAuthorizationStatus = new javax.swing.JLabel();
        txtAuthorizationStatus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimalList = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblAnimalSelection = new javax.swing.JLabel();
        btnViewDetails = new javax.swing.JButton();
        btnSendRequest = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblAdoptionRequest = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAdoptionRequests = new javax.swing.JTable();

        setBackground(new java.awt.Color(155, 209, 249));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAuthorizationStatus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblAuthorizationStatus.setText("Authorization Status:");
        add(lblAuthorizationStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));
        add(txtAuthorizationStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 163, -1));

        tblAnimalList.setBackground(new java.awt.Color(204, 204, 204));
        tblAnimalList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Sex", "Area", "Manager", "Animal Shelter"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAnimalList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 890, 150));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 74, 659, -1));

        lblAnimalSelection.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblAnimalSelection.setText("Animal Selection");
        add(lblAnimalSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 104, -1, -1));

        btnViewDetails.setBackground(new java.awt.Color(102, 102, 102));
        btnViewDetails.setForeground(new java.awt.Color(238, 238, 238));
        btnViewDetails.setText("View");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });
        add(btnViewDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, -1, -1));

        btnSendRequest.setBackground(new java.awt.Color(102, 102, 102));
        btnSendRequest.setForeground(new java.awt.Color(238, 238, 238));
        btnSendRequest.setText("Adopt");
        btnSendRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRequestActionPerformed(evt);
            }
        });
        add(btnSendRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 318, 659, -1));

        lblAdoptionRequest.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblAdoptionRequest.setText("Your Adoption Request");
        add(lblAdoptionRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 348, -1, -1));

        tblAdoptionRequests.setBackground(new java.awt.Color(204, 204, 204));
        tblAdoptionRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Manager", "Enterprise", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAdoptionRequests);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 890, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRequestActionPerformed

        int optionChosen = tblAnimalList.getSelectedRow();

        if (optionChosen >= 0) {
            
            Animal animalChosen = (Animal) tblAnimalList.getValueAt(optionChosen, 0);
            
            for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
                if (request.getAnimal() == animalChosen){
                    JOptionPane.showMessageDialog(this, "Your have already sent requst for this animal.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            
            AdoptionRequest request = new AdoptionRequest();
            request.setMessage("Adoption Request");
            request.setAnimal(animalChosen);
            request.setSender(userAccount);
            request.setStatus("Pending Review");
            //sent adoption requirement
            network.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(this, "Adoption request has been sent.","Information",JOptionPane.INFORMATION_MESSAGE);
            populateRequestTable();
            
        } else {
            JOptionPane.showMessageDialog(this, "Please choose first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
                
        
    }//GEN-LAST:event_btnSendRequestActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed

        int optionChosen = tblAnimalList.getSelectedRow();
        
        if (optionChosen >= 0) {
            Animal selectedAnimal = (Animal) tblAnimalList.getValueAt(optionChosen, 0);
            //read animal detail
            JPanel viewAnimalDetailJPanel = new ViewAnimalDetailJPanel(workArea, selectedAnimal);
            workArea.add("viewAnimalDetailJPanel", viewAnimalDetailJPanel);
            CardLayout layout = (CardLayout) workArea.getLayout();
            layout.next(workArea);
            
        } else {
            JOptionPane.showMessageDialog(this, "Please choose first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        

    }//GEN-LAST:event_btnViewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendRequest;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAdoptionRequest;
    private javax.swing.JLabel lblAnimalSelection;
    private javax.swing.JLabel lblAuthorizationStatus;
    private javax.swing.JTable tblAdoptionRequests;
    private javax.swing.JTable tblAnimalList;
    private javax.swing.JTextField txtAuthorizationStatus;
    // End of variables declaration//GEN-END:variables

    private void hideInfo() {
        jSeparator1.setVisible(false);
        lblAnimalSelection.setVisible(false);
        jScrollPane1.setVisible(false);
        tblAnimalList.setVisible(false);
        btnSendRequest.setVisible(false);
        btnViewDetails.setVisible(false);
        jSeparator2.setVisible(false);
        lblAdoptionRequest.setVisible(false);
        jScrollPane2.setVisible(false);
        tblAdoptionRequests.setVisible(false);
    }

    private void populateAnimalTable() {

        DefaultTableModel model = (DefaultTableModel) tblAnimalList.getModel();
        model.setRowCount(0);
        

        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e instanceof AnimalShelterEnterprise){
                for (Animal animal : ((AnimalShelterEnterprise) e).getAnimalDirectory().getAnimalList()){
                    if (animal.getAdoptor() == null && animal.getManager() != null){
                        ArrayList<WorkRequest> list = new ArrayList<WorkRequest>();
                        for (WorkRequest beg : animal.getWorkQueue().getWorkRequestList()){
                            //request
                            if ((beg instanceof MedCareRequest && !beg.getStatus().equalsIgnoreCase("Completed"))
                                    || (beg instanceof PharmacistWorkRequest && !beg.getStatus().equalsIgnoreCase("Completed"))
                                    || (beg instanceof BTWorkRequest && !beg.getStatus().equalsIgnoreCase("Completed"))){
                                list.add(beg);
                            }
                        }
                        if(list.isEmpty()){
                            //create new row
                        Object[] table = new Object[5];
                            table[4] = animal.getManager().getEnterprise();
                            table[3] = animal.getManager();
                            table[2] = animal.getArea();
                            table[1] = animal.getSex();
                            table[0] = animal;





                        model.addRow(table);
                            
                        }
                       
                    }        
                }
            }
        }     
    }

    private void populateRequestTable() {

        DefaultTableModel model = (DefaultTableModel) tblAdoptionRequests.getModel();
        model.setRowCount(0);
        
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if (request instanceof AdoptionRequest){
                
                Object[] table = new Object[5];
                table[4] = request.getStatus();
                table[3] = request.getAnimal().getManager().getEnterprise();
                table[2] = request.getAnimal().getManager();
                table[1] = request.getAnimal().getName();
                table[0] = request.getAnimal().getId();




                
                model.addRow(table);
            }
        }
    }
}

