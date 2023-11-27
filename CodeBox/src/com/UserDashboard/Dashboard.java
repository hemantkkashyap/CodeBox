package com.UserDashboard;
import com.Connectivity.Connectivity;
import com.Feedback.Feedbacks;
import com.Files.MainFile;
import com.Game.GamesPanel;
import com.Loginpage.Login;
import com.Profile.Profile;
import com.Searchfiles.SearchFiles;
import com.Searchfiles.SearchResults;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
    }

public void setNotes(String s){
    Notes.setText(s);
}

public void setUsername(String s){
    User.setText(s);
}

public void setIcon(Icon i){
    ProfileIcon.setIcon(i);
}
public void setName(String name){
    Name.setText(name);
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Home = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CDate = new javax.swing.JLabel();
        Wish = new javax.swing.JLabel();
        leftPanel1 = new com.AdminDashboard.LeftPanel();
        Dashboard = new javax.swing.JLabel();
        MYFile = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        ProfileIcon = new com.UserDashboard.Profileicon();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Notes = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        searchpanel1 = new com.UserDashboard.Searchpanel();
        searchFile1 = new com.UserDashboard.SearchFile();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        quiz1 = new com.UserDashboard.Quiz();
        jLabel5 = new javax.swing.JLabel();
        Editnote = new javax.swing.JLabel();
        Savenote = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1099, 602));
        setMinimumSize(new java.awt.Dimension(1099, 602));
        setPreferredSize(new java.awt.Dimension(1099, 602));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        Home.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        Home.setText("Hello,");
        jPanel1.add(Home);
        Home.setBounds(280, 130, 150, 38);

        Name.setFont(new java.awt.Font("Candara", 0, 34)); // NOI18N
        Name.setText("Name");
        jPanel1.add(Name);
        Name.setBounds(280, 210, 430, 42);

        jLabel9.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/Calender.png"))); // NOI18N
        jLabel9.setText("Date & Time");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(850, 380, 190, 60);

        CDate.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        CDate.setText("Curr Date and Time ");
        jPanel1.add(CDate);
        CDate.setBounds(850, 450, 200, 30);

        Wish.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        Wish.setText("Good Morning!");
        jPanel1.add(Wish);
        Wish.setBounds(280, 170, 270, 40);

        leftPanel1.setBackground(new java.awt.Color(51, 102, 255));
        leftPanel1.setBottomright(30);
        leftPanel1.setTopright(30);
        leftPanel1.setLayout(null);

        Dashboard.setFont(new java.awt.Font("Candara", 0, 26)); // NOI18N
        Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/Presentation1.png"))); // NOI18N
        Dashboard.setText("Dashboard");
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
        });
        leftPanel1.add(Dashboard);
        Dashboard.setBounds(10, 260, 210, 60);

        MYFile.setFont(new java.awt.Font("Candara", 0, 26)); // NOI18N
        MYFile.setForeground(new java.awt.Color(255, 255, 255));
        MYFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/Folder.png"))); // NOI18N
        MYFile.setText("MYFile");
        MYFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MYFileMouseClicked(evt);
            }
        });
        leftPanel1.add(MYFile);
        MYFile.setBounds(20, 320, 180, 60);

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
        jLabel2.setBounds(30, 490, 150, 50);

        User.setBackground(new java.awt.Color(255, 153, 0));
        User.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setText("Hemant@123");
        leftPanel1.add(User);
        User.setBounds(50, 180, 130, 30);

        ProfileIcon.setBackground(new java.awt.Color(51, 102, 255));
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
        ProfileIcon.setBounds(70, 100, 70, 70);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/LLogo.jpg"))); // NOI18N
        leftPanel1.add(jLabel8);
        jLabel8.setBounds(70, 10, 80, 80);

        jPanel1.add(leftPanel1);
        leftPanel1.setBounds(0, 0, 240, 760);

        Notes.setEditable(false);
        Notes.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Notes);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(850, 130, 210, 250);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/aaaa.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(990, 10, 28, 30);

        searchpanel1.setBackground(new java.awt.Color(255, 255, 255));
        searchpanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        searchpanel1.setLayout(null);

        searchFile1.setBorder(null);
        searchFile1.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        searchFile1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchFile1MouseClicked(evt);
            }
        });
        searchpanel1.add(searchFile1);
        searchFile1.setBounds(10, 10, 520, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/Presentation1-removebg-preview.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        searchpanel1.add(jLabel3);
        jLabel3.setBounds(550, 0, 30, 40);

        jPanel1.add(searchpanel1);
        searchpanel1.setBounds(250, 30, 580, 40);

        jLabel4.setText("Categories");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 330, 80, 16);

        quiz1.setBackground(new java.awt.Color(254, 254, 254));
        quiz1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        quiz1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/Gameslogo.png"))); // NOI18N
        quiz1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quiz1MouseClicked(evt);
            }
        });
        quiz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quiz1ActionPerformed(evt);
            }
        });
        jPanel1.add(quiz1);
        quiz1.setBounds(290, 360, 100, 60);

        jLabel5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/nnn.png"))); // NOI18N
        jLabel5.setText("Notes");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(850, 80, 100, 42);

        Editnote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/Edit.png"))); // NOI18N
        Editnote.setToolTipText("");
        Editnote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditnoteMouseClicked(evt);
            }
        });
        jPanel1.add(Editnote);
        Editnote.setBounds(970, 90, 30, 30);

        Savenote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/Save.png"))); // NOI18N
        Savenote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SavenoteMouseClicked(evt);
            }
        });
        jPanel1.add(Savenote);
        Savenote.setBounds(1020, 80, 40, 40);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Give Feedback ");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(717, 80, 120, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1100, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
   
        
    }//GEN-LAST:event_DashboardMouseClicked

    private void MYFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MYFileMouseClicked
   MainFile m = new MainFile();
        try{
        Connectivity c = new Connectivity();
  Icon i = ProfileIcon.getIcon();
                   Image o = ((ImageIcon)i).getImage();
                   
                   Image r = o.getScaledInstance(50,50,Image.SCALE_SMOOTH);
             Icon s = new ImageIcon(r);     
          m.setIcon(s);
        
  
        
            String query1 = "Select DISTINCT Foldername from Folder where Username = '"+User.getText()+"'";
            ResultSet rs1 = c.s.executeQuery(query1);   
          
            
       List<String> foldername = new ArrayList<>();
       
       while(rs1.next()){
           foldername.add(rs1.getString(1));
       }
List<JLabel> Folders = new ArrayList<>();

for(String folder :foldername){
    JLabel label = new JLabel();
    label.setText(folder);
    label.setForeground(Color.white);
    Icon icon = MYFile.getIcon();
                   Image originalimage = ((ImageIcon)icon).getImage();
                   
                   Image resizedimage = originalimage.getScaledInstance(30,30,Image.SCALE_SMOOTH);
             Icon smallerIcon = new ImageIcon(resizedimage);     
          label.setIcon(smallerIcon);
          
           label.setFont(new Font("Candara", Font.PLAIN, 24));
           
     label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
      try{
          m.Cover.setVisible(false);
          m.Foldername.setText(label.getText());
          Icon icon =m.Files.getIcon();
                   Image originalimage = ((ImageIcon)icon).getImage();
                   
                   Image resizedimage = originalimage.getScaledInstance(30,30,Image.SCALE_SMOOTH);
             Icon smallerIcon = new ImageIcon(resizedimage);     
          m.Foldername.setIcon(smallerIcon);  
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
            Statement s = c.createStatement();
            String q = "Select Filename from Folder where Username = '"+User.getText()+"' and Foldername = '"+label.getText()+"'";
            ResultSet rs = s.executeQuery(q);
            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            DefaultTableModel tb = (DefaultTableModel) m.Table.getModel();
           tb.setRowCount(0);
           

         int col = rsmd.getColumnCount();
            String[] colName = new String[col];
            for(int i = 0 ;i<col;i++){
                colName[i]= rsmd.getColumnName(i+1);
                tb.setColumnIdentifiers(colName);
                String Filename;
                while(rs.next()){
                   Filename = rs.getString("Filename");
                    String[] row = {Filename};
                    tb.addRow(row);
                   
                }

            }
            m.Table.setFont(new Font("Monospaced", Font.PLAIN, 18));
            m.Table.setBackground(Color.WHITE);
      }
      catch(Exception ee){
          
      }
            }
        });
    Folders.add(label);
}
 for(JLabel label :Folders){
     m.Panel.add(label);
     m.Panel.setLayout(new BoxLayout(m.Panel, BoxLayout.Y_AXIS));
m.Panel.add(Box.createVerticalStrut(10)); 
  int padding = 50; // Adjust the padding value as needed
        m.Panel.setBorder(new EmptyBorder(10, padding, padding, padding));

 }
 
 m.Username.setText(User.getText());
