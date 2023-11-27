package com.Files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Createfolder extends javax.swing.JFrame {

   public void setUsername(String name){
       Username.setText(name);
   }
   public void setIcon(Icon icon){
    OIcon.setIcon(icon);
   }
    public Createfolder() {
        initComponents();
        info.setVisible(false);
           ButtonGroup bg = new ButtonGroup();
       bg.add(FPublic);
       bg.add(FPrivate);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        description1 = new com.Files.Description();
        label = new com.Files.Ownername();
        OIcon = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        CreateFolder = new com.Loginpage.Createfilebtn();
        FPublic = new javax.swing.JRadioButton();
        FPrivate = new javax.swing.JRadioButton();
        Foldername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(732, 548));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel1.setText("Required fields are marked with an asterisk (*).");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 60, 300, 18);

        jLabel2.setFont(new java.awt.Font("Candara", 0, 28)); // NOI18N
        jLabel2.setText("Create a new Folder");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 20, 350, 31);

        jLabel3.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel3.setText("Owner *");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 90, 90, 25);

        jLabel4.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel4.setText("Foldername *");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(200, 90, 130, 23);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("/");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(190, 120, 10, 30);

        jLabel6.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel6.setText("Description (optional)");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 160, 220, 30);

        info.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        info.setText("You are creating a public File in your personal account. ");
        jPanel1.add(info);
        info.setBounds(20, 320, 410, 18);

        description1.setBorder(null);
        description1.setBottomleft(20);
        description1.setBottomright(20);
        description1.setTopleft(20);
        description1.setTopright(20);
        description1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                description1ActionPerformed(evt);
            }
        });
        jPanel1.add(description1);
        description1.setBounds(20, 190, 630, 30);

        label.setBackground(new java.awt.Color(255, 255, 255));
        label.setBottomleft(20);
        label.setBottomright(20);
        label.setTopleft(20);
        label.setTopright(20);
        label.setLayout(null);

        OIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OIcon.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        label.add(OIcon);
        OIcon.setBounds(10, 0, 37, 30);

        Username.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        Username.setText("Username");
        label.add(Username);
        Username.setBounds(50, 0, 100, 30);

        jPanel1.add(label);
        label.setBounds(20, 120, 170, 30);

        CreateFolder.setBackground(new java.awt.Color(51, 102, 255));
        CreateFolder.setBorder(null);
        CreateFolder.setForeground(new java.awt.Color(255, 255, 255));
        CreateFolder.setText("Create File");
        CreateFolder.setBottomleft(50);
        CreateFolder.setBottomright(50);
        CreateFolder.setContentAreaFilled(false);
        CreateFolder.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        CreateFolder.setTopleft(50);
        CreateFolder.setTopright(50);
        CreateFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateFolderActionPerformed(evt);
            }
        });
        jPanel1.add(CreateFolder);
        CreateFolder.setBounds(280, 400, 190, 40);

        FPublic.setBackground(new java.awt.Color(204, 204, 255));
        FPublic.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        FPublic.setText("Public");
        FPublic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPublicActionPerformed(evt);
            }
        });
        jPanel1.add(FPublic);
        FPublic.setBounds(30, 240, 70, 23);

        FPrivate.setBackground(new java.awt.Color(204, 204, 255));
        FPrivate.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        FPrivate.setText("Private");
        jPanel1.add(FPrivate);
        FPrivate.setBounds(30, 280, 80, 23);
        jPanel1.add(Foldername);
        Foldername.setBounds(200, 120, 160, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 740, 550);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CreateFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateFolderActionPerformed
        MainFile m = new MainFile();
        
        if(Foldername.getText().isEmpty()){
                 JOptionPane.showMessageDialog(null,"Enter Foldername ");   
        }
        else {   
        
        
        if(FPublic.isSelected()){
     
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
               Statement s = c.createStatement();
           String query = "Insert into Folder values(?,?,?,?,?)";    

                PreparedStatement ptst = c.prepareStatement(query);
             ptst.setString(1,Username.getText());
             ptst.setString(2,Foldername.getText());
             ptst.setString(3,"Readme.md");
                ptst.setString(4,"Here you can write the description of your file ..");
                ptst.setString(5,"Public");

                ptst.execute();

                JOptionPane.showMessageDialog(null,"Folder created Successfully");
                c.close();  
      setVisible(false);
    }
    catch(Exception e){
        e.printStackTrace(); 
    }
          }
        else if(FPrivate.isSelected()){
     
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
               Statement s = c.createStatement();
           String query = "Insert into Folder values(?,?,?,?,?)";    

                PreparedStatement ptst = c.prepareStatement(query);
             ptst.setString(1,Username.getText());
             ptst.setString(2,Foldername.getText());
             ptst.setString(3,"Readme.md");
                ptst.setString(4,"Here you can write the description of your file ..");
                ptst.setString(5,"Private");

                ptst.execute();

                JOptionPane.showMessageDialog(null,"Folder created Successfully");
                c.close();  
      setVisible(false);
    }
    catch(Exception e){
        e.printStackTrace(); 
    }
          }
        else {
            JOptionPane.showMessageDialog(null,"Select Public or Private access for folder");
        }
        }
    }//GEN-LAST:event_CreateFolderActionPerformed

    private void description1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_description1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_description1ActionPerformed

    private void FPublicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FPublicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FPublicActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Createfolder().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.Loginpage.Createfilebtn CreateFolder;
    private javax.swing.JRadioButton FPrivate;
    private javax.swing.JRadioButton FPublic;
    private javax.swing.JTextField Foldername;
    private javax.swing.JLabel OIcon;
    private javax.swing.JLabel Username;
    private com.Files.Description description1;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private com.Files.Ownername label;
    // End of variables declaration//GEN-END:variables
}
