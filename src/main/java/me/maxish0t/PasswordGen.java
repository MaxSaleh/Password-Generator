package me.maxish0t;

import me.maxish0t.frame.MainFrame;
import me.maxish0t.utils.Constants;
import me.maxish0t.utils.RandomWords;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class PasswordGen
{

    public static JFrame frm = new JFrame();

    public static void main(String[] args) {
        MainFrame mainPingPongGUI = new MainFrame();
        frm.setTitle("Password Generator");
        frm.setContentPane(mainPingPongGUI);
        frm.setSize(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT);
        frm.setResizable(false);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLocationRelativeTo(null);

        // Sets the Icon from the resources
        URL res = Constants.class.getClassLoader().getResource("icon.png");
        File file = null;
        try {
            file = Paths.get(res.toURI()).toFile();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        String absolutePath = file.getAbsolutePath();
        BufferedImage myImg = null;
        try {
            myImg = ImageIO.read(new File(absolutePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        frm.setIconImage(myImg);

        System.out.println("Random Generated Password: " + RandomWords.generateRandomWord(10));
        System.out.println("Random Generated Password With Numbers: " + RandomWords.generateRandomWordNumbers(10));
    }

}
