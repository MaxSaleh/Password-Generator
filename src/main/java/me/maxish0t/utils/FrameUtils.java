package me.maxish0t.utils;

import me.maxish0t.PasswordGen;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class FrameUtils
{

    /**
     * Sets the Icon from the resources
     */
    public static void setIconImage(JFrame jFrame, String imageName)
    {
        URL res = PasswordGen.class.getClassLoader().getResource(imageName + ".png");
        File file = null;
        try
        {
            file = Paths.get(res.toURI()).toFile();
        } catch (URISyntaxException e)
        {
            e.printStackTrace();
        }
        String absolutePath = file.getAbsolutePath();
        BufferedImage myImg = null;
        try
        {
            myImg = ImageIO.read(new File(absolutePath));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        jFrame.setIconImage(myImg);
    }

}
