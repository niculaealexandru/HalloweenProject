package com.stepit.model;

import javax.swing.*;
import java.io.File;

public class Image extends JFrame {

    public void displayImage(String img, String sound) {
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon(img.toString());
        JLabel label = new JLabel(icon);
        File music = new File(sound.toString());

        frame.setAlwaysOnTop(true);
        frame.add(label);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        Sound.playSound(music);

    }

}

