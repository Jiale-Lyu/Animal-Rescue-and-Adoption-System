/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AnimalManagerRole;

import java.awt.CardLayout;
import java.awt.Image;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Animal.Animal;
import model.Enterprise.AnimalShelterEnterprise;
import model.Network.Network;
import model.Organization.AnimalManagementOrganization;
import model.UserAccount.UserAccount;
import model.WorkQueue.MedCareRequest;
import model.WorkQueue.WorkRequest;

/**
 *
 * @author Jiale Lyu
 */
public class ViewOngingAnimalJPanel extends javax.swing.JPanel {

    private final JPanel userProcessContainer;
    private final UserAccount userAccount;
    private final AnimalShelterEnterprise enterprise;
    private final Network network;
    private final Animal animal;
    
    public ViewOngingAnimalJPanel(JPanel userProcessContainer, UserAccount account, Animal animal, AnimalShelterEnterprise enterprise, Network network) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.animal = animal;
        
        showAnimalDetails();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        txtAnimalName = new javax.swing.JTextField();
        lblMessage5 = new javax.swing.JLabel();
        txtAnimalArea = new javax.swing.JTextField();
        lblMessage6 = new javax.swing.JLabel();
        txtAnimalSex = new javax.swing.JTextField();
        lblMessage7 = new javax.swing.JLabel();
        txtAnimalWeight = new javax.swing.JTextField();
        lblMessage8 = new javax.swing.JLabel();
        txtAnimalMessageFromBehaviorTharapipst = new javax.swing.JTextField();
        lblMessage9 = new javax.swing.JLabel();
        txtAnimalMessageFromVet = new javax.swing.JTextField();
        lblMessage10 = new javax.swing.JLabel();
        txtAnimalMessageFromPharmacy = new javax.swing.JTextField();
        lblMessage11 = new javax.swing.JLabel();
        btnAnimalManagerRequestMedicalCare = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimalManagerWorkArea = new javax.swing.JTable();
        lblMessage13 = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblMedicalCareMessage = new javax.swing.JLabel();
        txtSendMedicalCareMessage = new javax.swing.JTextField();
        viewAdoptionRequestJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(155, 209, 249));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("On Going Animal");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        txtAnimalName.setEnabled(false);
        add(txtAnimalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 140, -1));

        lblMessage5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage5.setText("Name:");
        add(lblMessage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 50, -1));

        txtAnimalArea.setEnabled(false);
        add(txtAnimalArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 140, -1));

        lblMessage6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage6.setText("Area:");
        add(lblMessage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 50, -1));

        txtAnimalSex.setEnabled(false);
        add(txtAnimalSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 140, -1));

        lblMessage7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage7.setText("Sex:");
        add(lblMessage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 50, -1));

        txtAnimalWeight.setEnabled(false);
        add(txtAnimalWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 140, -1));

        lblMessage8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage8.setText("Weight:");
        add(lblMessage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 50, -1));

        txtAnimalMessageFromBehaviorTharapipst.setEnabled(false);
        add(txtAnimalMessageFromBehaviorTharapipst, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 200, 40));

        lblMessage9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage9.setText("Behavior Check:");
        add(lblMessage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 120, -1));

        txtAnimalMessageFromVet.setEnabled(false);
        add(txtAnimalMessageFromVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 200, 40));

        lblMessage10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage10.setText("Vet Feedback:");
        add(lblMessage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 120, -1));

        txtAnimalMessageFromPharmacy.setEnabled(false);
        add(txtAnimalMessageFromPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 200, 40));

        lblMessage11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage11.setText("Pharmacy Feedback:");
        add(lblMessage11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 195, 120, -1));

        btnAnimalManagerRequestMedicalCare.setText("Request Medical Care");
        btnAnimalManagerRequestMedicalCare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimalManagerRequestMedicalCareActionPerformed(evt);
            }
        });
        add(btnAnimalManagerRequestMedicalCare, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, 40));

        tblAnimalManagerWorkArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Recipient", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAnimalManagerWorkArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 890, 110));

        lblMessage13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage13.setText("Medical Care Status:");
        add(lblMessage13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, 30));

        lblPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_noimage.png"))); // NOI18N
        add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 200, 200));

        lblMedicalCareMessage.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMedicalCareMessage.setText("Message:");
        add(lblMedicalCareMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, 40));
        add(txtSendMedicalCareMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 400, 40));

        viewAdoptionRequestJButton.setBackground(new java.awt.Color(0, 102, 0));
        viewAdoptionRequestJButton.setForeground(new java.awt.Color(233, 233, 233));
        viewAdoptionRequestJButton.setText("View Adoption Request");
        viewAdoptionRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAdoptionRequestJButtonActionPerformed(evt);
            }
        });
        add(viewAdoptionRequestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, 178, 40));
    }// </editor-fold>//GEN-END:initComponents
