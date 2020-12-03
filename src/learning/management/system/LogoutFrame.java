/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.management.system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author Haider Qazi
 */
public class LogoutFrame extends javax.swing.JFrame {

    /**
     * Creates new form Logout
     */
    public LogoutFrame() {
        initComponents();
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Border_Panel = new RoundedPanel(25, new Color(204,204,204));
        Log_Out_Screen_Panel = new RoundedPanel(25, Color.WHITE);
        Log_Out_Label = new javax.swing.JLabel();
        Message_Label = new javax.swing.JLabel();
        Cancel_Button_Panel = new javax.swing.JPanel();
        Cancel_Button_Label = new javax.swing.JLabel();
        Log_Out_Button_Panel = new javax.swing.JPanel();
        Log_Out_Button_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Border_Panel.setOpaque(false);
        Border_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Log_Out_Screen_Panel.setOpaque(false);
        Log_Out_Screen_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Log_Out_Label.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 30)); // NOI18N
        Log_Out_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Log_Out_Label.setText("Log Out");
        Log_Out_Screen_Panel.add(Log_Out_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 40));

        Message_Label.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        Message_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Message_Label.setText("Are you sure you want to logout now?");
        Log_Out_Screen_Panel.add(Message_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 400, 40));

        Cancel_Button_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Cancel_Button_Panel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(204, 204, 204)));
        Cancel_Button_Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancel_Button_Panel.setOpaque(false);
        Cancel_Button_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cancel_Button_PanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cancel_Button_PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Cancel_Button_PanelMouseExited(evt);
            }
        });
        Cancel_Button_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cancel_Button_Label.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 25)); // NOI18N
        Cancel_Button_Label.setForeground(new java.awt.Color(0, 102, 255));
        Cancel_Button_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cancel_Button_Label.setText("Cancel");
        Cancel_Button_Panel.add(Cancel_Button_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 179, 37));

        Log_Out_Screen_Panel.add(Cancel_Button_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 200, 60));

        Log_Out_Button_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Log_Out_Button_Panel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        Log_Out_Button_Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Log_Out_Button_Panel.setOpaque(false);
        Log_Out_Button_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Log_Out_Button_PanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Log_Out_Button_PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Log_Out_Button_PanelMouseExited(evt);
            }
        });
        Log_Out_Button_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Log_Out_Button_Label.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 25)); // NOI18N
        Log_Out_Button_Label.setForeground(new java.awt.Color(0, 102, 255));
        Log_Out_Button_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Log_Out_Button_Label.setText("Log Out");
        Log_Out_Button_Panel.add(Log_Out_Button_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 180, 37));

        Log_Out_Screen_Panel.add(Log_Out_Button_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 200, 60));

        Border_Panel.add(Log_Out_Screen_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 399, 229));

        getContentPane().add(Border_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 401, 231));

        setSize(new java.awt.Dimension(401, 231));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Cancel_Button_PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancel_Button_PanelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Cancel_Button_Label.setForeground(new Color(0,102,255));
    }//GEN-LAST:event_Cancel_Button_PanelMouseClicked

    private void Cancel_Button_PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancel_Button_PanelMouseEntered
        // TODO add your handling code here:
        Cancel_Button_Label.setForeground(Color.RED);
    }//GEN-LAST:event_Cancel_Button_PanelMouseEntered

    private void Cancel_Button_PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancel_Button_PanelMouseExited
        // TODO add your handling code here:
        Cancel_Button_Label.setForeground(new Color(0,102,255));
    }//GEN-LAST:event_Cancel_Button_PanelMouseExited

    private void Log_Out_Button_PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Log_Out_Button_PanelMouseEntered
        // TODO add your handling code here:
        Log_Out_Button_Label.setForeground(Color.RED);
    }//GEN-LAST:event_Log_Out_Button_PanelMouseEntered

    private void Log_Out_Button_PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Log_Out_Button_PanelMouseExited
        // TODO add your handling code here:
        Log_Out_Button_Label.setForeground(new Color(0,102,255));
    }//GEN-LAST:event_Log_Out_Button_PanelMouseExited

    private void Log_Out_Button_PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Log_Out_Button_PanelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Log_Out_Button_PanelMouseClicked

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
            java.util.logging.Logger.getLogger(LogoutFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogoutFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogoutFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogoutFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogoutFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Border_Panel;
    private javax.swing.JLabel Cancel_Button_Label;
    private javax.swing.JPanel Cancel_Button_Panel;
    private javax.swing.JLabel Log_Out_Button_Label;
    private javax.swing.JPanel Log_Out_Button_Panel;
    private javax.swing.JLabel Log_Out_Label;
    private javax.swing.JPanel Log_Out_Screen_Panel;
    private javax.swing.JLabel Message_Label;
    // End of variables declaration//GEN-END:variables

    class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            
        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
    }
}

