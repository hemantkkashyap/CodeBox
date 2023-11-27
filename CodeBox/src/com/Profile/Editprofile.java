package com.Profile;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Editprofile extends javax.swing.JFrame {

    private String Username;
    
    public void setUsername(String username){
        this.Username = username;
    }
    public Editprofile() {
        initComponents();
              try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Bio = new javax.swing.JTextArea();
        Linkedin_Id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Role = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Country = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Education = new javax.swing.JTextField();
        Save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(455, 490));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel9.setText("I am currently a *");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 120, 190, 30);

        jLabel2.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel2.setText("Bio ...");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 190, 30);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Bio.setColumns(20);
        Bio.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        Bio.setRows(5);
        Bio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jScrollPane1.setViewportView(Bio);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 40, 420, 70);

        Linkedin_Id.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        Linkedin_Id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Linkedin_Id.setOpaque(true);
        Linkedin_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Linkedin_IdActionPerformed(evt);
            }
        });
        jPanel1.add(Linkedin_Id);
        Linkedin_Id.setBounds(10, 360, 420, 30);

        jLabel7.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel7.setText("Country");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 190, 120, 30);

        Role.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        Role.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Role.setOpaque(true);
        Role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleActionPerformed(evt);
            }
        });
        jPanel1.add(Role);
        Role.setBounds(10, 150, 420, 30);

        jLabel6.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel6.setText("Select Education");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 260, 220, 30);

        Country.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        Country.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Country.setOpaque(true);
        Country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountryActionPerformed(evt);
            }
        });
        jPanel1.add(Country);
        Country.setBounds(10, 220, 420, 30);

        jLabel8.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel8.setText("LinkedIn URL");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 330, 160, 30);

        Education.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        Education.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Education.setOpaque(true);
        Education.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationActionPerformed(evt);
            }
        });
        jPanel1.add(Education);
        Education.setBounds(10, 290, 420, 30);

        Save.setBackground(new java.awt.Color(51, 102, 255));
        Save.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Save");
        Save.setBorder(null);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel1.add(Save);
        Save.setBounds(180, 410, 100, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 440, 470);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Linkedin_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Linkedin_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Linkedin_IdActionPerformed

    private void RoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoleActionPerformed

    private void CountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CountryActionPerformed

    private void EducationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EducationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EducationActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        Profile p = new Profile();
        try{
  Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
               Statement s = c.createStatement();
       ResultSet rs1 = s.executeQuery("select * from Personaldetails where Username = '"+Username+"'"); 
           
           if(rs1.next()){
            s.executeUpdate("update Personaldetails set Bio= '"+Bio.getText()+"',CurrentRole = '"+Role.getText()+"',Country = '"+Country.getText()+"',Eductaion = '"+Education.getText()+"',Linkedin_ID = '"+Linkedin_Id.getText()+"' where Username = '"+Username+"'");
        JOptionPane.showMessageDialog(null,"Details Updated Succesfully");
          
           }
                 else{
               Class.forName("com.mysql.cj.jdbc.Driver");
               String query = "insert into Personaldetails values(?,?,?,?,?,?)";

                PreparedStatement ptst = c.prepareStatement(query);
             ptst.setString(1,Username);
             ptst.setString(2, Bio.getText());
              ptst.setString(3,Role.getText());
               ptst.setString(4, Country.getText());
                ptst.setString(5, Education.getText());
                 ptst.setString(6, Linkedin_Id.getText());
               

                ptst.execute();

                JOptionPane.showMessageDialog(null,"Details Updated Succesfully");
  
                c.close();   
           }          
ResultSet rs2 = s.executeQuery("Select Fullname,Email,Phone_no,Username from login where Username ='"+Username+"'");
     
     
            if(rs2.next()){
                
    String Name = rs2.getNString("Fullname");
    String Mail = rs2.getNString("Email");
    String Phone = rs2.getNString("Phone_no");
    String User = rs2.getNString("Username");
    
    p.setEssentialDetails(Name, Mail, Phone, User);
      p.setDetails(Bio.getText(), Role.getText(), Country.getText(), Education.getText(), Linkedin_Id.getText());
   ResultSet rs3 = s.executeQuery("Select Imagefile from ProfileImage where Username ='"+Username+"'");
     if(rs3.next()){
   byte[] iconBytes = rs3.getBytes("Imagefile");
   ByteArrayInputStream bs = new  ByteArrayInputStream(iconBytes);
   ObjectInputStream os = new  ObjectInputStream(bs);
   ImageIcon icon = (ImageIcon) os.readObject(); 
   p.setPhoto(icon);
 p.setVisible(true);
            }    

     }      
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_SaveActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editprofile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Bio;
    public javax.swing.JTextField Country;
    public javax.swing.JTextField Education;
    public javax.swing.JTextField Linkedin_Id;
    public javax.swing.JTextField Role;
    private javax.swing.JButton Save;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
