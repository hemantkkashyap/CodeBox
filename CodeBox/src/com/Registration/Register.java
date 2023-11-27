
package com.Registration;

import com.Loginpage.Login;
import com.mail.OTPCountdownApp;
import com.mail.OTPSessionCountdow;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Register extends JFrame {
     private Mailing m = new Mailing();
        private static final int OTP_EXPIRATION_SECONDS = 30; // 5 minutes
    private int countdown = OTP_EXPIRATION_SECONDS;
    private Timer timer;
    private JLabel countdownLabel;
     private String checkotp = "CODEBOX";
    
    public Register() {
  initComponents();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            countdownLabel = new JLabel(getFormattedTime());
              countdownLabel.setBounds(560, 500, 100, 30); // Set the bounds of the label
        frame1.add(countdownLabel); 
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    
              
              
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        frame1 = new com.Registration.Frame();
        Name = new com.Registration.Nametxt();
        Emailid = new com.Registration.Emailtxt();
        Username = new com.Registration.Usernametxt();
        Phoneno = new com.Registration.Phonenotxt();
        Password = new com.Registration.Passwordtxt();
        CPassword = new com.Registration.CPasswordtxt();
        Terms = new javax.swing.JRadioButton();
        SecurityQ = new javax.swing.JTextField();
        Answer = new javax.swing.JTextField();
        heading = new javax.swing.JLabel();
        Hname = new javax.swing.JLabel();
        Hemail = new javax.swing.JLabel();
        Husernname = new javax.swing.JLabel();
        Hphoneno = new javax.swing.JLabel();
        Hpassword = new javax.swing.JLabel();
        Hcpassword = new javax.swing.JLabel();
        HsecuirtyQ = new javax.swing.JLabel();
        Hanswer = new javax.swing.JLabel();
        Regsitartion = new com.Registration.Registrationbtn();
        Hanswer1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Userotp = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1099, 602));
        setMinimumSize(new java.awt.Dimension(1099, 602));
        getContentPane().setLayout(null);

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/ppp.png"))); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(10, 10, 39, 40);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        frame1.setBackground(new java.awt.Color(255, 255, 255));
        frame1.setBottomleft(50);
        frame1.setBottomright(50);
        frame1.setTopleft(50);
        frame1.setTopright(50);
        frame1.setLayout(null);

        Name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 230, 230), 3, true));
        Name.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        frame1.add(Name);
        Name.setBounds(40, 150, 300, 40);

        Emailid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 230, 230), 3, true));
        Emailid.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        frame1.add(Emailid);
        Emailid.setBounds(390, 150, 320, 40);

        Username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 230, 230), 3, true));
        Username.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        frame1.add(Username);
        Username.setBounds(40, 230, 300, 40);

        Phoneno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 230, 230), 3, true));
        Phoneno.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        frame1.add(Phoneno);
        Phoneno.setBounds(390, 230, 320, 40);

        Password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 230, 230), 3, true));
        Password.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        frame1.add(Password);
        Password.setBounds(40, 310, 300, 40);

        CPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 230, 230), 3, true));
        CPassword.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        frame1.add(CPassword);
        CPassword.setBounds(390, 310, 320, 40);

        Terms.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        Terms.setForeground(new java.awt.Color(0, 0, 255));
        Terms.setText("Term's and Condition");
        Terms.setContentAreaFilled(false);
        Terms.setFocusPainted(false);
        Terms.setFocusable(false);
        frame1.add(Terms);
        Terms.setBounds(40, 370, 187, 25);

        SecurityQ.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        SecurityQ.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 230, 230), 3, true));
        SecurityQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecurityQActionPerformed(evt);
            }
        });
        frame1.add(SecurityQ);
        SecurityQ.setBounds(290, 410, 350, 31);

        Answer.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        Answer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 230, 230), 3, true));
        frame1.add(Answer);
        Answer.setBounds(290, 460, 350, 31);

        heading.setFont(new java.awt.Font("Candara", 0, 44)); // NOI18N
        heading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/LLogo.jpg"))); // NOI18N
        heading.setText("Registration Here");
        frame1.add(heading);
        heading.setBounds(30, 10, 430, 90);

        Hname.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        Hname.setText("Name ");
        frame1.add(Hname);
        Hname.setBounds(40, 122, 80, 30);

        Hemail.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        Hemail.setText("Email_Id  ");
        frame1.add(Hemail);
        Hemail.setBounds(390, 120, 110, 30);

        Husernname.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        Husernname.setText("Username      ");
        frame1.add(Husernname);
        Husernname.setBounds(40, 200, 212, 35);

        Hphoneno.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        Hphoneno.setText("Phone Number   ");
        frame1.add(Hphoneno);
        Hphoneno.setBounds(390, 200, 203, 35);

        Hpassword.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        Hpassword.setText("Password      ");
        frame1.add(Hpassword);
        Hpassword.setBounds(40, 280, 198, 35);

        Hcpassword.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        Hcpassword.setText("Confirm Password ");
        frame1.add(Hcpassword);
        Hcpassword.setBounds(390, 280, 205, 35);

        HsecuirtyQ.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        HsecuirtyQ.setText("Enter Security Question :-");
        frame1.add(HsecuirtyQ);
        HsecuirtyQ.setBounds(40, 410, 240, 27);

        Hanswer.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        Hanswer.setText("Enter Otp :-");
        frame1.add(Hanswer);
        Hanswer.setBounds(170, 510, 120, 27);

        Regsitartion.setBackground(new java.awt.Color(51, 102, 255));
        Regsitartion.setBorder(null);
        Regsitartion.setForeground(new java.awt.Color(255, 255, 255));
        Regsitartion.setText("Regsiter");
        Regsitartion.setBorderPainted(false);
        Regsitartion.setBottomleft(20);
        Regsitartion.setBottomright(20);
        Regsitartion.setContentAreaFilled(false);
        Regsitartion.setFocusPainted(false);
        Regsitartion.setFont(new java.awt.Font("Cambria", 0, 26)); // NOI18N
        Regsitartion.setTopleft(20);
        Regsitartion.setTopright(20);
        Regsitartion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegsitartionActionPerformed(evt);
            }
        });
        frame1.add(Regsitartion);
        Regsitartion.setBounds(720, 420, 170, 50);

        Hanswer1.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        Hanswer1.setText("Answer :-");
        frame1.add(Hanswer1);
        Hanswer1.setBounds(190, 460, 88, 27);

        jButton1.setText("get OTP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        frame1.add(jButton1);
        jButton1.setBounds(440, 500, 100, 30);

        try {
            Userotp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        frame1.add(Userotp);
        Userotp.setBounds(290, 502, 130, 30);

        jPanel1.add(frame1);
        frame1.setBounds(60, 10, 950, 550);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1100, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SecurityQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecurityQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecurityQActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
      // This will redirect to login page ..
        setVisible(false);
       
    }//GEN-LAST:event_BackMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:     
    startCountdown();
    
    
    m.sendOtp(Username.getText(),Emailid.getText());
    this.checkotp = m.getOtp();
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RegsitartionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegsitartionActionPerformed
        // TODO add your handling code here:
          
        if(Name.getText().isEmpty()||Emailid.getText().isEmpty()||Username.getText().isEmpty()||Phoneno.getText().isEmpty()||Password.getText().isEmpty()||CPassword.getText().isEmpty()||SecurityQ.getText().isEmpty()||Answer.getText().isEmpty()){
      // IF any of the field is empty this error will be shown...    
            JOptionPane.showMessageDialog(null,"Enter All Detail's");
            } 
         
      if(Name.getText().length()>25){
            // IF name length is more then 25 this error will be shown...  
        JOptionPane.showMessageDialog(null,"Enter Valid Name...");  
      }
      else if(Name.getText().length()<25){
       // IF name length is less then 25 this will happen...
          if(!Emailid.getText().matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,10}")){
         // IF emai. l not valid this error will be shown.... 
              JOptionPane.showMessageDialog(null,"Enter Valid Email_ID");
            }
          else if(Emailid.getText().matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,10}")){
    // IF email  valid this  will be shown....       
     try{
       Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
       Statement s = c.createStatement();
       
   // QUery to check if email id alredy regsiterd or not ...
  ResultSet rs = s.executeQuery("select Email from login where Email = '"+Emailid.getText()+"'");
     
     
if(rs.next()){
    // IF resistered this error will be shown...
   JOptionPane.showMessageDialog(null,"Email Id already exists");
        }
else{
    //else this will happen....
   if(Username.getText().matches("[a-zA-Z0-9._-]{3,20}$")){
               // IF USername is not valid this error will be shown.
                JOptionPane.showMessageDialog(null,"Enter Valid Username");
    }
   else if(!Username.getText().matches("[a-zA-Z0-9._-]{3,20}$")){
       //else this will happen...
       try{
   // QUery to check if Username alredy regsiterd or not ...
  ResultSet rs1 = s.executeQuery("select Username from login where Username = '"+Username.getText()+"'");
     
     
if(rs1.next()){
    //If present this will shown...
   JOptionPane.showMessageDialog(null,"Username already exists");
        }
else{
    //else this will happen
    if(Phoneno.getText().length()<10||Phoneno.getText().length()>10){
        //If phoneno length is more than or less than 10 this will shown...
 JOptionPane.showMessageDialog(null,"Enter Valid Phone no !!");         
        
    }
    else{
   //else this will happen...     
    
    if(Password.getText().length()>8||CPassword.getText().length()>8){
   //If password length is more than or less than  this will shown...      
 JOptionPane.showMessageDialog(null,"Password length should not exceed 8 characters !!");         
           
    }
    else if(Password.getText().equals(CPassword.getText())){
  //IF password and Confrim Password  match this will happen....
        try{
            //IF term&xcondition is selected this will happen...
if(Terms.isSelected()){
    try{
   // Query to check if the Email is blocked by the admin or not....     
   String q = "Select Email_ID from BlockedUser where Email_ID = '"+Emailid.getText()+"'";
   
    ResultSet rs3 = s.executeQuery(q);
        
     if(rs3.next()){
         //If blocked this will shown....
    JOptionPane.showMessageDialog(null,"Email_Id already Exists try with another Email_Id");         
     }   
     else{
     
     if (this.checkotp == null) {
        // Your code..
        JOptionPane.showMessageDialog(null, "OTP Expired");
    } else if (this.checkotp.equals(Userotp.getText().trim())) {
        // Valid OTP, proceed with registration
        // ... (your existing registration code)
        
       // ... (your existing registration code)

String query = "INSERT INTO login (id, Fullname, Email, Username, Phone_no, Pass, CPass, SecurityQ, Answer) VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?)";

try (PreparedStatement ptst = c.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
    ptst.setString(1, Name.getText());
    ptst.setString(2, Emailid.getText());
    ptst.setString(3, Username.getText());
    ptst.setString(4, Phoneno.getText());
    ptst.setString(5, Password.getText());
    ptst.setString(6, CPassword.getText());
    ptst.setString(7, SecurityQ.getText());
    ptst.setString(8, Answer.getText());

    ptst.executeUpdate();

    try (ResultSet generatedKeys = ptst.getGeneratedKeys()) {
        if (generatedKeys.next()) {
            int id = generatedKeys.getInt(1);
            // Use the generated id as needed
            System.out.println("Generated ID: " + id);
        } else {
            // Handle the case where no key was generated (this should not happen for auto-increment columns)
            System.err.println("No generated keys for the registration");
        }
    }

    Mailing m = new Mailing();
    m.getEmailId(Username.getText(), Emailid.getText());
    JOptionPane.showMessageDialog(null, "Registered Successfully");
} catch (Exception e) {
    e.printStackTrace();
    // Handle the exception appropriately
}

                c.close();
                setVisible(false);
                Login p = new Login();
                p.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(null, "Invalid OTP");
    }
         
         
         
     // If not the user is registered...
     /*    
*/
            }
           
    }
    catch(Exception e){
        e.printStackTrace();
    }
              
}
 else{
    //when term&conditon is not selectedd this error is shown...
  JOptionPane.showMessageDialog(null,"Please accept the Terms & Condition");
            }  
        }
        catch(Exception e){
            e.printStackTrace();
        }   
    }
    else{
        //when Password and Confirm password not matches this error is shown...
   JOptionPane.showMessageDialog(null,"Password and Confirm Password must be same !!");      
    }    
    }
    

}
        }
        catch(Exception e){
            
        }    
   }
}
        }
        catch(Exception e){
            
        }
          }
      }
    }//GEN-LAST:event_RegsitartionActionPerformed

      private void startCountdown() {
              this.checkotp = null;
 
     if (timer != null) {
        timer.cancel();
    }

    // Create a new timer
    timer = new Timer();

    // Set the initial countdown value
    countdown = OTP_EXPIRATION_SECONDS;

    // Set the bounds of the label
    countdownLabel.setBounds(560, 500, 100, 30);

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
               Register.this.checkotp = null; 
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
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Answer;
    private javax.swing.JLabel Back;
    private com.Registration.CPasswordtxt CPassword;
    private com.Registration.Emailtxt Emailid;
    private javax.swing.JLabel Hanswer;
    private javax.swing.JLabel Hanswer1;
    private javax.swing.JLabel Hcpassword;
    private javax.swing.JLabel Hemail;
    private javax.swing.JLabel Hname;
    private javax.swing.JLabel Hpassword;
    private javax.swing.JLabel Hphoneno;
    private javax.swing.JLabel HsecuirtyQ;
    private javax.swing.JLabel Husernname;
    private com.Registration.Nametxt Name;
    private com.Registration.Passwordtxt Password;
    private com.Registration.Phonenotxt Phoneno;
    private com.Registration.Registrationbtn Regsitartion;
    private javax.swing.JTextField SecurityQ;
    private javax.swing.JRadioButton Terms;
    private com.Registration.Usernametxt Username;
    private javax.swing.JFormattedTextField Userotp;
    private com.Registration.Frame frame1;
    private javax.swing.JLabel heading;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
