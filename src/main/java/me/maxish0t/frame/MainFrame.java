package me.maxish0t.frame;

import me.maxish0t.utils.Constants;
import me.maxish0t.utils.RandomWords;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JPanel
{

    private final Color selectedText = new Color(0,165,211);
    private final Color idleText = new Color(240,240,240);
    private final Color hoverText = new Color(190,190,190);

    private JPanel backgroundColor;
    private JTextField passwordGenBox;
    private JLabel changeGenPassword;

    public MainFrame() {
        backgroundColor = new JPanel();
        passwordGenBox = new JTextField();
        changeGenPassword = new JLabel();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        // Password Generated Text Box
        passwordGenBox.setFont(new java.awt.Font("Keep Calm Med", 2, 30)); // NOI18N
        passwordGenBox.setBounds((Constants.FRAME_WIDTH / 2) - (300 / 2), 0, 300, 100);
        //passwordGenBox.setText(RandomWords.generateRandomWord(10));
        add(passwordGenBox);

        // Change Generated Password Button
        changeGenPassword.setFont(new java.awt.Font("Keep Calm Med", 2, 24)); // NOI18N
        changeGenPassword.setBounds((Constants.FRAME_WIDTH / 2) - 144, Constants.FRAME_HEIGHT - 100, 300, 100);
        changeGenPassword.setText("GENERATE PASSWORD");
        changeGenPassword.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                changePasswordEntered(event);
            }
            public void mouseExited(MouseEvent event) {
                changePasswordExited(event);
            }
            public void mouseClicked(MouseEvent event) {
                changePasswordClicked(event);
            }
        });
        add(changeGenPassword);

        // Background JPanel
        backgroundColor.setBounds(0, 0, Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT);
        backgroundColor.setBackground(Color.GRAY);
        add(backgroundColor);
    }

    private void changePasswordEntered(MouseEvent event) {
        changeGenPassword.setForeground(hoverText);
    }

    private void changePasswordExited(MouseEvent event) {
        changeGenPassword.setForeground(idleText);
    }

    private void changePasswordClicked(MouseEvent event) {
        changeGenPassword.setForeground(selectedText);
        passwordGenBox.setText(RandomWords.generateRandomWord(10));
        System.out.println("New password has been generated.");
    }

}
