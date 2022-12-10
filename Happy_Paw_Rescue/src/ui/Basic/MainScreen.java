package ui.Basic;


import java.awt.CardLayout;
import javax.swing.JPanel;
import model.EcoSystem.DB4OUtil;
import model.EcoSystem.EcoSystem;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.UserAccount.UserAccount;

/**
 *
 * @author fanyesun
 */
public class MainScreen extends javax.swing.JPanel {

    JPanel mainWorkArea;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Network network;
    EcoSystem ecoSystem;
    DB4OUtil dB4OUtil;

    public MainScreen(JPanel mainWorkArea, UserAccount account, EcoSystem ecoSystem, DB4OUtil dB4OUtil) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.userAccount = account;
        this.ecoSystem = ecoSystem;
        this.dB4OUtil = dB4OUtil;
        
        initSystemAdminWorkArea();
    }
   //create main screen class
    
    public MainScreen(JPanel mainWorkArea, UserAccount userAccount, DB4OUtil dB4OUtil) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.userAccount = userAccount;
        this.organization = userAccount.getOrgainization();
        this.enterprise = userAccount.getEnterprise();
        this.network = userAccount.getNetwork();
        this.ecoSystem = userAccount.getNetwork().getEcosystem();
        this.dB4OUtil = dB4OUtil;

        initUserWorkArea();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        menuPanel = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        menuPanel.setBackground(new java.awt.Color(254, 236, 236));

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblWelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_titleSmall.png"))); // NOI18N
        lblWelcome.setText("<WelcomeMsg>");

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_logout.png"))); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(26, 26, 26))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWelcome)
                    .addComponent(btnLogOut))
                .addContainerGap())
        );

        splitPane.setTopComponent(menuPanel);

        workArea.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(splitPane)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //import database
        dB4OUtil.storeEcoSystem(ecoSystem);
        //import login page
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        mainWorkArea.add("LoginScreen", new LoginScreen(mainWorkArea, ecoSystem, dB4OUtil));
        layout.next(mainWorkArea);

    }


    //import java swing functions
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;

    private void initUserWorkArea() {
        //create init user work area
        lblWelcome.setText(userAccount.getNetwork() + " / "
                + userAccount.getEnterprise() + " / "
                + userAccount.getOrgainization() + " / "
                + userAccount.getRole() + " / "
                + userAccount);

        CardLayout layout = (CardLayout) workArea.getLayout();
        workArea.add("workArea", userAccount.getRole().createWorkArea(workArea, userAccount, organization, enterprise, network, ecoSystem));
        layout.next(workArea);
        
    }
    
    private void initSystemAdminWorkArea(){
        
        lblWelcome.setText("Welcome, " + ecoSystem.getSystemAdmin().getUsername() + "!");
        
        CardLayout layout = (CardLayout) workArea.getLayout();
        workArea.add("workArea", userAccount.getRole().createAdminWorkArea(workArea, userAccount, ecoSystem));
        layout.next(workArea);
        
    }

}
