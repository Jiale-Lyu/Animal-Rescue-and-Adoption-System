package ui.Basic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.CardLayout;
import javax.swing.JPanel;

import model.EcoSystem.DB4OUtil;
import model.EcoSystem.EcoSystem;

/**
 *
 * @author fanyesun
 */
//Creates new form MainJFrame
public class MainJFrame extends javax.swing.JFrame {

    private EcoSystem ecoSystem;
    private DB4OUtil db4oUtil = DB4OUtil.getInstance();

    public MainJFrame() {
        initComponents();
        ecoSystem = db4oUtil.retrieveEcoSystem();
        setSize(1000, 675);

        initLoginScreen();      
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainWorkArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        mainWorkArea.setBackground(new java.awt.Color(255, 255, 255));
        mainWorkArea.setLayout(new java.awt.CardLayout());
        getContentPane().add(mainWorkArea, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //create new form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    private javax.swing.JPanel mainWorkArea;
    private void initLoginScreen() {
        //enter login page
        JPanel loginScreen = new ui.Basic.LoginScreen(mainWorkArea, ecoSystem, db4oUtil);
        mainWorkArea.add("LoginScreen", loginScreen);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);

    }

    

}