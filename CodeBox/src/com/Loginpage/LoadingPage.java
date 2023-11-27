package com.Loginpage;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class LoadingPage extends JFrame {

    private JLabel loadingLabel;
    private JProgressBar progressBar;

    public LoadingPage() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Loading Page");
        setSize(800, 600); // Set a larger size for the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create an empty border to add some space around the progress bar
        int borderSize = 50;
        setLayout(new BorderLayout(borderSize, borderSize));

        // Create an empty label to add some space at the top
        JLabel topSpaceLabel = new JLabel();
        topSpaceLabel.setPreferredSize(new Dimension(1, borderSize));
        add(topSpaceLabel, BorderLayout.NORTH);

        loadingLabel = new JLabel("Loading, please wait...");
        loadingLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        loadingLabel.setHorizontalAlignment(JLabel.CENTER);
        add(loadingLabel, BorderLayout.CENTER); // Center the label

        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setPreferredSize(new Dimension(200, 20)); // Set the preferred size of the progress bar
        add(progressBar, BorderLayout.SOUTH); // Center the progress bar at the bottom

        // Create an empty label to add some space at the bottom
        JLabel bottomSpaceLabel = new JLabel();
        bottomSpaceLabel.setPreferredSize(new Dimension(1, borderSize));
        add(bottomSpaceLabel, BorderLayout.SOUTH);

        // Set a white background for the frame
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);

        // Simulate some initialization process
        simulateLoadingProcess();

        // Close the loading page and start your main application
        dispose();
        FirstPage f = new FirstPage();
        f.setVisible(true);
    }

    private void simulateLoadingProcess() {
        int progress = 0;
        while (progress <= 100) {
            try {
                Thread.sleep(30); // Adjust the sleep duration to control the loading speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            progressBar.setValue(progress);
            progress++;
        }
    }

    private void startMainApplication() {
        // Replace this with the code to start your main application
        // For example, you can create and display your main JFrame here
        // MainFrame mainFrame = new MainFrame();
        // mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the loading page with a centered small progress bar
        LoadingPage loadingPage = new LoadingPage();
    }
}

