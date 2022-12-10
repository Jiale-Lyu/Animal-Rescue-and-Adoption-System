package ui.Vet;

import java.awt.CardLayout;
import java.awt.Image;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Network.Network;
import model.EcoSystem.EcoSystem;
import model.Enterprise.Enterprise;
import model.UserAccount.UserAccount;
import model.Animal.Animal;
import model.Animal.AnimalDirectory;
import model.Enterprise.MedicalCareEnterprise;
import model.Organization.TreatmentOrganization;
import model.Organization.VetOrganization;
import model.WorkQueue.MedCareRequest;

/**
 *
 * @author Yifei Chen
 */
public class VetAnimalDetail extends javax.swing.JPanel {

    private final UserAccount userAccount;
    private final VetOrganization vetOrganization;
    private final Enterprise enterprise;
    private final EcoSystem ecoSystem;
    private final AnimalDirectory animalDirectory;
    private TreatmentOrganization treatmentOrganization;
    Network network;
    private final JPanel workArea;
    MedCareRequest request;
    private final Animal animal;

    public VetAnimalDetail(JPanel workArea, MedCareRequest request, UserAccount userAccount, VetOrganization vetOrganization,
            Enterprise enterprise, Animal animal, AnimalDirectory animalDirectory, EcoSystem ecoSystem) {
        initComponents();

        this.workArea = workArea;
        this.request = request;
        this.userAccount = userAccount;
        this.vetOrganization = vetOrganization;
        this.enterprise = enterprise;
        this.animal = request.getAnimal();
        this.animalDirectory = animalDirectory;
        this.ecoSystem = ecoSystem;
        
        
        //traverse
        
        for (Network net : ecoSystem.getNetworkList()) {
            
            for (Enterprise e : net.getEnterpriseDirectory().getEnterpriseList()) {
                
                if (e.equals(enterprise)) {
                    
                    network = net;
                }
            }
        }

        getAnimalDetails();

    }

    private void getAnimalDetails() {
        //set text from animal
        
        txtAnimalSex.setText(animal.getSex());
        txtAnimalMessageFromVet.setText(animal.getVetMessage());
        txtAnimalName.setText(animal.getName());
        txtAnimalArea.setText(animal.getArea());
        txtAnimalMessageFromBehaviorTharapipst.setText(animal.getBaviorCheckMessage());
        txtAnimalWeight.setText(animal.getWeight());
        txtAnimalMessageFromPharmacy.setText(animal.getPharmacyMessage());
       
        
        //if upload photo
        if (animal.getPhoto()!=null){
            
            String path = Paths.get(animal.getPhoto()).toAbsolutePath().toString();
            
            ImageIcon icon = seticon(path, null);
            
            lblAnimalPhoto.setIcon(icon);
        }
        

    }
    
