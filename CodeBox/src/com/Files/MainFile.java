
package com.Files;
import com.Connectivity.Connectivity;
import com.UserDashboard.Dashboard;
import java.awt.Component;
import java.awt.Image;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;


public class MainFile extends javax.swing.JFrame {

    public void setUsername(String name){
        Username.setText(name);
    }
     public void setIcon(Icon icon){
    Ficon.setIcon(icon);
   }
      public void setFiles(String File){
        Files.setText(File);
    }
       public void setFilesIcon(Icon icon){
        Files.setIcon(icon);
    }
         public void setFolder(String Folder){
        Foldername.setText(Folder);
    }
           public void setFolderIcon(Icon icon){
    Foldername.setIcon(icon);
   }
       /*     public void setFiless(){
            Filess.removeAll();
      Filess.revalidate();
      Filess.repaint(); 
       Cover.setVisible(false);
    }
                     public void addFiless(JLabel label,Component com1,Component com2){
         Filess.add(label);
          Filess.add(com1);
          Filess.add(com2);
           Filess.setLayout(new BoxLayout(Filess, BoxLayout.Y_AXIS));
               Filess.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 0));
                     }*/
   public void addFolders(JLabel label,Component com){
     
       Panel.add(label);
         Panel.add(com);
       Panel.setLayout(new BoxLayout(Panel, BoxLayout.Y_AXIS));
                Panel.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 0)); 
    }
    public MainFile() {
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
        leftPanel1 = new com.Files.LeftPanel();
        Files = new javax.swing.JLabel();
        Ficon = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        NewFolder = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Panel = new javax.swing.JPanel();
        Cover = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Back = new javax.swing.JLabel();
        F = new com.Files.FileFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AddFile1 = new javax.swing.JLabel();
        NewFile1 = new javax.swing.JLabel();
        Foldername = new javax.swing.JLabel();
        Fseprator = new javax.swing.JSeparator();
        DeleteFolder = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1099, 602));
        setMinimumSize(new java.awt.Dimension(1099, 602));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jPanel1.setLayout(null);

        leftPanel1.setBackground(new java.awt.Color(51, 102, 255));
        leftPanel1.setBottomleft(25);
        leftPanel1.setBottomright(25);
        leftPanel1.setTopleft(25);
        leftPanel1.setTopright(25);
        leftPanel1.setLayout(null);

        Files.setFont(new java.awt.Font("Candara", 0, 32)); // NOI18N
        Files.setForeground(new java.awt.Color(255, 255, 255));
        Files.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/Folder.png"))); // NOI18N
        Files.setText("Folders");
        Files.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilesMouseClicked(evt);
            }
        });
        leftPanel1.add(Files);
        Files.setBounds(30, 31, 160, 50);

        Ficon.setBackground(new java.awt.Color(255, 255, 255));
        Ficon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ficon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/U.png"))); // NOI18N
        leftPanel1.add(Ficon);
        Ficon.setBounds(30, 100, 50, 50);

        Username.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("Hemant@123");
        leftPanel1.add(Username);
        Username.setBounds(90, 110, 150, 30);

        NewFolder.setBackground(new java.awt.Color(254, 254, 254));
        NewFolder.setText("New +");
        NewFolder.setBorder(null);
        NewFolder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewFolder.setFocusPainted(false);
        NewFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewFolderActionPerformed(evt);
            }
        });
        leftPanel1.add(NewFolder);
        NewFolder.setBounds(180, 80, 60, 20);

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Panel.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(Panel);

        leftPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(20, 160, 220, 350);

        jPanel1.add(leftPanel1);
        leftPanel1.setBounds(-10, 50, 250, 720);

        Cover.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout CoverLayout = new javax.swing.GroupLayout(Cover);
        Cover.setLayout(CoverLayout);
        CoverLayout.setHorizontalGroup(
            CoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        CoverLayout.setVerticalGroup(
            CoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanel1.add(Cover);
        Cover.setBounds(250, 70, 820, 480);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 3, true));

        Back.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/ppp.png"))); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back)
                .addContainerGap(1088, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back)
                .addGap(10, 10, 10))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1139, 57);

        F.setBackground(new java.awt.Color(255, 255, 255));
        F.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        F.setBottomleft(50);
        F.setBottomright(50);
        F.setEnabled(false);
        F.setTopleft(50);
        F.setTopright(50);
        F.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Candara", 0, 30)); // NOI18N
        jLabel1.setText("Your Files");
        F.add(jLabel1);
        jLabel1.setBounds(10, 10, 170, 30);

        jLabel2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel2.setText("Add Files via Upload");
        F.add(jLabel2);
        jLabel2.setBounds(210, 20, 214, 20);

        AddFile1.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        AddFile1.setText("Add File ");
        AddFile1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddFile1MouseClicked(evt);
            }
        });
        F.add(AddFile1);
        AddFile1.setBounds(620, 20, 70, 30);

        NewFile1.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        NewFile1.setText("New FIle");
        NewFile1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewFile1MouseClicked(evt);
            }
        });
        F.add(NewFile1);
        NewFile1.setBounds(720, 20, 70, 30);

        jPanel1.add(F);
        F.setBounds(260, 150, 800, 50);

        Foldername.setFont(new java.awt.Font("Candara", 0, 26)); // NOI18N
        Foldername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/Folder.png"))); // NOI18N
        Foldername.setText("Folder");
        jPanel1.add(Foldername);
        Foldername.setBounds(250, 80, 290, 30);
        jPanel1.add(Fseprator);
        Fseprator.setBounds(250, 130, 810, 10);

        DeleteFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/D.png"))); // NOI18N
        DeleteFolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteFolderMouseClicked(evt);
            }
        });
        jPanel1.add(DeleteFolder);
        DeleteFolder.setBounds(1020, 70, 30, 40);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        Table.setAutoCreateRowSorter(true);
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Filename"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setCellSelectionEnabled(true);
        Table.setFillsViewportHeight(true);
        Table.setGridColor(new java.awt.Color(200, 200, 200));
        Table.setRowHeight(50);
        Table.setSelectionBackground(new java.awt.Color(254, 254, 254));
        Table.setSelectionForeground(new java.awt.Color(51, 51, 51));
        Table.setShowGrid(false);
        Table.setTableHeader(null);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(260, 202, 800, 350);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-2, 0, 1080, 570);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
     setVisible(false);

    }//GEN-LAST:event_BackMouseClicked

    private void FilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilesMouseClicked
   
          
    }//GEN-LAST:event_FilesMouseClicked

    private void DeleteFolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteFolderMouseClicked
              String[] options = {"Yes", "No"};
         int selectedOption = JOptionPane.showOptionDialog(null,"Are You Sure want to Delete This Folder ?","Options", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
       if (selectedOption == 0) {
       try{
   Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
               Statement s = c.createStatement();
           String query ="Delete From Folder Where Username ='"+Username.getText()+"' and Foldername = '"+Foldername.getText()+"'";
           
         PreparedStatement ptst = c.prepareStatement(query);
         ptst.executeUpdate();
          JOptionPane.showMessageDialog(null,"Deleted Succesfully ....");
           
           
           
       }
       catch(Exception e ){     
       }
       }
    }//GEN-LAST:event_DeleteFolderMouseClicked

    private void NewFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewFolderActionPerformed
        Createfolder c = new Createfolder();
        c.setVisible(true);
        c.setUsername(Username.getText());
        Icon originalicon = Ficon.getIcon();
        Image originalimage = ((ImageIcon)originalicon).getImage();

        Image resizedimage = originalimage.getScaledInstance(30,30,Image.SCALE_SMOOTH);
        Icon smallerIcon = new ImageIcon(resizedimage);
        c.setIcon(smallerIcon);
    }//GEN-LAST:event_NewFolderActionPerformed

    private void NewFile1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewFile1MouseClicked
          NEwFile n = new NEwFile();
      n.Username.setText(Username.getText());
      n.Foldername.setText(Foldername.getText());
      n.setVisible(true);
    }//GEN-LAST:event_NewFile1MouseClicked

    private void AddFile1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddFile1MouseClicked
      
        JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Programming Languages Files", "c", "cpp", "java", "py", "js", "ts", "php");
   
        fileChooser.setFileFilter(filter);
                int result = fileChooser.showOpenDialog(null);
                
         if (result == JFileChooser.APPROVE_OPTION) {
                    java.io.File selectedFile = fileChooser.getSelectedFile();
                    byte[] fileData = new byte[(int) selectedFile.length()];

                    try {
                        FileInputStream fileInputStream = new FileInputStream(selectedFile);
                        fileInputStream.read(fileData);
                        fileInputStream.close();
 Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
               Statement s = c.createStatement();
                        String query = "INSERT INTO Folder VALUES (?,?,?,?,?)";

                        PreparedStatement preparedStatement = c.prepareStatement(query);
                        preparedStatement.setString(1,Username.getText());
                        preparedStatement.setString(2,Foldername.getText());
                        preparedStatement.setString(3, selectedFile.getName());
                        preparedStatement.setBytes(4, fileData);
                        preparedStatement.setString(5, "Private");
                        preparedStatement.executeUpdate();

                        preparedStatement.close();
                         c.close();
       JOptionPane.showMessageDialog(null,"Uploaded Succesfully !!");  
       
                         
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }    
    }//GEN-LAST:event_AddFile1MouseClicked

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked

        
        
        int selectedRow = Table.getSelectedRow();
                    if (selectedRow >= 0) {
                       
                        String selectedFileName = (String) Table.getValueAt(selectedRow, 0);
 try{
             Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
               Statement s = c.createStatement();
            
      // QUery to select the Files  of the user from the databse...               
String query = "Select Files from Folder where Username = '"+Username.getText()+"' and Foldername = '"+Foldername.getText()+"' and Filename = '"+selectedFileName+"'";
         ResultSet rs = s.executeQuery(query);  
     
         if(rs.next()){
             
             File f = new File();
             f.Filename.setText(selectedFileName);
             f.FileText.setText(rs.getString("Files"));
          f.setVisible(true);
         } 
         else{
              System.out.println("Hemant");
         }         
                   
                   
               }
               catch(Exception ey){
                ey.printStackTrace();
               }
                    }
    }//GEN-LAST:event_TableMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddFile1;
    private javax.swing.JLabel Back;
    public javax.swing.JPanel Cover;
    private javax.swing.JLabel DeleteFolder;
    private com.Files.FileFrame F;
    private javax.swing.JLabel Ficon;
    public javax.swing.JLabel Files;
    public javax.swing.JLabel Foldername;
    private javax.swing.JSeparator Fseprator;
    private javax.swing.JLabel NewFile1;
    private javax.swing.JButton NewFolder;
    public javax.swing.JPanel Panel;
    public javax.swing.JTable Table;
    public javax.swing.JLabel Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private com.Files.LeftPanel leftPanel1;
    // End of variables declaration//GEN-END:variables

}
