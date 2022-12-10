package ui.Basic;

import model.Network.Network;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.EcoSystem.EcoSystem;
import model.Enterprise.AdoptionEnterprise;
import model.Organization.AdopterOrganization;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.EcoSystem.DB4OUtil;
import model.Role.AdopterRole;
import model.WorkQueue.AdopterAuthorizationRequest;
import model.EcoSystem.EmailValidator;

/**
 *
 * @author fanyesun
 */
public class LoginScreen extends javax.swing.JPanel {

    JPanel mainWorkArea;
    EcoSystem ecoSystem;
    DB4OUtil db4oUtil;
    //create login screen
    public LoginScreen(JPanel jPanel, EcoSystem system, DB4OUtil oUtil) {
        initComponents();

        this.setSize(1000, 630);
        this.mainWorkArea = jPanel;
        this.ecoSystem = system;
        this.db4oUtil = oUtil;

        populateNetworkCombo();

    }

//create initComponents
    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblLogIn = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        pwdPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jSeparator = new javax.swing.JSeparator();
        lblRegister = new javax.swing.JLabel();
        lblNewUserName = new javax.swing.JLabel();
        txtNewUserName = new javax.swing.JTextField();
        lblNewPassword = new javax.swing.JLabel();
        pwdNewPassword = new javax.swing.JPasswordField();
        lblName = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        lblNetwork = new javax.swing.JLabel();
        cmbNetworkList = new javax.swing.JComboBox();
        lblEnterprise = new javax.swing.JLabel();
        cmbEnterpriseList = new javax.swing.JComboBox();
        lblEnterprise1 = new javax.swing.JLabel();
        cmbOrganizationList = new javax.swing.JComboBox();
        txtEmail = new javax.swing.JTextField();
        lblLogin2 = new javax.swing.JLabel();
        lblRegister1 = new javax.swing.JLabel();
        //set Background color
        setBackground(new java.awt.Color(155, 209, 249));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_title.png"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 1000, 133));

