package com.Files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class NEwFile extends javax.swing.JFrame {

    public NEwFile() {
        initComponents();
                   ButtonGroup bg = new ButtonGroup();
       bg.add(FPublic);
       bg.add(FPrivate);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Filename = new javax.swing.JTextField();
        CreateFile = new javax.swing.JButton();
        Foldername = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        FPublic = new javax.swing.JRadioButton();
        FPrivate = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(420, 300));
        setMinimumSize(new java.awt.Dimension(420, 300));
        setPreferredSize(new java.awt.Dimension(370, 182));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(370, 220));

        jLabel2.setFont(new java.awt.Font("Candara", 0, 28)); // NOI18N
        jLabel2.setText("Create a new File");

        jLabel4.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        jLabel4.setText("Filename *");

        Filename.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        Filename.setBorder(null);

        CreateFile.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        CreateFile.setText("Create");
        CreateFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateFileActionPerformed(evt);
            }
        });

        Foldername.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        Foldername.setText("Foldername *");

        Username.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        Username.setText("Username *");

        FPublic.setBackground(new java.awt.Color(204, 204, 255));
        FPublic.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        FPublic.setText("Public");
        FPublic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPublicActionPerformed(evt);
            }
        });

        FPrivate.setBackground(new java.awt.Color(204, 204, 255));
        FPrivate.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        FPrivate.setText("Private");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FPublic, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Foldername, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filename, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FPrivate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(CreateFile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Foldername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Filename, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FPublic)
                    .addComponent(FPrivate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreateFile)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 430, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CreateFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateFileActionPerformed

        MainFile m = new MainFile();
if(FPublic.isSelected()){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
               Statement s = c.createStatement();
           String query = "Insert into Folder values(?,?,?,?,?)";    

                PreparedStatement ptst = c.prepareStatement(query);
             ptst.setString(1,Username.getText());
             ptst.setString(2,Foldername.getText());
             ptst.setString(3,Filename.getText());
                ptst.setString(4,"You Can Write Your Code Here .....");
   ptst.setString(5,"Public");
                ptst.execute();

                JOptionPane.showMessageDialog(null,"File created Successfully");
                c.close();  
              

      setVisible(false);
     
            
    }
    catch(Exception e){
        
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
             ptst.setString(3,Filename.getText());
                ptst.setString(4,"You Can Write Your Code Here .....");
   ptst.setString(5,"Private");
                ptst.execute();

                JOptionPane.showMessageDialog(null,"File created Successfully");
                c.close();  
              

      setVisible(false);
     
            
    }
    catch(Exception e){
        
    }  
}
    }//GEN-LAST:event_CreateFileActionPerformed

    private void FPublicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FPublicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FPublicActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NEwFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateFile;
    private javax.swing.JRadioButton FPrivate;
    private javax.swing.JRadioButton FPublic;
    private javax.swing.JTextField Filename;
    protected javax.swing.JLabel Foldername;
    protected javax.swing.JLabel Username;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
