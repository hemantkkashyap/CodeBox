
package com.Files;

import com.Texthighlighting.TextHighlightJava;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.JOptionPane;
import javax.swing.undo.UndoManager;

public class File extends javax.swing.JFrame {

    public void setFileValues(String username,String foldername,String filename,String File,Boolean b){
        Username.setText(username);
        Foldername.setText(foldername);
        Filename.setText(filename);
        FileText.setText(File);
        FileText.setEditable(true);
    }
    public File() {
        initComponents();
       
        // Assuming "yourJTextPane" is the name of your JTextPane component
FileText.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
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
        String text = FileText.getText();
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
        Back = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        save = new javax.swing.JLabel();
        Foldername = new javax.swing.JLabel();
        DeleteFolder = new javax.swing.JLabel();
        Download = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        FileText = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        lineNumbers = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Filename = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1099, 602));
        setMinimumSize(new java.awt.Dimension(1099, 602));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(null);

        Back.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        jPanel2.add(Back);
        Back.setBounds(10, 10, 0, 0);

        Username.setFont(new java.awt.Font("Century Gothic", 0, 3)); // NOI18N
        Username.setText("Username");
        jPanel2.add(Username);
        Username.setBounds(20, 40, 15, 4);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/Edit.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(940, 10, 60, 40);

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/Save.png"))); // NOI18N
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        jPanel2.add(save);
        save.setBounds(990, 0, 50, 50);

        Foldername.setFont(new java.awt.Font("Century Gothic", 0, 3)); // NOI18N
        Foldername.setText("Foldername");
        jPanel2.add(Foldername);
        Foldername.setBounds(10, 40, 18, 4);

        DeleteFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/D.png"))); // NOI18N
        DeleteFolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteFolderMouseClicked(evt);
            }
        });
        jPanel2.add(DeleteFolder);
        DeleteFolder.setBounds(1040, 10, 30, 32);

        Download.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Download.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/D3.png"))); // NOI18N
        Download.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DownloadMouseClicked(evt);
            }
        });
        jPanel2.add(Download);
        Download.setBounds(900, 0, 40, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1090, 50);

        jScrollPane2.setBorder(null);

        FileText.setEditable(false);
        FileText.setBackground(new java.awt.Color(240, 240, 240));
        FileText.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        FileText.setFocusable(false);
        FileText.setMargin(new java.awt.Insets(2, 15, 2, 6));
        FileText.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                FileTextCaretUpdate(evt);
            }
        });
        FileText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FileTextKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(FileText);
        StyledDocument doc =FileText.getStyledDocument();
        Action copyAction = new DefaultEditorKit.CopyAction();
        copyAction.putValue(Action.NAME,"Copy");
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add(copyAction);
        FileText.setComponentPopupMenu(popupMenu);
        // Create an UndoManager for the text area
        UndoManager undoManager = new UndoManager();
        FileText.getDocument().addUndoableEditListener(undoManager);

        // Create a key binding for Ctrl+Z
        KeyStroke ctrlZKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_Z, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());

        // Register the key binding with the text area
        FileText.getInputMap().put(ctrlZKeyStroke, "undo");
        FileText.getActionMap().put("undo", new AbstractAction("Undo") {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (undoManager.canUndo()) {
                    undoManager.undo();
                }
            }
        });
        KeyStroke ctrlYKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_Y, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
        FileText.getInputMap().put(ctrlYKeyStroke, "redo");
        FileText.getActionMap().put("redo", new AbstractAction("Redo") {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (undoManager.canRedo()) {
                    undoManager.redo();
                }
            }
        });

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(280, 60, 800, 510);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        lineNumbers.setEditable(false);
        lineNumbers.setBackground(new java.awt.Color(240, 240, 240));
        lineNumbers.setColumns(5);
        lineNumbers.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        lineNumbers.setForeground(new java.awt.Color(150, 150, 150));
        lineNumbers.setLineWrap(true);
        lineNumbers.setRows(4);
        lineNumbers.setWrapStyleWord(true);
        lineNumbers.setFocusable(false);
        lineNumbers.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(lineNumbers);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(240, 60, 40, 510);

        jPanel5.setBackground(new java.awt.Color(240, 240, 240));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jPanel5);
        jPanel5.setBounds(230, 50, 860, 520);

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setLayout(null);

        Filename.setFont(new java.awt.Font("Candara", 0, 28)); // NOI18N
        Filename.setForeground(new java.awt.Color(255, 255, 255));
        Filename.setText("Filename");
        jPanel3.add(Filename);
        Filename.setBounds(20, 20, 200, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 50, 240, 520);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1100, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
          setVisible(false);
          TextHighlight t = new TextHighlight();
          
    }//GEN-LAST:event_BackMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      FileText.setEditable(true);
      FileText.setBackground(Color.WHITE);
      FileText.setForeground(new Color(1,1,1));
      FileText.setFocusable(true);
