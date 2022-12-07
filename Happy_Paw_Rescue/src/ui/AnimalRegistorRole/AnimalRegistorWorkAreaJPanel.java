/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.AnimalRegistorRole;

/**
 *
 * @author Jiale Lyu
 */

import javax.swing.JPanel;
import java.awt.CardLayout;

import model.UserAccount.UserAccount;

import model.Network.Network;
import model.EcoSystem.EcoSystem;
import model.Organization.AnimalRegisterOrganization;
import model.WorkQueue.WorkRequest;
import model.Enterprise.AnimalShelterEnterprise;


public class AnimalRegistorWorkAreaJPanel extends javax.swing.JPanel {
    
        private final JPanel workArea;
        private final UserAccount account;
        private Network network;
        private AnimalRegisterOrganization organization;
        private AnimalShelterEnterprise enterprise;
        private EcoSystem ecosystem;
    
        // Variables declaration - do not modify                     
        private javax.swing.JLabel lblTitle;
        private javax.swing.JButton registerAnimalJButton;
        private javax.swing.JButton requestVolunteerJButton;
        // End of variables declaration    
        
    public AnimalRegistorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,  AnimalRegisterOrganization animalRegisterOrganization,AnimalShelterEnterprise animalShelterEnterprise, Network network, EcoSystem ecosystem) {
        initComponents();

        this.enterprise = animalShelterEnterprise;
        this.network = network;
        this.ecosystem = ecosystem;
        this.workArea = userProcessContainer;
        this.account = account;
        this.organization = animalRegisterOrganization;
        
    }
    
    
    private void registerAnimalJButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                      

        RegistorAnimalJPanel registorAnimalJPanel = new RegistorAnimalJPanel(workArea, account, enterprise);
        workArea.add("registorAnimalJPanel", registorAnimalJPanel);        
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        requestVolunteerJButton = new javax.swing.JButton();
        registerAnimalJButton = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(212, 255, 224));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestVolunteerJButton.setText("Request Volunteer");
        requestVolunteerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestVolunteerJButtonActionPerformed(evt);
            }
        });
        add(requestVolunteerJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 240, 35));

        registerAnimalJButton.setText("Register Animal");
        registerAnimalJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerAnimalJButtonActionPerformed(evt);
            }
        });
        add(registerAnimalJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 240, 35));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Animal Registor Work Area");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));
    }// </editor-fold>                        

    private void requestVolunteerJButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                        

        RequestVolunteerJPanel requestVolunteerJPanel = new RequestVolunteerJPanel(workArea, account, organization, enterprise , network, ecosystem);
        workArea.add("requestVolunteerJPanel", requestVolunteerJPanel);

        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);

    }                                                       

}
