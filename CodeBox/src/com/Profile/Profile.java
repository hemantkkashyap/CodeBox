package com.Profile;

import com.Connectivity.Connectivity;
import com.UserDashboard.Dashboard;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
public class Profile extends javax.swing.JFrame {

    public void setPhoto(Icon icon){
        Photo.setIcon(icon);
        
    }
    
    public void setDetails(String bio, String role,String country,String education,String linkedin_id){
       Bio1.setText(bio);
    Role.setText(role);
    Country.setText(country);
    Education.setText(education);
      Linkedin_Id.setText(linkedin_id);  
        
    }
    
    public void setEssentialDetails(String name,String email,String no,String username){
       Name.setText(name);
    Email.setText(email);
    Pno.setText(no);
    pUsername.setText(username);
    PUser.setText(username);
    }
    
    
    public Profile() {
        initComponents();         
              try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator7 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        topbar1 = new com.Profile.Topbar();
        Back = new javax.swing.JLabel();
        profilepanel1 = new com.Profile.Profilepanel();
        Photo = new com.Profile.Photo();
        EditPhoto = new javax.swing.JButton();
        PUser = new javax.swing.JLabel();
        Edit_Profile = new javax.swing.JButton();
        Bio1 = new javax.swing.JLabel();
        Country = new javax.swing.JTextField();
        Linkedin_Id = new javax.swing.JTextField();
        detailsPanel1 = new com.Profile.DetailsPanel();
        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Pno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Role = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Education = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1099, 602));
        setMinimumSize(new java.awt.Dimension(1099, 602));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(null);

        topbar1.setBackground(new java.awt.Color(245, 245, 245));
        topbar1.setBottomleft(20);
        topbar1.setBottomright(20);
        topbar1.setMinimumSize(new java.awt.Dimension(870, 47));
        topbar1.setPreferredSize(new java.awt.Dimension(870, 47));
        topbar1.setTopleft(20);
        topbar1.setTopright(20);
        topbar1.setLayout(null);

        Back.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/ppp.png"))); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        topbar1.add(Back);
        Back.setBounds(10, 10, 40, 30);

        jPanel1.add(topbar1);
        topbar1.setBounds(0, 0, 1110, 50);

        profilepanel1.setBackground(new java.awt.Color(255, 255, 255));
        profilepanel1.setBottomleft(25);
        profilepanel1.setBottomright(25);
        profilepanel1.setTopleft(25);
        profilepanel1.setTopright(25);
        profilepanel1.setLayout(null);

        Photo.setBackground(new java.awt.Color(255, 255, 255));
        Photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/PIcon.png"))); // NOI18N
        Photo.setBottomleft(500);
        Photo.setBottomright(500);
        Photo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Photo.setMaximumSize(new java.awt.Dimension(100, 100));
        Photo.setMinimumSize(new java.awt.Dimension(100, 100));
        Photo.setPreferredSize(new java.awt.Dimension(100, 100));
        Photo.setTopleft(500);
        Photo.setTopright(500);
        profilepanel1.add(Photo);
        Photo.setBounds(40, 30, 220, 220);

        EditPhoto.setBackground(new java.awt.Color(254, 254, 254));
        EditPhoto.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        EditPhoto.setText("+");
        EditPhoto.setBorder(null);
        EditPhoto.setBorderPainted(false);
        EditPhoto.setContentAreaFilled(false);
        EditPhoto.setFocusPainted(false);
        EditPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPhotoActionPerformed(evt);
            }
        });
        profilepanel1.add(EditPhoto);
        EditPhoto.setBounds(230, 230, 30, 30);

        PUser.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        PUser.setText("Hemant@123");
        profilepanel1.add(PUser);
        PUser.setBounds(90, 260, 158, 30);

        Edit_Profile.setBackground(new java.awt.Color(51, 109, 255));
        Edit_Profile.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Edit_Profile.setForeground(new java.awt.Color(255, 255, 255));
        Edit_Profile.setText("Edit Profile");
        Edit_Profile.setBorder(null);
        Edit_Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_ProfileActionPerformed(evt);
            }
        });
        profilepanel1.add(Edit_Profile);
        Edit_Profile.setBounds(20, 340, 130, 39);

        Bio1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        Bio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bio1.setText("Write about Your Role here ");
        profilepanel1.add(Bio1);
        Bio1.setBounds(60, 290, 210, 30);

        Country.setEditable(false);
        Country.setBackground(new java.awt.Color(255, 255, 255));
        Country.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        Country.setBorder(null);
        Country.setOpaque(true);
        Country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountryActionPerformed(evt);
            }
        });
        profilepanel1.add(Country);
        Country.setBounds(20, 390, 280, 30);

        Linkedin_Id.setEditable(false);
        Linkedin_Id.setBackground(new java.awt.Color(255, 255, 255));
        Linkedin_Id.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        Linkedin_Id.setBorder(null);
        Linkedin_Id.setOpaque(true);
        Linkedin_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Linkedin_IdActionPerformed(evt);
            }
        });
        profilepanel1.add(Linkedin_Id);
        Linkedin_Id.setBounds(20, 440, 270, 30);

        jPanel1.add(profilepanel1);
        profilepanel1.setBounds(10, 60, 310, 490);

        detailsPanel1.setBackground(new java.awt.Color(255, 255, 255));
        detailsPanel1.setBottomleft(25);
        detailsPanel1.setBottomright(25);
        detailsPanel1.setTopleft(25);
        detailsPanel1.setTopright(25);
        detailsPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel1.setText("Name        ");
        detailsPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 130, 30);

        Name.setEditable(false);
        Name.setBackground(new java.awt.Color(255, 255, 255));
        Name.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        Name.setBorder(null);
        Name.setFocusable(false);
        Name.setRequestFocusEnabled(false);
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        detailsPanel1.add(Name);
        Name.setBounds(20, 40, 360, 30);

        jLabel3.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel3.setText("Email ID     ");
        detailsPanel1.add(jLabel3);
        jLabel3.setBounds(20, 90, 130, 30);

        Email.setEditable(false);
        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        Email.setBorder(null);
        Email.setFocusable(false);
        Email.setRequestFocusEnabled(false);
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        detailsPanel1.add(Email);
        Email.setBounds(20, 120, 480, 30);

        jLabel4.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel4.setText("Username  ");
        detailsPanel1.add(jLabel4);
        jLabel4.setBounds(20, 170, 130, 30);

        pUsername.setEditable(false);
        pUsername.setBackground(new java.awt.Color(255, 255, 255));
        pUsername.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        pUsername.setBorder(null);
        pUsername.setFocusable(false);
        pUsername.setRequestFocusEnabled(false);
        detailsPanel1.add(pUsername);
        pUsername.setBounds(20, 200, 280, 30);

        jLabel5.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel5.setText("Phone no  ");
        detailsPanel1.add(jLabel5);
        jLabel5.setBounds(20, 250, 130, 30);

        Pno.setEditable(false);
        Pno.setBackground(new java.awt.Color(255, 255, 255));
        Pno.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        Pno.setBorder(null);
        Pno.setFocusable(false);
        Pno.setRequestFocusEnabled(false);
        Pno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PnoActionPerformed(evt);
            }
        });
        detailsPanel1.add(Pno);
        Pno.setBounds(20, 280, 370, 30);

        jLabel9.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel9.setText("I am currently a *");
        detailsPanel1.add(jLabel9);
        jLabel9.setBounds(20, 400, 190, 30);

        Role.setEditable(false);
        Role.setBackground(new java.awt.Color(255, 255, 255));
        Role.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        Role.setBorder(null);
        Role.setOpaque(true);
        Role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleActionPerformed(evt);
            }
        });
        detailsPanel1.add(Role);
        Role.setBounds(20, 440, 280, 30);

        jLabel6.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel6.setText("Select Education");
        detailsPanel1.add(jLabel6);
        jLabel6.setBounds(20, 330, 220, 30);

        Education.setEditable(false);
        Education.setBackground(new java.awt.Color(255, 255, 255));
        Education.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        Education.setBorder(null);
        Education.setOpaque(true);
        Education.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationActionPerformed(evt);
            }
        });
        detailsPanel1.add(Education);
        Education.setBounds(20, 370, 340, 30);

        jPanel1.add(detailsPanel1);
        detailsPanel1.setBounds(330, 60, 750, 490);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-3, -3, 1280, 570);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
       setVisible(false);
        Dashboard d = new Dashboard();
        d.setVisible(true);
        d.setUsername(PUser.getText());
        try{
            Connectivity c = new Connectivity();

            String query1 = "select Note from Notes where Username = '"+PUser.getText()+"'";
            ResultSet rs1 = c.s.executeQuery(query1);

            if(rs1.next()){
               
                d.setNotes(rs1.getString(1));
                String query3 = "select Fullname from login where Username = '"+PUser.getText()+"'";
                ResultSet rs3 = c.s.executeQuery(query3);

                if(rs3.next()){

                    d.setName(rs3.getString(1));
                    LocalDateTime Ct = LocalDateTime.now();
                    Date Cd = new Date();
                    SimpleDateFormat Df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String Fd = Df.format(Cd);
                    d.CDate.setText(Fd);
                    int hr = Ct.getHour();

                    if(hr>1&&hr<12){
                        d.Wish.setText("Good Morning!");
                    }
                    else if(hr>12&&hr<18){
                        d.Wish.setText("Good Evening!");
                    }
                    else{
                        d.Wish.setText("Good Night!");
                    }
              try{  
   Icon icon = Photo.getIcon();
                   Image originalimage = ((ImageIcon)icon).getImage();
                   
                   Image resizedimage = originalimage.getScaledInstance(70,70,Image.SCALE_SMOOTH);
             Icon smallerIcon = new ImageIcon(resizedimage);     
           d.setIcon(smallerIcon);
              }
              catch(Exception e){
                  System.out.println("Error");
              }
                }
               
                
            }
          else{      
                    String query4 = "select Fullname from login where Username = '"+PUser.getText()+"'";
                ResultSet rs4 = c.s.executeQuery(query4);

                if(rs4.next()){

                   
                    d.setName(rs4.getString(1));
                    LocalDateTime Ct = LocalDateTime.now();
                    Date Cd = new Date();
                    SimpleDateFormat Df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String Fd = Df.format(Cd);
                    d.CDate.setText(Fd);
                    int hr = Ct.getHour();

                    if(hr>1&&hr<12){
                        d.Wish.setText("Good Morning!");
                    }
                    else if(hr>12&&hr<18){
                        d.Wish.setText("Good Evening!");
                    }
                    else{
                        d.Wish.setText("Good Night!");
                    }
              try{  
   Icon icon = Photo.getIcon();
                   Image originalimage = ((ImageIcon)icon).getImage();
                   
                   Image resizedimage = originalimage.getScaledInstance(70,70,Image.SCALE_SMOOTH);
             Icon smallerIcon = new ImageIcon(resizedimage);     
           d.setIcon(smallerIcon);
              
              }
              catch(Exception e){
                  System.out.println("Error");
              }        
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_BackMouseClicked

    private void RoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoleActionPerformed

    private void PnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PnoActionPerformed

    private void Edit_ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_ProfileActionPerformed

        Editprofile e = new Editprofile();
        e.setUsername(PUser.getText());
      e.setVisible(true);
 
    }//GEN-LAST:event_Edit_ProfileActionPerformed

    private void EditPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPhotoActionPerformed
          JFileChooser F = new JFileChooser();
        int result = F.showOpenDialog(null);

        if(result==JFileChooser.APPROVE_OPTION){
            File selectedFile = F.getSelectedFile();
         
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
               Statement s = c.createStatement();
                BufferedImage squareimage = ImageIO.read(selectedFile);
                if(squareimage.getHeight()<220&&squareimage.getWidth()<220){
                    JOptionPane.showMessageDialog(null,"image cannot upload");
                }
                else if(squareimage.getHeight()>220&&squareimage.getWidth()>220){
                    JOptionPane.showMessageDialog(null,"image cannot upload");
                }
                else{
                    BufferedImage circluarimage = createCircluarImage(squareimage);
                ImageIcon circularicon = new ImageIcon(circluarimage);
                
                Photo.setIcon(circularicon);
              ResultSet rs = s.executeQuery("select * from ProfileImage where Username = '"+PUser.getText()+"'");
                if(rs.next()){
                     String q = "UPDATE ProfileImage set Imagefile = ? where Username = ?";
              try(PreparedStatement ptst = c.prepareStatement(q)){
                    
                  ByteArrayOutputStream bs = new ByteArrayOutputStream();
                  ObjectOutputStream os = new ObjectOutputStream(bs);
                  os.writeObject(circularicon);
                  byte[] iconBytes = bs.toByteArray();
                 
                  ptst.setBytes(1, iconBytes);
                   ptst.setString(2,PUser.getText());
      
                   ptst.execute();

                JOptionPane.showMessageDialog(null,"Image Updated Successfully");
   
                }
               catch(Exception e){
                    e.printStackTrace();
                }
                }
                else{
                    String query = "insert into ProfileImage values(?,?)";
              try(PreparedStatement ptst = c.prepareStatement(query)){
                    ptst.setString(1,PUser.getText());
                  ByteArrayOutputStream bs = new ByteArrayOutputStream();
                  ObjectOutputStream os = new ObjectOutputStream(bs);
                  os.writeObject(circularicon);
                  byte[] iconBytes = bs.toByteArray();
                  ptst.setBytes(2, iconBytes);
      
                   ptst.execute();

                JOptionPane.showMessageDialog(null,"Image Uploaded Successfully");
                
             
               
                        }
                catch(Exception e){
                    e.printStackTrace();
                }
                }
               
                }
                
            }
            catch(Exception e){
                e.printStackTrace();
            }

            
        }
    }//GEN-LAST:event_EditPhotoActionPerformed

    private void Linkedin_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Linkedin_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Linkedin_IdActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void CountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CountryActionPerformed

    private void EducationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EducationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EducationActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Bio1;
    private javax.swing.JTextField Country;
    private javax.swing.JButton EditPhoto;
    private javax.swing.JButton Edit_Profile;
    private javax.swing.JTextField Education;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Linkedin_Id;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel PUser;
    private com.Profile.Photo Photo;
    private javax.swing.JTextField Pno;
    private javax.swing.JTextField Role;
    private com.Profile.DetailsPanel detailsPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField pUsername;
    private com.Profile.Profilepanel profilepanel1;
    private com.Profile.Topbar topbar1;
    // End of variables declaration//GEN-END:variables

    private BufferedImage createCircluarImage(BufferedImage squareimage) {
      int diameter = Math.min(squareimage.getWidth(), squareimage.getHeight());
      
      BufferedImage circularimage = new BufferedImage(diameter,diameter,BufferedImage.TYPE_INT_ARGB);
     
      Graphics2D g2d = circularimage.createGraphics();
      g2d.setClip(new Ellipse2D.Float(0,0,diameter,diameter));
      
      g2d.drawImage(squareimage,0,0,diameter,diameter,null);
      
      g2d.dispose();
      return circularimage ;
    
    }
}