        lblLogIn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblLogIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogIn.setText("Log In");
        add(lblLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 202, 40));

        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText("Username:");
        add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, -1, -1));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 150, -1));

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password:");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, -1));
        add(pwdPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 150, -1));

        btnLogin.setBackground(new java.awt.Color(8, 46, 84));
        btnLogin.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 90, -1));

        jSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 155, -1, 500));

        lblRegister.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegister.setText("User Register");
        add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 202, 50));

        lblNewUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNewUserName.setText("Username:");
        add(lblNewUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, 25));

        txtNewUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewUserNameActionPerformed(evt);
            }
        });
        add(txtNewUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 180, 25));

        lblNewPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNewPassword.setText("Password:");
        add(lblNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, 25));
        add(pwdNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 180, 25));

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Email:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, 25));

        btnRegister.setBackground(new java.awt.Color(8, 46, 84));
        btnRegister.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(233, 233, 233));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 90, -1));

        lblNetwork.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNetwork.setText("Network:");
        lblNetwork.setVisible(false);
        add(lblNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, 30));
        cmbNetworkList.setVisible(false);
        cmbNetworkList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNetworkList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkListActionPerformed(evt);
            }
        });
        add(cmbNetworkList, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 180, 30));

        lblEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEnterprise.setText("Enterprise:");
        add(lblEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, 30));

        cmbEnterpriseList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEnterpriseList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterpriseListActionPerformed(evt);
            }
        });
        add(cmbEnterpriseList, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 180, 30));

        lblEnterprise1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEnterprise1.setText("Organization:");
        add(lblEnterprise1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, 30));

        cmbOrganizationList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrganizationList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrganizationListActionPerformed(evt);
            }
        });
        add(cmbOrganizationList, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 180, 30));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 180, 25));

        lblLogin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_login.png"))); // NOI18N
        add(lblLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, -1, 100));

        lblRegister1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblRegister1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegister1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_adopt.png"))); // NOI18N
        add(lblRegister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 202, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        //set username and password
        String userName = txtUserName.getText();
        char[] passwordCharArray = pwdPassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        //check database
        if (userName.equals(ecoSystem.getSystemAdmin().getUsername())
                && password.equals(ecoSystem.getSystemAdmin().getPassword())) {
            txtUserName.setText("");
            pwdPassword.setText("");
            JPanel mainScreen = new MainScreen(mainWorkArea, ecoSystem.getSystemAdmin(), ecoSystem, db4oUtil);
            mainWorkArea.add("MainScreen", mainScreen);
            CardLayout layout = (CardLayout) mainWorkArea.getLayout();
            layout.next(mainWorkArea);
        } else {

            for (UserAccount ua : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
                if (userName.equals(ua.getUsername()) && password.equals(ua.getPassword())) {
                    txtUserName.setText("");
                    pwdPassword.setText("");
                    JPanel mainScreen = new MainScreen(mainWorkArea, ua, db4oUtil);
                    mainWorkArea.add("MainScreen", mainScreen);
                    CardLayout layout = (CardLayout) mainWorkArea.getLayout();
                    layout.next(mainWorkArea);
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Invalid login.", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        Network selectedNetwork = (Network) cmbNetworkList.getSelectedItem();
        Enterprise selectedEnterprise = (AdoptionEnterprise) cmbEnterpriseList.getSelectedItem();
        Organization selecOrganization = (AdopterOrganization) cmbOrganizationList.getSelectedItem();

        String newUser = txtEmail.getText();
        String newUserName = txtNewUserName.getText();
        String newUserPassword = String.valueOf(pwdNewPassword.getPassword());

        EmailValidator emailValidator = new EmailValidator();

        if (selectedNetwork != null && selectedEnterprise != null && selectedEnterprise != null
                && !newUser.isEmpty() && !newUserName.isEmpty() && !newUserPassword.isEmpty()) {

            if (emailValidator.validate(txtEmail.getText().trim())) {


                if (ecoSystem.getUserAccountDirectory().userNameIsUnique(newUserName) ) {
                    UserAccount newUserAccount = ecoSystem.getUserAccountDirectory().createUserAccount(newUserName, newUserPassword, new AdopterRole(), selectedNetwork, selectedEnterprise, selecOrganization);
                    newUserAccount.setEmailId(newUser);
                    JOptionPane.showMessageDialog(this, "User Account added successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    txtNewUserName.setText("");
                    pwdNewPassword.setText("");
                    txtEmail.setText("");

                    AdopterAuthorizationRequest request = new AdopterAuthorizationRequest();
                    request.setMessage("New User");
                    request.setSender(newUserAccount);
                    request.setStatus("Pending Review");

                    selectedEnterprise.getWorkQueue().getWorkRequestList().add(request);
                    newUserAccount.getWorkQueue().getWorkRequestList().add(request);

                } else {
                    JOptionPane.showMessageDialog(this, "User Account already existed", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Email", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "All fields cannot be blank", "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }

    private void cmbEnterpriseListActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        
        populateOrganizationCombo();
        
    }

    private void cmbOrganizationListActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtNewUserNameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cmbNetworkListActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        
        populateEnterpriseCombo();
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox cmbEnterpriseList;
    private javax.swing.JComboBox cmbNetworkList;
    private javax.swing.JComboBox cmbOrganizationList;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblEnterprise1;
    private javax.swing.JLabel lblLogIn;
    private javax.swing.JLabel lblLogin2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblNewUserName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblRegister1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField pwdNewPassword;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNewUserName;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void populateNetworkCombo() {
        //create populateNetworkCombo
        cmbNetworkList.removeAllItems();

        if (!ecoSystem.getNetworkList().isEmpty()) {
            for (Network n : ecoSystem.getNetworkList()) {
                cmbNetworkList.addItem(n);
            }
        }

    }

    private void populateEnterpriseCombo() {
        //create populateEnterpriseCombo
        cmbEnterpriseList.removeAllItems();

        Network network = (Network) cmbNetworkList.getSelectedItem();

        if (network != null) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (e instanceof AdoptionEnterprise) {
                    cmbEnterpriseList.addItem(e);
                }
            }
        }
    }

    private void populateOrganizationCombo() {

        cmbOrganizationList.removeAllItems();
        //create populateOrganizationCombo
        Network item = (Network) cmbNetworkList.getSelectedItem();
        Enterprise item1 = (Enterprise) cmbEnterpriseList.getSelectedItem();

        if (item != null && item1!= null) {
            for (Organization o : item1.getOrganizationDirectory().getOrganizationList()) {
                if (o instanceof AdopterOrganization) {
                    cmbOrganizationList.addItem(o);
                }
            }
            
        }

    }
}
