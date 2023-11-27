package com.AdminDashboard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UserDetails extends javax.swing.JFrame {

    public UserDetails() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1099, 602));
        setMinimumSize(new java.awt.Dimension(1099, 602));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        Table.setAutoCreateRowSorter(true);
        Table.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fullname", "Email", "Username", "Phone_no", "Block"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table.setAutoscrolls(false);
        Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Table.setGridColor(new java.awt.Color(230, 230, 230));
        Table.setMinimumSize(new java.awt.Dimension(70, 40));
        Table.setRowHeight(40);
        Table.setShowGrid(true);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        Table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(4).setMinWidth(10);
            Table.getColumnModel().getColumn(4).setMaxWidth(10);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1100, 570);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked

       if( Table.getSelectedRow()!=-1){
     int selectedRow = Table.getSelectedRow();
// Get the values of the columns for the selected row.
Object[] values = new Object[Table.getColumnCount()];
for (int i = 0; i < values.length; i++) {
  values[i] = Table.getValueAt(selectedRow, i);
}
String Email_Id = (String) values[1];
String Username = (String) values[2];

 
    String[] options = {"Yes", "No"};
        int selectedOption = JOptionPane.showOptionDialog(null,"Are you Really want to Block this User '"+Username+"","Options", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (selectedOption == 0) {
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
               Statement s = c.createStatement();
           
               String query1 = "insert into BlockedUser values(?,?)";

                PreparedStatement ptst1 = c.prepareStatement(query1);
             ptst1.setString(1,Username);
             ptst1.setString(2,Email_Id);
                ptst1.execute();
PreparedStatement ptst2 = c.prepareStatement("Delete from login where Username = '"+Username+"'");
ptst2.executeUpdate();
PreparedStatement ptst3 = c.prepareStatement("Delete from Folder where Username = '"+Username+"'");
ptst3.executeUpdate();
PreparedStatement ptst4 = c.prepareStatement("Delete from ProfileImage where Username = '"+Username+"'");
ptst4.executeUpdate();
PreparedStatement ptst5 = c.prepareStatement("Delete from Notes where Username = '"+Username+"'");
ptst5.executeUpdate();
PreparedStatement ptst6 = c.prepareStatement("Delete from Feedback where Username = '"+Username+"'");
ptst6.executeUpdate();                     

 
                
                JOptionPane.showMessageDialog(null,"User Blocked");
           }
   catch(Exception e){
       e.printStackTrace();
   }
 
        }   
   } 
        
          
    }//GEN-LAST:event_TableMouseClicked

    private void TableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableKeyPressed
     
    }//GEN-LAST:event_TableKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTable Table;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