m.setVisible(true);
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_MYFileMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        String[] options = {"Yes", "No"};
        int selectedOption = JOptionPane.showOptionDialog(null,"Are You Sure want to Log Out ?","Options", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (selectedOption == 0) {
            setVisible(false);
            Login l = new Login();
            l.setVisible(true);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void ProfileIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileIconMouseClicked
Profile p = new Profile();
try{
    Connectivity c = new Connectivity();
            String query1 = "Select Fullname,Email,Phone_no from login where Username = '"+User.getText()+"'";
            ResultSet rs1 = c.s.executeQuery(query1);
            
            
            if(rs1.next()){
                p.setEssentialDetails(rs1.getString("Fullname"), rs1.getString("Email"), rs1.getString("Phone_no"), User.getText());

            }
    String query2 = "select Bio,CurrentRole,Country,Eductaion,Linkedin_ID from Personaldetails where Username = '"+User.getText()+"'";
            ResultSet rs2 = c.s.executeQuery(query2);
       if(rs2.next()){
           p.setDetails(rs2.getString("Bio"), rs2.getString("CurrentRole"), rs2.getString("Country"), rs2.getString("Eductaion"),rs2.getString("Linkedin_ID"));
       }else{
            p.setDetails("","","","","");
       }        
    Icon icon = ProfileIcon.getIcon();
                   Image originalimage = ((ImageIcon)icon).getImage();
                   
                   Image resizedimage = originalimage.getScaledInstance(220,220,Image.SCALE_SMOOTH);
             Icon smallerIcon = new ImageIcon(resizedimage);     
           p.setPhoto(smallerIcon);
}
catch(Exception e){
    
}


p.setVisible(true);
    }//GEN-LAST:event_ProfileIconMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
             try {
            Notifications u = new Notifications();

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
            Statement s = c.createStatement();
            String q = "Select Notification,CurrDate from Notify";
            ResultSet rs = s.executeQuery(q);
            List<String> notification = new ArrayList<>();
              List<String> Date = new ArrayList<>();
              List<String> newnotification = new ArrayList<>();
                List<String> newDate = new ArrayList<>();
              while(rs.next()){
                  notification.add(rs.getString("Notification"));
                  Date.add(rs.getString("CurrDate"));
              }
              
             for (int i = notification.size() - 1; i >= 0; i--) {
            newnotification.add(notification.get(i));
            newDate.add(Date.get(i));
        }

            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            DefaultTableModel tb = (DefaultTableModel) u.Table.getModel();

            int col = rsmd.getColumnCount();
            String[] colName = new String[col];
            for(int i = 1 ;i<col;i++){
                colName[i]= rsmd.getColumnName(i+1);
                tb.setColumnIdentifiers(colName);
                String Name,date;
             for(int j = 0; j <newnotification.size(); j++){
                    Name = newnotification.get(j);
                    date = newDate.get(j);
                 
                    String[] row = {Name,date};
                    tb.addRow(row);
                   
                }

            }
            u.Table.setFont(new Font("Candara", Font.PLAIN, 16));


            u.setVisible(true);
            s.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void quiz1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quiz1MouseClicked
   GamesPanel g = new GamesPanel();
   g.setVisible(true);
    }//GEN-LAST:event_quiz1MouseClicked

    private void quiz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quiz1ActionPerformed
      
    }//GEN-LAST:event_quiz1ActionPerformed

    private void searchFile1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFile1MouseClicked
   

 
        
    }//GEN-LAST:event_searchFile1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       // TODO add your handling code here:
    SearchResults s = new SearchResults();
       String input = searchFile1.getText().toLowerCase();
     List<String> suggestions = fetchSuggestions(input);
     List<JLabel> Folders = new ArrayList<>();
