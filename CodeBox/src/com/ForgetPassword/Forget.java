package com.ForgetPassword;

import com.Loginpage.Login;
import com.Registration.Mailing;
import com.Registration.Register;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Forget extends javax.swing.JFrame {
       private Mailing m = new Mailing();
        private static final int OTP_EXPIRATION_SECONDS = 300; // 5 minutes
    private int countdown = OTP_EXPIRATION_SECONDS;
    private Timer timer;
    private JLabel countdownLabel;
   private String checkotp = "CODEBOX";

    public Forget() {
        initComponents();
      try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            countdownLabel = new JLabel(getFormattedTime());
              countdownLabel.setBounds(495, 278, 100, 30); // Set the bounds of the label
        frame1.add(countdownLabel); 
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame1 = new com.ForgetPassword.Frame();
        Back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Email = new com.ForgetPassword.Username();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Otp = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        registrationbtn2 = new com.Registration.Registrationbtn();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1099, 602));
        setMinimumSize(new java.awt.Dimension(1099, 602));
        getContentPane().setLayout(null);

        frame1.setBackground(new java.awt.Color(255, 255, 255));
        frame1.setBottomleft(10);
        frame1.setBottomright(10);
        frame1.setTopleft(10);
        frame1.setTopright(10);
        frame1.setLayout(null);

        Back.setBackground(new java.awt.Color(51, 102, 255));
        Back.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Back");
        Back.setBorderPainted(false);
        Back.setFocusPainted(false);
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        frame1.add(Back);
        Back.setBounds(20, 20, 72, 26);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/Redlock1-removebg-preview.png"))); // NOI18N
        frame1.add(jLabel6);
        jLabel6.setBounds(380, 10, 100, 70);

        jLabel1.setFont(new java.awt.Font("Poor Richard", 0, 28)); // NOI18N
        jLabel1.setText("Enter Otp");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        frame1.add(jLabel1);
        jLabel1.setBounds(220, 240, 210, 35);

        Email.setFocusCycleRoot(true);
        Email.setInheritsPopupMenu(true);
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        frame1.add(Email);
        Email.setBounds(220, 190, 400, 40);

        jLabel3.setFont(new java.awt.Font("Poor Richard", 0, 28)); // NOI18N
        jLabel3.setText("Reset Password ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        frame1.add(jLabel3);
        jLabel3.setBounds(350, 70, 210, 35);

        jLabel4.setFont(new java.awt.Font("Poor Richard", 0, 28)); // NOI18N
        jLabel4.setText("Enter Email Id");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        frame1.add(jLabel4);
        jLabel4.setBounds(220, 150, 210, 35);
        frame1.add(Otp);
        Otp.setBounds(220, 280, 120, 40);

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Poor Richard", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("get OTP");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        frame1.add(jButton2);
        jButton2.setBounds(360, 280, 100, 30);

        registrationbtn2.setBackground(new java.awt.Color(255, 102, 51));
        registrationbtn2.setBorder(null);
        registrationbtn2.setForeground(new java.awt.Color(255, 255, 255));
        registrationbtn2.setText("Submit");
        registrationbtn2.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        registrationbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationbtn2ActionPerformed(evt);
            }
        });
        frame1.add(registrationbtn2);
        registrationbtn2.setBounds(220, 350, 90, 40);

        getContentPane().add(frame1);
        frame1.setBounds(140, 60, 840, 480);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/forget.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -90, 1100, 790);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
// This will redirect to login page ...
        setVisible(false);
        Login p = new Login();
        p.setVisible(true);
    }//GEN-LAST:event_BackMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        
          String username = Email.getText();
        System.out.print(username);
 
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         startCountdown();
    m.sendOtp(Email.getText());
    this.checkotp = m.getFotp();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void registrationbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationbtn2ActionPerformed
        // TODO add your handling code here:
 if (this.checkotp == null) {
        // Your code..
        JOptionPane.showMessageDialog(null, "OTP Expired");
    } else if (this.checkotp.equals(Otp.getText())) {
        ChangePassword c = new ChangePassword();
        c.setVisible(true);
    }
  else {
        JOptionPane.showMessageDialog(null, "Invalid OTP");
    }
        
     
    }//GEN-LAST:event_registrationbtn2ActionPerformed
  
    private void startCountdown(){
              this.checkotp = null;
 
     if (timer != null) {
        timer.cancel();
    }

    // Create a new timer
    timer = new Timer();

    // Set the initial countdown value
    countdown = OTP_EXPIRATION_SECONDS;

    // Set the bounds of the label
    countdownLabel.setBounds(495, 278, 100, 30);

    // Add the label to your frame
    frame1.add(countdownLabel);
    
    TimerTask countdownTask = new TimerTask() {
        @Override
        public void run() {
            if (countdown > 0) {
                countdownLabel.setText(getFormattedTime());
                countdown--;
            } else {
                countdownLabel.setText("OTP Expired!");
              Forget.this.checkotp = null; 
                timer.cancel();
            }
        }
    };

    // Schedule the countdown task to run every second
    timer.scheduleAtFixedRate(countdownTask, 0, 1000);
    }
     private String getFormattedTime() {
        int minutes = countdown / 60;
        int seconds = countdown % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forget().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    public com.ForgetPassword.Username Email;
    private javax.swing.JTextField Otp;
    private com.ForgetPassword.Frame frame1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private com.Registration.Registrationbtn registrationbtn2;
    // End of variables declaration//GEN-END:variables
}
