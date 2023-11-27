package com.Feedback;
import com.UserDashboard.Dashboard;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Feedbacks extends javax.swing.JFrame {

 
    public Feedbacks() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Feedback = new javax.swing.JTextArea();
        Username = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(575, 400));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Write Here .........");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(15, 68, 228, 23);

        Feedback.setColumns(20);
        Feedback.setRows(5);
        jScrollPane1.setViewportView(Feedback);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 100, 560, 200);

        Username.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        jPanel1.add(Username);
        Username.setBounds(30, 160, 47, 24);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(227, 309, 80, 31);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel1.setText("Give Your Feedback");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(126, 18, 330, 36);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 560, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        String f = Feedback.getText();
        if(f.isEmpty()){
            System.out.print("H");
        }
        else{
            System.out.print(f);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Dashboard d = new Dashboard();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
            Statement s = c.createStatement();
            String query = "insert into feedback value(?,?)";

            PreparedStatement ptst = c.prepareStatement(query);
            ptst.setString(1,Username.getText());
            ptst.setString(2,Feedback.getText());

            ptst.execute();

            JOptionPane.showMessageDialog(null,"Thank you for Giving a Feedback");
            setVisible(false);
        }
        catch(Exception e){

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedbacks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Feedback;
    public javax.swing.JLabel Username;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