for(String suggestion :suggestions){
    JLabel label = new JLabel();
    label.setText(suggestion);
      Icon icon = MYFile.getIcon();
                   Image originalimage = ((ImageIcon)icon).getImage();
                   
                   Image resizedimage = originalimage.getScaledInstance(30,30,Image.SCALE_SMOOTH);
             Icon smallerIcon = new ImageIcon(resizedimage);     
          label.setIcon(smallerIcon);
          
           label.setFont(new Font("Candara", Font.PLAIN, 24));
           
           label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               SearchFiles f = new SearchFiles();
                String text = label.getText();
           
           String[] parts = text.trim().split("//");
            String username = parts[0];
               String filename = parts[1];
           try{
                Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
               Statement s = c.createStatement();
                   String query = "SELECT Files FROM Folder WHERE Username ='"+username+"' and Filename = '"+filename+"'";
         ResultSet rs = s.executeQuery(query); 
         
         if(rs.next()){
         f.SearchOutput.setText(rs.getString("Files"));
         }
         
         f.setVisible(true);
           }   
           catch(Exception e1){
               e1.printStackTrace();
           }
               
            }
           
            });
 Folders.add(label);}

for(JLabel label :Folders){
   
     s.SPanel.add(label);
     s.SPanel.setLayout(new BoxLayout(s.SPanel, BoxLayout.Y_AXIS));
s.SPanel.add(Box.createVerticalStrut(20)); 
  int padding = 50; // Adjust the padding value as needed
        s.SPanel.setBorder(new EmptyBorder(10, padding, padding, padding));

 }
