/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package ui.AdministrativeRole;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.EcoSystem.EcoSystem;
import model.UserAccount.UserAccount;

/**
 *
 * @author  fanyesun
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private UserAccount userAccount;
    //create AdminWorkAreaJPanel
    public AdminWorkAreaJPanel(JPanel Container, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = Container;
        this.userAccount = account;
        this.ecoSystem = system;
        
    }

    private void initComponents() {
        //create init components
        lblTitle = new javax.swing.JLabel();
        btnManageNetwork = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageOrganization = new javax.swing.JButton();
        btnManageUsers = new javax.swing.JButton();
        btnViewDashboard = new javax.swing.JButton();

        setBackground(new java.awt.Color(155, 209, 249));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_admin.png"))); // NOI18N
        lblTitle.setText("System Admin Management");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));
        //set network invisible
        btnManageNetwork.setVisible(false);
        btnManageNetwork.setBackground(new java.awt.Color(155, 209, 249));
        btnManageNetwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_network.png"))); // NOI18N
        btnManageNetwork.setText("Manage Network");
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });
        add(btnManageNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 184, -1));

        btnManageEnterprise.setBackground(new java.awt.Color(245, 245, 255));
        btnManageEnterprise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_enterprise.png"))); // NOI18N
        //set enterprise invisible
        btnManageEnterprise.setText("Enterprise Management");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });
        add(btnManageEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 184, -1));

        btnManageOrganization.setBackground(new java.awt.Color(245, 245, 255));
        btnManageOrganization.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_organization.png"))); // NOI18N
        //set organization invisible
        btnManageOrganization.setText("Organizations Management");
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });
        add(btnManageOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 184, -1));

        btnManageUsers.setBackground(new java.awt.Color(245, 245, 255));
        btnManageUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_role.png"))); // NOI18N
        //set users invisible
        btnManageUsers.setText("Users Management");
        btnManageUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUsersActionPerformed(evt);
            }
        });
        add(btnManageUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 184, -1));

        btnViewDashboard.setBackground(new java.awt.Color(245, 245, 255));
        btnViewDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_dashboard.png"))); // NOI18N
        btnViewDashboard.setText("View Dashboard");
        btnViewDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDashboardActionPerformed(evt);
            }
        });
        add(btnViewDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 184, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUsersActionPerformed

        ManageUserAccountJPanel accountJPanel = new ManageUserAccountJPanel(userProcessContainer, ecoSystem);
        userProcessContainer.add("ManageUserAccountJPanel", accountJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageUsersActionPerformed

    private void btnViewDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDashboardActionPerformed

        SysAdminDashboardJPanel dashboardJPanel = new SysAdminDashboardJPanel(userProcessContainer , ecoSystem,  userAccount.getNetwork());
        userProcessContainer.add("Dashboard", dashboardJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnViewDashboardActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed

        ManageEnterpriseJPanel enterpriseJPanel = new ManageEnterpriseJPanel(userProcessContainer, ecoSystem);
        userProcessContainer.add("ManageEnterpriseJPanel", enterpriseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed

        ManageOrganizationJPanel organizationJPanel = new ManageOrganizationJPanel (userProcessContainer, ecoSystem);
        userProcessContainer.add("ManageOrganizationJPanel", organizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed

        ManageNetworkJPanel networkJPanel = new ManageNetworkJPanel(userProcessContainer, ecoSystem);
        userProcessContainer.add("ManageNetworkJPanel",networkJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnManageNetworkActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnManageUsers;
    private javax.swing.JButton btnViewDashboard;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
    
}
