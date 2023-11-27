package com.AdminDashboard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Notification extends javax.swing.JFrame {

    public Notification() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        A = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        Username = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(725, 475));
        setMinimumSize(new java.awt.Dimension(725, 475));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        A.setColumns(20);
        A.setRows(5);
        jScrollPane1.setViewportView(A);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 100, 700, 330);

        jButton1.setText("Post");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(610, 60, 72, 23);

        Username.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("Post Notification For All");
        jPanel1.add(Username);
        Username.setBounds(160, 20, 361, 45);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 710, 440);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String notification = A.getText();
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
               Statement s = c.createStatement();
           
               String query = "Insert into Notify values(?,?)";

                PreparedStatement ptst = c.prepareStatement(query);
             ptst.setString(1, notification);
                        Date Cd = new Date();
                        SimpleDateFormat Df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String Fd = Df.format(Cd);
             ptst.setString(2,Fd);

                ptst.execute();

                JOptionPane.showMessageDialog(null,"Notification Uploaded Successfully");
                c.close();
            setVisible(false);
           }
   catch(Exception e){
       e.printStackTrace();
   }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea A;
    protected javax.swing.JLabel Username;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
