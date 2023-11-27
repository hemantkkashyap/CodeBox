/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Loginpage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CodingPageAnimation extends JFrame {

    private JLabel movingTextLabel;
    private Timer animationTimer;
    private int animationSpeed = 15;
    private Timer timer;
    private int elapsedTime = 0;
    private int duration = 10; // Duration in seconds
    private String[] scriptLines = {
            "Executing program...\nInitializing modules...\nLoading data..."
            + "Scanning for vulnerabilities...\nEncrypting files...\nHacking into mainframe...\n"
            + "Bypassing security...\nInjecting code...\nAccess granted.\n\nProgram completed successfully."
    };
    private int currentLineIndex = 0;

    public CodingPageAnimation() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Hacker Animation");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        movingTextLabel = new JLabel();
        movingTextLabel.setForeground(Color.GREEN);
        movingTextLabel.setFont(new Font("Courier New", Font.PLAIN, 16));
        add(movingTextLabel);

        // Create a timer for the moving animation
        animationTimer = new Timer(50, new ActionListener() {
            private int yPos = getHeight(); // Starting position at the bottom

            @Override
            public void actionPerformed(ActionEvent e) {
                yPos -= animationSpeed; // Move upward
                movingTextLabel.setLocation(getWidth() / 2 - movingTextLabel.getWidth() / 2, yPos);

                if (yPos + movingTextLabel.getHeight() < 0) {
                    yPos = getHeight(); // Reset when text goes off the top
                    updateScriptText();
                }
            }
        });

        // Create a timer for the duration of the animation
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elapsedTime++;

                if (elapsedTime >= duration) {
                    timer.stop();
                    animationTimer.stop();
                    dispose();
                    openLoginPage();
                }
            }
        });

        // Start the timers
        animationTimer.start();
        timer.start();

        // Set black background
        getContentPane().setBackground(Color.BLACK);

        setVisible(true);
    }

    private void updateScriptText() {
        if (currentLineIndex < scriptLines.length) {
            movingTextLabel.setText(scriptLines[currentLineIndex]);
            currentLineIndex++;
        } else {
            currentLineIndex = 0; // Reset to the beginning of the script
        }

        // Set a small vertical gap between lines
        movingTextLabel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));
    }

    private void openLoginPage() {
        // Replace this with the code to open your login page
        // For example, you can create and display your login JFrame here
        // LoginPage loginPage = new LoginPage();
        // loginPage.setVisible(true);
        System.out.println("Login page opened");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CodingPageAnimation();
        });
    }
}