s.setVisible(true);

    }//GEN-LAST:event_jLabel3MouseClicked

    private void EditnoteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditnoteMouseClicked
 Notes.setEditable(true);
    }//GEN-LAST:event_EditnoteMouseClicked

    private void SavenoteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SavenoteMouseClicked
        // TODO add your handling code here:
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
               Statement s = c.createStatement();
       ResultSet rs1 = s.executeQuery("select * from login where Username = '"+User.getText()+"'"); 
           System.out.print("hemant ");
           if(rs1.next()){
               System.out.print("hemant ");
            s.executeUpdate("update notes set Note ='"+Notes.getText()+"' where Username = '"+User.getText()+"'");
            JOptionPane.showMessageDialog(null,"Notes Updated Succesfully");
             System.out.print("hemant ");
           }
           else{
               
              JOptionPane.showMessageDialog(null,"Notes");   
           }
          
        }
        catch(Exception e){
            
        }
        Notes.setEditable(false);
    }//GEN-LAST:event_SavenoteMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        Feedbacks f = new Feedbacks();
     f.Username.setText(User.getText());
        f.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel CDate;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Editnote;
    public javax.swing.JLabel Home;
    private javax.swing.JLabel MYFile;
    private javax.swing.JLabel Name;
    private javax.swing.JTextPane Notes;
    private com.UserDashboard.Profileicon ProfileIcon;
    private javax.swing.JLabel Savenote;
    private javax.swing.JLabel User;
    public javax.swing.JLabel Wish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.AdminDashboard.LeftPanel leftPanel1;
    private com.UserDashboard.Quiz quiz1;
    private com.UserDashboard.SearchFile searchFile1;
    private com.UserDashboard.Searchpanel searchpanel1;
    // End of variables declaration//GEN-END:variables
  private List<String> fetchSuggestions(String input) {
        List<String> suggestions = new ArrayList<>();
 String Access = "Public";
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
               Statement s = c.createStatement();
                   String query = "SELECT Username,Filename FROM Folder WHERE Filename LIKE ? and Access= '"+Access+"'";
               PreparedStatement ptst = c.prepareStatement(query);
            ptst.setString(1, input + "%"); // Use a wildcard to match similar names

            ResultSet resultSet = ptst.executeQuery();
           
                while (resultSet.next()) {
                    String fileName = resultSet.getString("Filename");
                    String Username = resultSet.getString("Username");
                   
                    String suggestion = Username + "//"+ fileName;
                    suggestions.add(suggestion);
                  
                     
                }
            }
         catch (SQLException e) {
            e.printStackTrace();
        }

        return suggestions;
    }

}
