
package com.Searchfiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.text.StyledDocument;

public class SearchFiles extends javax.swing.JFrame {

    public SearchFiles() {
        initComponents();
                // Assuming "yourJTextPane" is the name of your JTextPane component
SearchOutput.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
    @Override
    public void insertUpdate(javax.swing.event.DocumentEvent evt) {
        // Your code to handle text insertions
        updateLineNumbers();
    }

    @Override
    public void removeUpdate(javax.swing.event.DocumentEvent evt) {
        // Your code to handle text removals
        updateLineNumbers();
    }

    @Override
    public void changedUpdate(javax.swing.event.DocumentEvent evt) {
        // Not used for plain text components
    }
});
   updateLineNumbers();
    }
    
       private void updateLineNumbers() {
        String text = SearchOutput.getText();
        int lineCount = text.isEmpty() ? 1 : text.split("\n", -1).length;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= lineCount; i++) {
            sb.append(i).append("\n");
        }
        lineNumbers.setText(sb.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Download = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lineNumbers = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        SearchOutput = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        Filename = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1099, 602));
        setMinimumSize(new java.awt.Dimension(1099, 602));
        setPreferredSize(new java.awt.Dimension(1099, 602));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 3, true));
        jPanel2.setLayout(null);

        Download.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Download.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/Download.png"))); // NOI18N
        Download.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DownloadMouseClicked(evt);
            }
        });
        jPanel2.add(Download);
        Download.setBounds(1020, 0, 50, 50);

        Username.setFont(new java.awt.Font("Candara", 0, 28)); // NOI18N
        Username.setText("Username");
        jPanel2.add(Username);
        Username.setBounds(20, 10, 210, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1100, 60);

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        lineNumbers.setEditable(false);
        lineNumbers.setBackground(new java.awt.Color(255, 255, 255));
        lineNumbers.setColumns(5);
        lineNumbers.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        lineNumbers.setForeground(new java.awt.Color(150, 150, 150));
        lineNumbers.setLineWrap(true);
        lineNumbers.setRows(4);
        lineNumbers.setWrapStyleWord(true);
        lineNumbers.setFocusable(false);
        lineNumbers.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(lineNumbers);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(180, 70, 40, 490);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.setLayout(null);

        jScrollPane3.setBorder(null);

        SearchOutput.setEditable(false);
        SearchOutput.setBackground(new java.awt.Color(255, 255, 255));
        SearchOutput.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jScrollPane3.setViewportView(SearchOutput);
        StyledDocument doc = SearchOutput.getStyledDocument();

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(50, 10, 860, 490);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(170, 60, 930, 510);

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setLayout(null);

        Filename.setFont(new java.awt.Font("Candara", 0, 28)); // NOI18N
        Filename.setText("Filename");
        jPanel3.add(Filename);
        Filename.setBounds(10, 30, 145, 50);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 50, 240, 560);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1100, 610);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DownloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DownloadMouseClicked
       String text = SearchOutput.getText();
                // Create a file chooser
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setSelectedFile(new File(Filename.getText()+".txt"));
                // Show the file chooser
                int result = fileChooser.showSaveDialog(SearchFiles.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        FileWriter fileWriter = new FileWriter(file);
                        fileWriter.write(text);
                        fileWriter.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
    }//GEN-LAST:event_DownloadMouseClicked

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchFiles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Download;
    public javax.swing.JLabel Filename;
    public javax.swing.JTextPane SearchOutput;
    public javax.swing.JLabel Username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextArea lineNumbers;
    // End of variables declaration//GEN-END:variables
}
