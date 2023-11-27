
package com.Searchfiles;

import com.Connectivity.Connectivity;
import com.UserDashboard.Dashboard;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class SearchResults extends javax.swing.JFrame {
    
    public void addSpanel(JLabel label){
           SPanel.add(label);
       SPanel.add(Box.createRigidArea(new Dimension(0, 20)));
       SPanel.add(Box.createRigidArea(new Dimension(0, 0)));
        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setMaximumSize(new Dimension(Integer.MAX_VALUE, 1));
       SPanel.add(separator);
         SPanel.setLayout(new BoxLayout(SPanel, BoxLayout.Y_AXIS));
              SPanel.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 0));
    }
    
    public void setIcon(Icon i){
        Ficon.setIcon(i);
    }
    public SearchResults() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Back = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Ficon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1099, 602));
        setMinimumSize(new java.awt.Dimension(1099, 602));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        Back.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/ppp.png"))); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        jPanel2.add(Back);
        Back.setBounds(0, 0, 50, 50);

        Username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Username.setText("Hemantk@1");
        jPanel2.add(Username);
        Username.setBounds(100, 20, 120, 25);

        Ficon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/U.png"))); // NOI18N
        jPanel2.add(Ficon);
        Ficon.setBounds(40, 0, 50, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1080, 50);

        jScrollPane1.setBorder(null);

        SPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout SPanelLayout = new javax.swing.GroupLayout(SPanel);
        SPanel.setLayout(SPanelLayout);
        SPanelLayout.setHorizontalGroup(
            SPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        SPanelLayout.setVerticalGroup(
            SPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(SPanel);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 1070, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1100, 570);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
setVisible(false);
    }//GEN-LAST:event_BackMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchResults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Ficon;
    public javax.swing.JPanel SPanel;
    private javax.swing.JLabel Username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
