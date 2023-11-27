
package com.Loginpage;

import com.Registration.Register;
import java.awt.Color;

public class FirstPage extends javax.swing.JFrame {

    public FirstPage() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Login = new com.Loginpage.Logbtn();
        Signup = new com.Loginpage.Logbtn();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1099, 602));
        setMinimumSize(new java.awt.Dimension(1099, 602));
        setPreferredSize(new java.awt.Dimension(606, 606));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Let’s build from here ...");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 330, 560, 90);

        Login.setBackground(new java.awt.Color(1, 1, 1,100));
        Login.setBorder(null);
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Sign In For CodeBox");
        Login.setBorderPainted(false);
        Login.setBottomleft(20);
        Login.setBottomright(20);
        Login.setContentAreaFilled(false);
        Login.setFocusPainted(false);
        Login.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        Login.setTopleft(20);
        Login.setTopright(20);
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginMouseExited(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(350, 400, 260, 60);

        Signup.setBorder(null);
        Signup.setText("Sign Up For CodeBox");
        Signup.setBorderPainted(false);
        Signup.setBottomleft(20);
        Signup.setBottomright(20);
        Signup.setContentAreaFilled(false);
        Signup.setFocusPainted(false);
        Signup.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        Signup.setTopleft(20);
        Signup.setTopright(20);
        Signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignupMouseExited(evt);
            }
        });
        getContentPane().add(Signup);
        Signup.setBounds(100, 400, 240, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/FLOgo.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(760, 60, 200, 200);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/Background_cleanup.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1120, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SignupMouseEntered

    private void SignupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_SignupMouseExited

    private void LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseEntered
        // TODO add your handling code here:
           Login.setBackground(Color.WHITE);
        Login.setForeground(Color.BLACK);
         Signup.setBackground(new Color(1,1,1,100));
        Signup.setForeground(Color.WHITE);
    }//GEN-LAST:event_LoginMouseEntered

    private void LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseExited
        // TODO add your handling code here:
         Signup.setBackground(Color.WHITE);
       Signup.setForeground(Color.BLACK);
               Login.setBackground(new Color(1,1,1,100));
        Login.setForeground(Color.WHITE);
    }//GEN-LAST:event_LoginMouseExited

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        // TODO add your handling code here:
        Login l  = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_LoginMouseClicked

    private void SignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupMouseClicked
        // TODO add your handling code here:
        Register r = new Register();
        r.setVisible(true);
    }//GEN-LAST:event_SignupMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.Loginpage.Logbtn Login;
    private com.Loginpage.Logbtn Signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