lineNumbers.setBackground(Color.WHITE);
jPanel5.setBackground(Color.WHITE);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
               Statement s = c.createStatement();
           ResultSet rs1 = s.executeQuery("select * from login where Username = 'Hemant@123'"); 
           
           if(rs1.next()){
                     FileText.setEditable(false);
      FileText.setBackground(new Color(240,240,240));
      FileText.setForeground(new Color(1,1,1));
      FileText.setFocusable(false);
lineNumbers.setBackground(new Color(240,240,240));
jPanel5.setBackground(new Color(240,240,240));          
ResultSet rs2 = s.executeQuery("select Filename from Folder where Username = 'Hemant@123'");
                if(rs2.next()){
            s.executeUpdate("update Folder set Files= 'One' where Username = 'Hemant@123' and Foldername = '"+Foldername.getText()+"' and Filename = '"+Filename.getText()+"'");
        JOptionPane.showMessageDialog(null,"Saved Changes Succesfully");
        
        } 
     
           }
           }
   catch(Exception e){
       e.printStackTrace();
   }
   FileText.setEditable(false);       
    }//GEN-LAST:event_saveMouseClicked

    private void DeleteFolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteFolderMouseClicked
        String[] options = {"Yes", "No"};
        int selectedOption = JOptionPane.showOptionDialog(null,"Are You Sure want to Delete This Folder ?","Options", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (selectedOption == 0) {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
                Statement s = c.createStatement();
                String query ="Delete From Folder Where Username ='"+Username.getText()+"' and Foldername = '"+Foldername.getText()+"' and Filename = '"+Filename.getText()+"'";

                PreparedStatement ptst = c.prepareStatement(query);
                ptst.executeUpdate();
                JOptionPane.showMessageDialog(null," File Deleted Succesfully ....");
                setVisible(false);

            }
            catch(Exception e ){
            }
        }
    }//GEN-LAST:event_DeleteFolderMouseClicked

    private void DownloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DownloadMouseClicked
 
    }//GEN-LAST:event_DownloadMouseClicked

    private void FileTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FileTextKeyTyped
       TextHighlightJava t = new  TextHighlightJava();
       
     
                Map<String, Color> colorMap = t.getHashmap();
   
        
                  char c = evt.getKeyChar();
                if (c == ' ' || c == '\n' || c == '\r') {
                    highlightWordsWithColors(FileText, colorMap);
                }
    }//GEN-LAST:event_FileTextKeyTyped

    private void FileTextCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_FileTextCaretUpdate
      
    }//GEN-LAST:event_FileTextCaretUpdate

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new File().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel DeleteFolder;
    private javax.swing.JLabel Download;
    public javax.swing.JTextPane FileText;
    public javax.swing.JLabel Filename;
    private javax.swing.JLabel Foldername;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextArea lineNumbers;
    private javax.swing.JLabel save;
    // End of variables declaration//GEN-END:variables
 private static void highlightWordsWithColors(JTextPane textPane, Map<String, Color> wordColorMap) {
        StyledDocument doc = textPane.getStyledDocument();
        String text;
        try {
            text = doc.getText(0, doc.getLength());
        } catch (BadLocationException ex) {
            ex.printStackTrace();
            return;
        }

        // Clear previous formatting
        doc.setCharacterAttributes(0, text.length(), new SimpleAttributeSet(), true);

        for (Map.Entry<String, Color> entry : wordColorMap.entrySet()) {
            String word = entry.getKey();
            Color color = entry.getValue();
            int startIndex = 0;
            while ((startIndex = text.indexOf(word, startIndex)) >= 0) {
                int endIndex = startIndex + word.length();
                SimpleAttributeSet attributeSet = new SimpleAttributeSet();
                StyleConstants.setForeground(attributeSet, color);
                doc.setCharacterAttributes(startIndex, endIndex - startIndex, attributeSet, false);
                startIndex = endIndex;
            }
        }
    }
}
