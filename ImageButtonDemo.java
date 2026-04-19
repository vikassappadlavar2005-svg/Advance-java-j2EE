package basics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo {
    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Image Button Demo");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create Label
        JLabel label = new JLabel("Click a button");

        // Load Images (Make sure images are in same folder)
        ImageIcon digitalIcon = new ImageIcon("digitalclock.jpeg");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.jpeg");

        // Create Buttons with Image
        JButton btnDigital = new JButton("Digital Clock", digitalIcon);
        JButton btnHourGlass = new JButton("Hour Glass", hourglassIcon);

        // Event for Digital Clock Button
        btnDigital.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        // Event for Hour Glass Button
        btnHourGlass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        // Add components
        frame.add(btnDigital);
        frame.add(btnHourGlass);
        frame.add(label);

        // Show frame
        frame.setVisible(true);
    }
}