    //check image
    
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRequestBT = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnRequestPharmacy = new javax.swing.JButton();
        txtResults = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        lblMessage5 = new javax.swing.JLabel();
        txtAnimalName = new javax.swing.JTextField();
        txtAnimalArea = new javax.swing.JTextField();
        lblMessage6 = new javax.swing.JLabel();
        lblMessage7 = new javax.swing.JLabel();
        txtAnimalSex = new javax.swing.JTextField();
        lblMessage8 = new javax.swing.JLabel();
        txtAnimalWeight = new javax.swing.JTextField();
        lblMessage10 = new javax.swing.JLabel();
        txtAnimalMessageFromVet = new javax.swing.JTextField();
        lblMessage11 = new javax.swing.JLabel();
        txtAnimalMessageFromPharmacy = new javax.swing.JTextField();
        lblMessage9 = new javax.swing.JLabel();
        txtAnimalMessageFromBehaviorTharapipst = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblAnimalPhoto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(212, 238, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRequestBT.setText("Request Behavioral Therapy");
        btnRequestBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestBTActionPerformed(evt);
            }
        });
        add(btnRequestBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 250, 40));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Animal Detail");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        btnRequestPharmacy.setText("Request Pharmaceutical Therapy");
        btnRequestPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestPharmacyActionPerformed(evt);
            }
        });
        add(btnRequestPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 250, 40));
        add(txtResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 400, 40));

        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_reply.png"))); // NOI18N
        btnSubmit.setText("Submit Result");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, -1, 40));

        lblResult.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblResult.setText("Vet Message:");
        add(lblResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, 40));

        lblMessage5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage5.setText("Name:");
        add(lblMessage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 50, -1));

        txtAnimalName.setEnabled(false);
        add(txtAnimalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 150, -1));

        txtAnimalArea.setEnabled(false);
        add(txtAnimalArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 150, -1));

        lblMessage6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage6.setText("Area:");
        add(lblMessage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 50, -1));

        lblMessage7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage7.setText("Sex:");
        add(lblMessage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 50, -1));

        txtAnimalSex.setEnabled(false);
        add(txtAnimalSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 150, -1));

        lblMessage8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage8.setText("Weight:");
        add(lblMessage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 50, -1));

        txtAnimalWeight.setEnabled(false);
        add(txtAnimalWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 150, -1));

        lblMessage10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage10.setText("Vet:");
        add(lblMessage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 150, -1));

        txtAnimalMessageFromVet.setEnabled(false);
        add(txtAnimalMessageFromVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 217, -1));

        lblMessage11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage11.setText("Pharmacy Feedback:");
        add(lblMessage11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 150, -1));

        txtAnimalMessageFromPharmacy.setEnabled(false);
        add(txtAnimalMessageFromPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 217, -1));

        lblMessage9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage9.setText("Behavior Check:");
        add(lblMessage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 150, -1));

        txtAnimalMessageFromBehaviorTharapipst.setEnabled(false);
        add(txtAnimalMessageFromBehaviorTharapipst, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 217, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lblAnimalPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_noimage.png"))); // NOI18N
        add(lblAnimalPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 200, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestBTActionPerformed

        CardLayout layout = (CardLayout) workArea.getLayout();
        
        workArea.add("requestBehaviorTherapy", new RequestBT(workArea, request, userAccount,
                
                enterprise, animal, animalDirectory, ecoSystem));
        
        layout.next(workArea);
    }//GEN-LAST:event_btnRequestBTActionPerformed

    private void btnRequestPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestPharmacyActionPerformed

        CardLayout layout = (CardLayout) workArea.getLayout();
        
        workArea.add("requestPharmaceuticalTherapy", new RequestPharmacist(workArea, request, userAccount,
                
                enterprise, animal, animalDirectory, ecoSystem));
        
        layout.next(workArea);
    }//GEN-LAST:event_btnRequestPharmacyActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        //if message is empty
        if (txtResults.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "You should send something please.", 
                    "Information", JOptionPane.WARNING_MESSAGE);
            
        } else {
            
            // vet request
            animal.setVetMessage(txtResults.getText());
            
            request.setStatus("Completed");
            
            request.setVetResult(txtResults.getText());
            
            JOptionPane.showMessageDialog(this, "Vet Request has been completed!",
                    
                    "Thank you!", JOptionPane.INFORMATION_MESSAGE);
            
            txtAnimalMessageFromVet.setText(txtResults.getText());
            
            CardLayout layout = (CardLayout) workArea.getLayout();
            
            //add vetwork area
            
            workArea.add("VetWorkArea", new VetWorkArea(workArea, 
                    
                    userAccount,vetOrganization, (MedicalCareEnterprise) enterprise,network, ecoSystem));
            
            layout.next(workArea);
            

        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        workArea.remove(this);
        
        CardLayout layout = (CardLayout) workArea.getLayout();
        
        layout.previous(workArea);
        
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequestBT;
    private javax.swing.JButton btnRequestPharmacy;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblAnimalPhoto;
    private javax.swing.JLabel lblMessage10;
    private javax.swing.JLabel lblMessage11;
    private javax.swing.JLabel lblMessage5;
    private javax.swing.JLabel lblMessage6;
    private javax.swing.JLabel lblMessage7;
    private javax.swing.JLabel lblMessage8;
    private javax.swing.JLabel lblMessage9;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAnimalArea;
    private javax.swing.JTextField txtAnimalMessageFromBehaviorTharapipst;
    private javax.swing.JTextField txtAnimalMessageFromPharmacy;
    private javax.swing.JTextField txtAnimalMessageFromVet;
    private javax.swing.JTextField txtAnimalName;
    private javax.swing.JTextField txtAnimalSex;
    private javax.swing.JTextField txtAnimalWeight;
    private javax.swing.JTextField txtResults;
    // End of variables declaration//GEN-END:variables
}
