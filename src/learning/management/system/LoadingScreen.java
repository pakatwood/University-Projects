/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.management.system;

import java.awt.Color;

/**
 *
 * @author Haider Qazi (Chief Programmer), Daniel Gasperini (Backup Programmer), Javier Blanco (Programmer), David Dinh (Programmer), Christian Francois (Programming Secretary)
 */
public class LoadingScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoadingScreeen
     */
    public LoadingScreen() {
        initComponents();
        this.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
        Loading_Screeen_Panel.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Loading_Screeen_Panel = new javax.swing.JPanel();
        Logo_Label = new javax.swing.JLabel();
        Description_Panel = new javax.swing.JPanel();
        LMS_Heading_Label = new javax.swing.JLabel();
        Course_Description_Label = new javax.swing.JLabel();
        by_Label = new javax.swing.JLabel();
        Team_Members_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Loading_Screeen_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/learning/management/system/resources/images/login_page/Login_Logo_200x200.png"))); // NOI18N
        Loading_Screeen_Panel.add(Logo_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 650, 200));

        Description_Panel.setBackground(new java.awt.Color(85, 142, 203));
        Description_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0), 3));
        Description_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LMS_Heading_Label.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        LMS_Heading_Label.setForeground(new java.awt.Color(255, 255, 255));
        LMS_Heading_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LMS_Heading_Label.setText("Learning Management System");
        Description_Panel.add(LMS_Heading_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 40));

        Course_Description_Label.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        Course_Description_Label.setForeground(new java.awt.Color(255, 255, 255));
        Course_Description_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Course_Description_Label.setText("CS 3321 - Software Engineering");
        Description_Panel.add(Course_Description_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 630, 30));

        by_Label.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        by_Label.setForeground(new java.awt.Color(255, 255, 255));
        by_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        by_Label.setText("by");
        Description_Panel.add(by_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 630, 30));

        Team_Members_Label.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        Team_Members_Label.setForeground(new java.awt.Color(255, 255, 255));
        Team_Members_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Team_Members_Label.setText("Haider Qazi, Daniel Gasperini, Javier Blanco, David Dinh, Christian Francois");
        Description_Panel.add(Team_Members_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 630, 30));

        Loading_Screeen_Panel.add(Description_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 630, 150));

        getContentPane().add(Loading_Screeen_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 400));

        setSize(new java.awt.Dimension(650, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadingScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Course_Description_Label;
    private javax.swing.JPanel Description_Panel;
    private javax.swing.JLabel LMS_Heading_Label;
    private javax.swing.JPanel Loading_Screeen_Panel;
    private javax.swing.JLabel Logo_Label;
    private javax.swing.JLabel Team_Members_Label;
    private javax.swing.JLabel by_Label;
    // End of variables declaration//GEN-END:variables
}