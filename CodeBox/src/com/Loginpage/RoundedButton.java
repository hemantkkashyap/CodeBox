package com.Loginpage;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class RoundedButton extends JButton {
    private Color backgroundColor;
    private Color borderColor;

    public RoundedButton() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBackground(Color.WHITE); // Default background color
        setBorderPainted(false); // Default border
        setForeground(Color.BLACK); // Default text color
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(backgroundColor);
        } else {
            g.setColor(getBackground());
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int borderArc = 20; // You can adjust this to control the roundness of the button border

        g2d.fillRoundRect(0, 0, width, height, borderArc, borderArc);

        if (borderColor != null) {
            g2d.setColor(borderColor);
            g2d.drawRoundRect(0, 0, width, height, borderArc, borderArc);
        }

        super.paintComponent(g);
    }
}
