/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Adpoter;

import ui.AnimalManagerRole.*;
import ui.AnimalRegistorRole.*;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Animal.Animal;
import model.Animal.AnimalDirectory;
import model.Enterprise.AnimalShelterEnterprise;
import model.Network.Network;
import model.Organization.AnimalManagementOrganization;
import model.UserAccount.UserAccount;
import model.WorkQueue.MedCareRequest;
import model.WorkQueue.WorkRequest;

/**
 *
 * @author fanyesun
 */
public class ViewAnimalDetailJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Animal animal;

    //create new jpanel
    public ViewAnimalDetailJPanel(JPanel newContainer, Animal a) {
        initComponents();
        
        this.userProcessContainer = newContainer;
        this.animal = a;
        
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
        lblPhoto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 236, 236));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_view.PNG"))); // NOI18N
        lblTitle.setText(" Animal Detail");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        txtAnimalName.setEnabled(false);
        add(txtAnimalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 217, -1));

        lblMessage5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage5.setText("Name:");
        add(lblMessage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 120, -1));

        txtAnimalArea.setEnabled(false);
        add(txtAnimalArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 217, -1));

        lblMessage6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage6.setText("Area:");
        add(lblMessage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 120, -1));

        txtAnimalSex.setEnabled(false);
        add(txtAnimalSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 217, -1));

        lblMessage7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage7.setText("Sex:");
        add(lblMessage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 120, -1));

        txtAnimalWeight.setEnabled(false);
        add(txtAnimalWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 217, -1));

        lblMessage8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage8.setText("Weight:");
        add(lblMessage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 120, -1));

        txtAnimalMessageFromBehaviorTharapipst.setEnabled(false);
        add(txtAnimalMessageFromBehaviorTharapipst, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 217, -1));

        lblMessage9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage9.setText("Behavior Check:");
        add(lblMessage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 120, -1));

        txtAnimalMessageFromVet.setEnabled(false);
        add(txtAnimalMessageFromVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 217, -1));

        lblMessage10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage10.setText("Vet Feedback:");
        add(lblMessage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 120, -1));

        txtAnimalMessageFromPharmacy.setEnabled(false);
        add(txtAnimalMessageFromPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 217, -1));

        lblMessage11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage11.setText("Pharmacy Feedback:");
        add(lblMessage11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 120, -1));

        lblPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_noimage.png"))); // NOI18N
        add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 200, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblMessage10;
    private javax.swing.JLabel lblMessage11;
    private javax.swing.JLabel lblMessage5;
    private javax.swing.JLabel lblMessage6;

    private javax.swing.JLabel lblMessage8;
    private javax.swing.JLabel lblMessage7;
    private javax.swing.JLabel lblMessage9;
    private javax.swing.JTextField txtAnimalMessageFromBehaviorTharapipst;
    private javax.swing.JTextField txtAnimalMessageFromPharmacy;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAnimalArea;
    private javax.swing.JTextField txtAnimalSex;
    private javax.swing.JTextField txtAnimalWeight;
    private javax.swing.JTextField txtAnimalMessageFromVet;
    private javax.swing.JTextField txtAnimalName;

    // End of variables declaration//GEN-END:variables

    private void showAnimalDetails() {
        //set animal name
        txtAnimalName.setText(animal.getName());
        //set animal area
        txtAnimalArea.setText(animal.getArea());
        //set animal sex
        txtAnimalSex.setText(animal.getSex());
        //set animal weight
        txtAnimalWeight.setText(animal.getWeight());
        //set animal message
        txtAnimalMessageFromBehaviorTharapipst.setText(animal.getBaviorCheckMessage());
        //set animal message
        txtAnimalMessageFromPharmacy.setText(animal.getPharmacyMessage());
        //set animal message
        txtAnimalMessageFromVet.setText(animal.getVetMessage());
        
        if (animal.getPhoto()!=null){
            String path = Paths.get(animal.getPhoto()).toAbsolutePath().toString();
            ImageIcon icon = seticon(path, null);
            lblPhoto.setIcon(icon);
        }
                
    }
    
    public ImageIcon seticon(String mess, byte[] image){
        //set image icon
        ImageIcon i = null;
        
        if (mess != null) {
            i = new ImageIcon(mess);
        } else {
            i = new ImageIcon(image);
        }
        //set image icon
        Image imgone = i.getImage();
        Image imgtwo = imgone.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon img = new ImageIcon(imgtwo);
        return img;
    }

}
