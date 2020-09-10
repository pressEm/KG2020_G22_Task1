package ru.vsu.cs.course1;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBackground(new Color(167, 240, 255));
        int w = 900;
        int h = 600;
        frame.setSize(w, h);
        frame.setVisible(true);
    }
}