//go back to the previous page
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed


        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManagerWorkArea", new ManageAnimalJPanel(userProcessContainer, userAccount, (AnimalManagementOrganization) userAccount.getOrgainization(), enterprise, network, network.getEcosystem()));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAnimalManagerRequestMedicalCareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimalManagerRequestMedicalCareActionPerformed

        String requestVetMessage = txtSendMedicalCareMessage.getText();
        if(requestVetMessage.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter something to send.","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        //initialize a medical request
        MedCareRequest request = new MedCareRequest();
        request.setMessage(requestVetMessage);
        request.setSender(userAccount);
        request.setStatus("Pending for Vet");
        request.setAnimal(animal);
        //add request into work queue
        network.getWorkQueue().getWorkRequestList().add(request);
        animal.getWorkQueue().getWorkRequestList().add(request);
        
        JOptionPane.showMessageDialog(this, "Medical Request sent.", "Information",JOptionPane.INFORMATION_MESSAGE);
        populateTable();
        txtSendMedicalCareMessage.setText("");
        
    }//GEN-LAST:event_btnAnimalManagerRequestMedicalCareActionPerformed
//view adoption request
    private void viewAdoptionRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAdoptionRequestJButtonActionPerformed
        // TODO add your handling code here:
        AdoptionRequestJPanel adoptionRequestJPanel = new AdoptionRequestJPanel(userProcessContainer, userAccount, animal, enterprise, network);
        userProcessContainer.add("adoptionRequestJPanel", adoptionRequestJPanel);

        CardLayout layout = (CardLayout) (userProcessContainer.getLayout());
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewAdoptionRequestJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnimalManagerRequestMedicalCare;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMedicalCareMessage;
    private javax.swing.JLabel lblMessage10;
    private javax.swing.JLabel lblMessage11;
    private javax.swing.JLabel lblMessage13;
    private javax.swing.JLabel lblMessage5;
    private javax.swing.JLabel lblMessage6;
    private javax.swing.JLabel lblMessage7;
    private javax.swing.JLabel lblMessage8;
    private javax.swing.JLabel lblMessage9;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblAnimalManagerWorkArea;
    private javax.swing.JTextField txtAnimalArea;
    private javax.swing.JTextField txtAnimalMessageFromBehaviorTharapipst;
    private javax.swing.JTextField txtAnimalMessageFromPharmacy;
    private javax.swing.JTextField txtAnimalMessageFromVet;
    private javax.swing.JTextField txtAnimalName;
    private javax.swing.JTextField txtAnimalSex;
    private javax.swing.JTextField txtAnimalWeight;
    private javax.swing.JTextField txtSendMedicalCareMessage;
    private javax.swing.JButton viewAdoptionRequestJButton;
    // End of variables declaration//GEN-END:variables

    private void showAnimalDetails() {

        txtAnimalName.setText(animal.getName());
        txtAnimalArea.setText(animal.getArea());
        txtAnimalSex.setText(animal.getSex());
        txtAnimalWeight.setText(animal.getWeight());
        txtAnimalMessageFromBehaviorTharapipst.setText(animal.getBaviorCheckMessage());
        txtAnimalMessageFromPharmacy.setText(animal.getPharmacyMessage());
        txtAnimalMessageFromVet.setText(animal.getVetMessage());
        
        if (animal.getPhoto()!=null){
            String path = Paths.get(animal.getPhoto()).toAbsolutePath().toString();
            ImageIcon icon = seticon(path, null);
            lblPhoto.setIcon(icon);
        }

        populateTable();
        
    }
    
    public ImageIcon seticon(String m, byte[] image){
        
        ImageIcon i = null;
        
        if (m != null) {
            i = new ImageIcon(m);
        } else {
            i = new ImageIcon(image);
        }

        Image img1 = i.getImage();
        Image img2 = img1.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon img = new ImageIcon(img2);
        return img;
    }
    

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblAnimalManagerWorkArea.getModel();
        model.setRowCount(0);
        
        if (!animal.getWorkQueue().getWorkRequestList().isEmpty()){
            for (WorkRequest request : animal.getWorkQueue().getWorkRequestList()){
                if (request instanceof MedCareRequest){
                    Object[] row = new Object[4];
                    row[0] = request;
                    row[1] = animal.getManager();
                    row[2] = request.getReceiver() == null ? null : request.getReceiver();
                    row[3] = request.getStatus();
                    model.addRow(row);
                }   
            }
        }
                
    }
}
