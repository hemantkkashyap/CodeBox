package com.AdminDashboard;

import com.Loginpage.Login;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class AdminDashboard extends javax.swing.JFrame {

    public AdminDashboard() {
        initComponents();
            initComponents();
              try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Home = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ACDate = new javax.swing.JLabel();
        Show = new javax.swing.JLabel();
        Delete = new javax.swing.JLabel();
        Wish = new javax.swing.JLabel();
        leftPanel1 = new com.AdminDashboard.LeftPanel();
        Userdetail = new javax.swing.JLabel();
        Notify = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        ProfileIcon = new com.UserDashboard.Profileicon();
        jLabel8 = new javax.swing.JLabel();
        Paneel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1099, 602));
        setMinimumSize(new java.awt.Dimension(1099, 602));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        Home.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        Home.setText("Hello,");
        jPanel1.add(Home);
        Home.setBounds(250, 80, 150, 38);

        Name.setFont(new java.awt.Font("Candara", 0, 34)); // NOI18N
        Name.setText("Admin  !");
        Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NameMouseClicked(evt);
            }
        });
        jPanel1.add(Name);
        Name.setBounds(250, 160, 430, 42);

        jLabel9.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/Calender.png"))); // NOI18N
        jLabel9.setText("Date & Time");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(850, 10, 190, 60);

        ACDate.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        ACDate.setText("Curr Date and Time ");
        jPanel1.add(ACDate);
        ACDate.setBounds(870, 80, 200, 30);

        Show.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        Show.setText("Show FeedBacks ...");
        Show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowMouseClicked(evt);
            }
        });
        jPanel1.add(Show);
        Show.setBounds(250, 210, 190, 30);

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/D.png"))); // NOI18N
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        jPanel1.add(Delete);
        Delete.setBounds(740, 190, 30, 40);

        Wish.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        Wish.setText("Good Morning!");
        jPanel1.add(Wish);
        Wish.setBounds(250, 120, 270, 40);

        leftPanel1.setBackground(new java.awt.Color(255, 153, 0));
        leftPanel1.setBottomright(30);
        leftPanel1.setTopright(30);
        leftPanel1.setLayout(null);

        Userdetail.setFont(new java.awt.Font("Candara", 0, 26)); // NOI18N
        Userdetail.setForeground(new java.awt.Color(255, 255, 255));
        Userdetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/USerd.png"))); // NOI18N
        Userdetail.setText("User Detail's ");
        Userdetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserdetailMouseClicked(evt);
            }
        });
        leftPanel1.add(Userdetail);
        Userdetail.setBounds(10, 260, 210, 60);

        Notify.setFont(new java.awt.Font("Candara", 0, 26)); // NOI18N
        Notify.setForeground(new java.awt.Color(255, 255, 255));
        Notify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/noooo.png"))); // NOI18N
        Notify.setText("Notify");
        Notify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NotifyMouseClicked(evt);
            }
        });
        leftPanel1.add(Notify);
        Notify.setBounds(10, 320, 180, 60);

        jLabel2.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/logout.png"))); // NOI18N
        jLabel2.setText("Log Out");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        leftPanel1.add(jLabel2);
        jLabel2.setBounds(30, 460, 150, 50);

        User.setBackground(new java.awt.Color(255, 153, 0));
        User.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setText("Admin@1");
        leftPanel1.add(User);
        User.setBounds(60, 160, 130, 30);

        ProfileIcon.setBackground(new java.awt.Color(255, 153, 0));
        ProfileIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProfileIcon.setBottomleft(500);
        ProfileIcon.setBottomright(500);
        ProfileIcon.setTopleft(500);
        ProfileIcon.setTopright(500);
        ProfileIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileIconMouseClicked(evt);
            }
        });
        leftPanel1.add(ProfileIcon);
        ProfileIcon.setBounds(70, 90, 70, 70);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/LLogo.jpg"))); // NOI18N
        leftPanel1.add(jLabel8);
        jLabel8.setBounds(70, 10, 80, 80);

        jPanel1.add(leftPanel1);
        leftPanel1.setBounds(0, 0, 240, 570);

        Paneel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PaneelLayout = new javax.swing.GroupLayout(Paneel);
        Paneel.setLayout(PaneelLayout);
        PaneelLayout.setHorizontalGroup(
            PaneelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        PaneelLayout.setVerticalGroup(
            PaneelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        jPanel1.add(Paneel);
        Paneel.setBounds(260, 250, 420, 310);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1100, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowMouseClicked
        try{
            
          
         Class.forName("com.mysql.cj.jdbc.Driver");
          Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
               Statement s = c.createStatement();
                
        List<String> Usernames = new ArrayList<>();
        
     String query = "Select Username from Feedback";
               ResultSet rs = s.executeQuery(query); 
              
         while(rs.next()){
            
          
             String filename = rs.getString("Username");
             Usernames.add(filename);
         }
         
         List<JLabel> labels = new ArrayList<>();
         for(int i = 0 ; i<Usernames.size();i++){
        
             JLabel label = new JLabel(Usernames.get(i));
       
     label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
        String username = label.getText();
        try {
               
                    
                    String qr = "Select feedback from feedback where Username ='"+username+"'";
                    ResultSet r = s.executeQuery(qr);
                    if(r.next()){
                               AFeedback a = new AFeedback();
                    a.Username.setText(username);
                    a.Feed.setText(r.getString(1));
                               a.setVisible(true);
                    }
             
                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null,"Error");
                }
 
 }
 });
             labels.add(label);            
         }
        
         int length = labels.size();
       
                for (int i = 0; i <length; i++) {
                   
                    labels.add(new JLabel(". Label " + i));        
                    Paneel.add(labels.get(i));
                      Paneel.add(Box.createRigidArea(new Dimension(0, 10)));
                }
                for (JLabel label : labels) {
                    
                    label.setFont(new Font("Century Gothic", Font.PLAIN, 20));
   try{
   
   ResultSet rs1 = s.executeQuery("Select Imagefile from ProfileImage where Username ='"+label.getText()+"'");
     if(rs1.next()){
   byte[] iconBytes = rs1.getBytes("Imagefile");
   ByteArrayInputStream bs = new  ByteArrayInputStream(iconBytes);
   ObjectInputStream os = new ObjectInputStream(bs);
   ImageIcon icon = (ImageIcon) os.readObject();
                   Image originalimage = ((ImageIcon)icon).getImage();
                   
                   Image resizedimage = originalimage.getScaledInstance(30,30,Image.SCALE_SMOOTH);
             Icon smallerIcon = new ImageIcon(resizedimage);
             label.setIcon(smallerIcon);   
   }
   }
   catch(Exception e){
           JOptionPane.showMessageDialog(null,"E");
   }
                }
                Paneel.setLayout(new BoxLayout(Paneel, BoxLayout.Y_AXIS));
                Paneel.setBorder(BorderFactory.createEmptyBorder(10, 30, 0, 0));
                 pack();
                setVisible(true);
     }
     catch(Exception e){
              JOptionPane.showMessageDialog(null,"M");
         
     }    
    }//GEN-LAST:event_ShowMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
       String[] options = {"Yes", "No"};
         int selectedOption = JOptionPane.showOptionDialog(null,"Are You Ready To delete this ?","Options", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
       if (selectedOption == 0) {
           try{
            Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
               Statement s = c.createStatement();
           String query ="Delete From Feedback";
           
         PreparedStatement ptst = c.prepareStatement(query);
         ptst.executeUpdate();
          JOptionPane.showMessageDialog(null,"Deleted Succesfully ....");
       }
       catch(Exception e){
           
       } 
       }
       
    }//GEN-LAST:event_DeleteMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        String[] options = {"Yes", "No"};
        int selectedOption = JOptionPane.showOptionDialog(null,"Are You Sure want to Log Out ?","Options", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (selectedOption == 0) {
            setVisible(false);
            Login l = new Login();
            l.setVisible(true);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void NotifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotifyMouseClicked
        Notification n  = new Notification();
        n.setVisible(true);
    }//GEN-LAST:event_NotifyMouseClicked

    private void UserdetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserdetailMouseClicked
        // TODO add your handling code here:

        try {
            UserDetails u = new UserDetails();

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
            Statement s = c.createStatement();
            String q = "Select Fullname,Email,Username,Phone_no from login";
            ResultSet rs = s.executeQuery(q);
            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            DefaultTableModel tb = (DefaultTableModel) u.Table.getModel();

            int col = rsmd.getColumnCount();
            String[] colName = new String[col+1];
            for(int i = 0 ;i<col;i++){
                colName[i]= rsmd.getColumnName(i+1);
                tb.setColumnIdentifiers(colName);
                String Name,Email,Username,Phone,Block=null;
                while(rs.next()){
                    Name = rs.getString(1);
                    Email= rs.getString(2);
                    Username = rs.getString(3);
                    Phone = rs.getString(4);
                    String[] row = {Name,Email,Username,Phone,Block};
                    tb.addRow(row);
                   
                }

            }
            u.Table.setFont(new Font("Candara", Font.PLAIN, 16));
      TableColumnModel columnModel = u.Table.getColumnModel();
TableColumn column = columnModel.getColumn(4);
// Set the column header value for the column.
column.setHeaderValue("Block");
        int numSelected = 0;


            u.setVisible(true);
            s.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_UserdetailMouseClicked

    private void ProfileIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileIconMouseClicked

    }//GEN-LAST:event_ProfileIconMouseClicked

    private void NameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameMouseClicked
try{
            
          
         Class.forName("com.mysql.cj.jdbc.Driver");
          Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
               Statement s = c.createStatement();
                
        List<String> Usernames = new ArrayList<>();
        
     String query = "Select Username from Feedback";
               ResultSet rs = s.executeQuery(query); 
              
         while(rs.next()){
            
          
             String filename = rs.getString("Username");
             Usernames.add(filename);
         }
         
         List<JLabel> labels = new ArrayList<>();
         for(int i = 0 ; i<Usernames.size();i++){
        
             JLabel label = new JLabel(Usernames.get(i));
       

             labels.add(label);            
         }
        
         int length = labels.size();
       
                for (int i = 0; i <length; i++) {
                   
                    labels.add(new JLabel(". Label " + i));        
                    Paneel.add(labels.get(i));
                      Paneel.add(Box.createRigidArea(new Dimension(0, 10)));
                }
                for (JLabel label : labels) {
                    
                    label.setFont(new Font("Century Gothic", Font.PLAIN, 20));
   try{
   
   ResultSet rs1 = s.executeQuery("Select Imagefile from ProfileImage where Username ='"+label.getText()+"'");
     if(rs1.next()){
   byte[] iconBytes = rs1.getBytes("Imagefile");
   ByteArrayInputStream bs = new  ByteArrayInputStream(iconBytes);
   ObjectInputStream os = new ObjectInputStream(bs);
   ImageIcon icon = (ImageIcon) os.readObject();
                   Image originalimage = ((ImageIcon)icon).getImage();
                   
                   Image resizedimage = originalimage.getScaledInstance(30,30,Image.SCALE_SMOOTH);
             Icon smallerIcon = new ImageIcon(resizedimage);
             label.setIcon(smallerIcon);   
   }
   }
   catch(Exception e){
           JOptionPane.showMessageDialog(null,"E");
   }
                }
                Paneel.setLayout(new BoxLayout(Paneel, BoxLayout.Y_AXIS));
                Paneel.setBorder(BorderFactory.createEmptyBorder(10, 30, 0, 0));
                 pack();
                setVisible(true);
     }
     catch(Exception e){
              JOptionPane.showMessageDialog(null,"M");
         
     }    
        // TODO add your handling code here:
    }//GEN-LAST:event_NameMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel ACDate;
    protected javax.swing.JLabel Delete;
    public javax.swing.JLabel Home;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Notify;
    private javax.swing.JPanel Paneel;
    private com.UserDashboard.Profileicon ProfileIcon;
    private javax.swing.JLabel Show;
    private javax.swing.JLabel User;
    private javax.swing.JLabel Userdetail;
    public javax.swing.JLabel Wish;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.AdminDashboard.LeftPanel leftPanel1;
    // End of variables declaration//GEN-END:variables
}
