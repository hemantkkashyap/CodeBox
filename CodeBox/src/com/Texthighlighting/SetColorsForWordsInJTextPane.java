/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Texthighlighting;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.util.*;

public class SetColorsForWordsInJTextPane {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Set Colors for Words in JTextPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextPane textPane = new JTextPane();
        textPane.setFont(new Font("Arial", Font.PLAIN, 14));
        StyledDocument doc = textPane.getStyledDocument();

        String text = "apple banana cherry grape kiwi";
        java.util.List<String> wordList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "grape", "kiwi"));
        Map<String, Color> colorMap = new HashMap<>();
        colorMap.put("apple", Color.RED);
        colorMap.put("banana", Color.BLUE);
        colorMap.put("cherry", Color.GREEN);
        colorMap.put("grape", Color.ORANGE);
        colorMap.put("kiwi", Color.MAGENTA);

        // Set the initial text
        try {
            doc.insertString(0, text, null);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }

        // Apply colors to the words
        applyColorsToWords(doc, wordList, colorMap);

        frame.add(new JScrollPane(textPane), BorderLayout.CENTER);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    private static void applyColorsToWords(StyledDocument doc, java.util.List<String> wordList, Map<String, Color> colorMap) {
        String text;
        try {
            text = doc.getText(0, doc.getLength());
        } catch (BadLocationException ex) {
            ex.printStackTrace();
            return;
        }

        for (String word : wordList) {
            int startIndex = 0;
            while ((startIndex = text.indexOf(word, startIndex)) >= 0) {
                int endIndex = startIndex + word.length();
                AttributeSet attributeSet = new SimpleAttributeSet();
                StyleConstants.setForeground((MutableAttributeSet) attributeSet, colorMap.get(word));
                doc.setCharacterAttributes(startIndex, endIndex - startIndex, attributeSet, false);
                startIndex = endIndex;
            }
        }
    }
}


