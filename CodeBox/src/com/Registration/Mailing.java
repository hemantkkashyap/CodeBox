package com.Registration;

import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import java.security.SecureRandom;

public class Mailing {
      
    private String Otp;
    private String Fotp;
    private static final String capatcha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int capatcha_length = 6;
    
    public void setOtp(String otp) {
    this.Otp = otp;
}
      public void setFotp(String otp) {
    this.Fotp = otp;
}

    public String getOtp() {
        
        System.out.println(Otp);
        return Otp;
    }
    
    public String getFotp() {
        
        System.out.println(Fotp);
        return Fotp;
    }
 
       public void getEmailId(String username,String email){
       //   String message = "Mail got ....";
        String subject = "Regsitration Successfull for Codebox !!!";
        String from = "codeboxp1@gmail.com";
        try {
            InternetAddress fromAddress = new InternetAddress(from);
               sendAttach(username,subject,email, fromAddress);
        } catch (AddressException ex) {
            Logger.getLogger(Mailing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
  public void sendOtp(String username,String email){
  String from = "codeboxp1@gmail.com";
    try {
        InternetAddress fromAddress = new InternetAddress(from);
        sendEmail(this, username, email, fromAddress); // Pass 'this' as the first parameter
    } catch (AddressException ex) {
        Logger.getLogger(Mailing.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
       
  public void sendOtp(String email){
  String from = "codeboxp1@gmail.com";
    try {
        InternetAddress fromAddress = new InternetAddress(from);
        sendEmail(this,email, fromAddress); // Pass 'this' as the first parameter
    } catch (AddressException ex) {
        Logger.getLogger(Mailing.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
  
private static void sendEmail(Mailing mailingInstance, String username, String to, InternetAddress fromAddress) {
 
        
        String host = "smtp.gmail.com";

        Properties p = System.getProperties();
        System.out.println("Properties : " + p);

        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.port", "587");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.auth", "true");
        

        Session s = Session.getInstance(p, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("codeboxp1@gmail.com", "wolx qzyl xgwv egpy");
            }

        });

        s.setDebug(true);

        try {
            MimeMessage m = new MimeMessage(s);

            m.setFrom(fromAddress);

            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            m.setSubject("Subject: Your One-Time Password (OTP) for Login");
            
            int otpLength = 6;
        String otp = generateOTP(otpLength);
  
         mailingInstance.setOtp(otp);

            m.setText("Dear " +username+"\n"+
"\n" +
"Thank you for choosing COODEBOX for your login needs. To ensure the security of your account,"
                    + " we have generated a One-Time Password (OTP) for you to use during the login process.\n" +
"\n" +
"Your OTP is: "+ otp+"\n"+
"\n" +
"Please enter this OTP when prompted during the Registration process. Do not share this OTP with anyone, "
                    + "as it is valid for a single use only and helps us verify your identity.\n" +
"\n" +
"If you did not attempt to Register in or have any concerns about the security of your account, "
                    + "please contact our support team immediately at \n kashyaphemant2004@gmail.com   +91 7803026553\n " +
"\n" +
"Thank you for choosing CODEBOX.\n" +
"\n" +
"Best regards,\n" +
"CODEBOX");

            Transport.send(m);

            System.out.println("Sent Succesfully ....");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


private static void sendEmail(Mailing mailingInstance,String to, InternetAddress fromAddress) {
 
        
        String host = "smtp.gmail.com";

        Properties p = System.getProperties();
        System.out.println("Properties : " + p);

        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.port", "587");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.auth", "true");
        

        Session s = Session.getInstance(p, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("codeboxp1@gmail.com", "wolx qzyl xgwv egpy");
            }

        });

        s.setDebug(true);

        try {
            MimeMessage m = new MimeMessage(s);

            m.setFrom(fromAddress);

            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            m.setSubject("Subject: Your One-Time Password (OTP) To Change Password !!");
            
        String otp = generateCapatcha();
  
         mailingInstance.setFotp(otp);

            m.setText("Dear "+to+"\n"
            +"Your One time Otp For Reset passowrd is : "+otp+"\n\n"
            +"Best Regards"+"\n"
            +"CODEBOX");

            Transport.send(m);

            System.out.println("Sent Succesfully ....");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    
     private static String generateOTP(int length) {
        String digits = "0123456789";
        StringBuilder otp = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(digits.length());
            otp.append(digits.charAt(index));
        }

        return otp.toString();
    }
    
     private static String generateCapatcha(){
         SecureRandom random = new  SecureRandom();
         StringBuilder builder = new StringBuilder();
         for(int i = 0 ; i <capatcha_length;i++){
             int index = random.nextInt(capatcha.length());
             builder.append(capatcha.charAt(index));
         }
         
         return builder.toString();
     }  
       
    private static void sendAttach(String username,String subject, String usermailid, InternetAddress fromAddress) {
 
     String host = "smtp.gmail.com";

        Properties p = System.getProperties();
        System.out.println("Properties : " + p);

        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.port", "587");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.auth", "true");
        

        Session s = Session.getInstance(p, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("codeboxp1@gmail.com", "wolx qzyl xgwv egpy");
            }

        });

        s.setDebug(true);

        try {
            MimeMessage m = new MimeMessage(s);

            m.setFrom(fromAddress);

            m.addRecipient(Message.RecipientType.TO, new InternetAddress(usermailid));

            m.setSubject(subject);

        String path = "C:\\Users\\91898\\Desktop\\done.png";
        
        
        MimeMultipart mp = new MimeMultipart();
        
        MimeBodyPart text= new  MimeBodyPart();
        MimeBodyPart Mimefile= new  MimeBodyPart();
        
        try{
            text.setText("Dear "+username+"\n\n"+
"We wanted to extend our warmest thanks for signing up on our platform! Your registration for Codebox "
 + "is now complete. We are thrilled to have you as a part of our community.\n\n" +
"As a registered member, you will gain access to features of Codebox . We are confident that"
                    + " youll find our platform valuable and enjoyable.\n\n" +
"If you have any questions, concerns, or feedback, please dont hesitate to contact us Our team is always ready to assist you\n\n" +
"Thank you once again for choosing CodeBox. We hope you have a wonderful experience with us.\n\n" +                   
"Best regards,\n\n" +
"You Know who I am 😎");
            
           Mimefile.attachFile(path);
           
           mp.addBodyPart(text);
           mp.addBodyPart(Mimefile);
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        m.setContent(mp);

            Transport.send(m);

            System.out.println("Sent Succesfully ....");
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
}
