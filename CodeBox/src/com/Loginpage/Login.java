package com.Loginpage;
import com.AdminDashboard.AdminDashboard;
import com.Connectivity.Connectivity;
import com.ForgetPassword.Forget;
import com.Registration.Register;
import com.UserDashboard.Dashboard;
import java.awt.*;
import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.*;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
          try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame2 = new com.Loginpage.Frame();
        Heading1 = new javax.swing.JLabel();
        Heading2 = new javax.swing.JLabel();
        Head = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        Pass = new javax.swing.JLabel();
        Check = new javax.swing.JRadioButton();
        Forget = new javax.swing.JLabel();
        Rolee = new com.Loginpage.Rolebtn();
        logbtn1 = new com.Loginpage.Logbtn();
        Username = new com.Loginpage.Usernametxt();
        Password = new com.Loginpage.Passwordtxt();
        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        Bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1099, 602));
        setMinimumSize(new java.awt.Dimension(1099, 602));
        getContentPane().setLayout(null);

        frame2.setBackground(new java.awt.Color(255, 255, 255));
        frame2.setBottomleft(50);
        frame2.setBottomright(50);
        frame2.setTopleft(50);
        frame2.setTopright(50);
        frame2.setLayout(null);

        Heading1.setFont(new java.awt.Font("Bell MT", 0, 45)); // NOI18N
        Heading1.setForeground(new java.awt.Color(51, 51, 255));
        Heading1.setText("CODE");
        frame2.add(Heading1);
        Heading1.setBounds(110, 30, 126, 40);

        Heading2.setFont(new java.awt.Font("Bell MT", 0, 45)); // NOI18N
        Heading2.setForeground(new java.awt.Color(255, 153, 0));
        Heading2.setText("BOX");
        frame2.add(Heading2);
        Heading2.setBounds(180, 70, 117, 40);

        Head.setFont(new java.awt.Font("Candara", 0, 30)); // NOI18N
        Head.setText("Login Here");
        frame2.add(Head);
        Head.setBounds(114, 130, 180, 37);

        User.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        User.setText("Username");
        frame2.add(User);
        User.setBounds(50, 183, 280, 30);

        Pass.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        Pass.setText("Password");
        frame2.add(Pass);
        Pass.setBounds(50, 271, 120, 30);

        Check.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        Check.setText("Show Password");
        Check.setContentAreaFilled(false);
        Check.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Check.setFocusPainted(false);
        Check.setFocusable(false);
        Check.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckMouseClicked(evt);
            }
        });
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });
        frame2.add(Check);
        Check.setBounds(50, 350, 140, 20);

        Forget.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        Forget.setText("Forget Password ?");
        Forget.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Forget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ForgetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ForgetMouseExited(evt);
            }
        });
        frame2.add(Forget);
        Forget.setBounds(220, 350, 130, 20);

        Rolee.setBackground(new java.awt.Color(51, 102, 255));
        Rolee.setBorder(null);
        Rolee.setForeground(new java.awt.Color(255, 255, 255));
        Rolee.setText("User");
        Rolee.setBorderPainted(false);
        Rolee.setBottomleft(35);
        Rolee.setBottomright(35);
        Rolee.setContentAreaFilled(false);
        Rolee.setFocusPainted(false);
        Rolee.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        Rolee.setTopleft(35);
        Rolee.setTopright(35);
        Rolee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleeActionPerformed(evt);
            }
        });
        frame2.add(Rolee);
        Rolee.setBounds(269, 13, 80, 30);

        logbtn1.setBackground(new java.awt.Color(0, 102, 255));
        logbtn1.setBorder(null);
        logbtn1.setForeground(new java.awt.Color(255, 255, 255));
        logbtn1.setText("Log In");
        logbtn1.setBorderPainted(false);
        logbtn1.setBottomleft(50);
        logbtn1.setBottomright(50);
        logbtn1.setContentAreaFilled(false);
        logbtn1.setFocusPainted(false);
        logbtn1.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        logbtn1.setTopleft(50);
        logbtn1.setTopright(50);
        logbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logbtn1ActionPerformed(evt);
            }
        });
        frame2.add(logbtn1);
        logbtn1.setBounds(90, 390, 200, 50);

        Username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 3, true));
        Username.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        frame2.add(Username);
        Username.setBounds(50, 210, 280, 40);

        Password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 3, true));
        Password.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        frame2.add(Password);
        Password.setBounds(50, 302, 280, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/LLogo.jpg"))); // NOI18N
        frame2.add(jLabel1);
        jLabel1.setBounds(10, 10, 80, 80);

        getContentPane().add(frame2);
        frame2.setBounds(370, 50, 370, 480);

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/ppp.png"))); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(10, 10, 40, 40);

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/Lo.jpg"))); // NOI18N
        Bg.setText("jLabel1");
        getContentPane().add(Bg);
        Bg.setBounds(-590, -10, 1690, 780);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
  
  
    }//GEN-LAST:event_LoginActionPerformed

    private void RoleeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleeActionPerformed

        if(Rolee.isSelected()){
           Rolee.setText("Admin");
           User.setText("Admin Username");
           Forget.setVisible(false);
         
       }
       else{
          Rolee.setText("User"); 
           User.setText("Username");
           Forget.setVisible(true);
           
       }  
    }//GEN-LAST:event_RoleeActionPerformed

    private void ForgetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgetMouseExited
        // It will set the forget label foreground to black on click
        Forget.setForeground(Color.BLACK);
    }//GEN-LAST:event_ForgetMouseExited

    private void ForgetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgetMouseEntered
        // It will set the forget label foreground to blue on click
        Forget.setForeground(Color.BLUE);
    }//GEN-LAST:event_ForgetMouseEntered

    private void ForgetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgetMouseClicked
        // It is redirect the user to forget password Page...
        setVisible(false);
        Forget f = new Forget();
        f.setVisible(true);
    }//GEN-LAST:event_ForgetMouseClicked

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed

    }//GEN-LAST:event_CheckActionPerformed

    private void CheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckMouseClicked
        //for Checking the Password ....
        if(Check.isSelected()){
            Password.setEchoChar((char)0);
        }
        else{
            Password.setEchoChar('*');
        }
    }//GEN-LAST:event_CheckMouseClicked

    private void RoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolebtn1ActionPerformed
     
    }//GEN-LAST:event_rolebtn1ActionPerformed

    private void logbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logbtn1ActionPerformed
    /* Here if User select actor select user after login he will
        be redirected to Userdashboard and if the actor is Admin he will 
        redirected to admin Dashboard.
        */
        
        if(Rolee.isSelected()){
          AdminDashboard ad = new AdminDashboard(); 
      try{
            String username = Username.getText();
            String password = new String(Password.getPassword());
         
            if(username.endsWith("Admin@1")&&password.endsWith("12345678")){
                
             setVisible(false);
  ad.setVisible(true);
        //It will set the Date and Time in the Dashboard..
                        LocalDateTime Ct = LocalDateTime.now();
                        Date Cd = new Date();
                        SimpleDateFormat Df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String Fd = Df.format(Cd);
                        ad.ACDate.setText(Fd);
                        int hr = Ct.getHour();

                        if(hr>1&&hr<12){
                            ad.Wish.setText("Good Morning!");
                        }
                        else if(hr>12&&hr<18){
                            ad.Wish.setText("Good Evening!");
                        }
                        else{
                            ad.Wish.setText("Good Night!");
                        }
                   
                }
               
            
            else{
                Username.setText("");
                Password.setText("");
           
                
                //Show Error message ..
        JOptionPane.showMessageDialog(null,"Invalid username or Password ");

        }

        }

        catch(Exception e){
            e.printStackTrace();
        } 
  }
  else{
     // Users Dashboard ...
       try{
            String username = Username.getText();
            String password = new String(Password.getPassword());
            Dashboard d = new Dashboard();
            Connectivity c = new Connectivity();
            // Query for checking the validation of User from Database .
            String query1 = "select*from login where Username = '"+username+"'and Pass = '"+password+"'";

            ResultSet rs = c.s.executeQuery(query1);

            if(rs.next()){
         //Query for selecting image of user from the database ...       
                ResultSet rs1 = c.s.executeQuery("Select Imagefile from ProfileImage where Username ='"+username+"'");
     if(rs1.next()){
   byte[] iconBytes = rs1.getBytes("Imagefile");
   ByteArrayInputStream bs = new  ByteArrayInputStream(iconBytes);
   ObjectInputStream os = new ObjectInputStream(bs);
   ImageIcon icon = (ImageIcon) os.readObject();
                   Image originalimage = ((ImageIcon)icon).getImage();
         Image resizedimage = originalimage.getScaledInstance(70,70,Image.SCALE_SMOOTH);
             Icon smallerIcon = new ImageIcon(resizedimage);
             d.setIcon(smallerIcon);
     }
              setVisible(false);
               d.setUsername(username);
               
                d.setVisible(true);
                
       //Query for slecting Notes of User from the databse...
                String query2 = "select Note from Notes where Username = '"+username+"'";
                ResultSet rs2 = c.s.executeQuery(query2);

                if(rs2.next()){
               d.setNotes(rs2.getString(1));
                    
                     //Query for slecting Fullname of User from the databse...
                    String query3 = "select Fullname from login where Username = '"+username+"'";
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
                    }
                }
                else{
                     d.setNotes("");
                     //Query for slecting Fullname of User from the databse...
                    String query3 = "select Fullname from login where Username = '"+username+"'";
                    ResultSet rs3 = c.s.executeQuery(query3);

                    if(rs3.next()){

                   
                       d.setName(rs3.getString("Fullname"));
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
                    }
                }
         
        }
            else{
                Username.setText("");
                Password.setText("");
              
                 //Show Error message..
        JOptionPane.showMessageDialog(null,"Invalid username or Password ");

        }

        }

        catch( HeadlessException | SQLException e){
            e.printStackTrace();
        } catch (IOException ex) {
           
        } catch (ClassNotFoundException ex) {
            
        }
  }
    }//GEN-LAST:event_logbtn1ActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // This will redirect to login page ..
        setVisible(false);

    }//GEN-LAST:event_BackMouseClicked
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Bg;
    private javax.swing.JRadioButton Check;
    private javax.swing.JLabel Forget;
    private javax.swing.JLabel Head;
    private javax.swing.JLabel Heading1;
    private javax.swing.JLabel Heading2;
    private javax.swing.JLabel Pass;
    private com.Loginpage.Passwordtxt Password;
    private com.Loginpage.Rolebtn Rolee;
    private javax.swing.JLabel User;
    private com.Loginpage.Usernametxt Username;
    private com.Loginpage.Frame frame2;
    private javax.swing.JLabel jLabel1;
    private com.Loginpage.Logbtn logbtn1;
    // End of variables declaration//GEN-END:variables
}
