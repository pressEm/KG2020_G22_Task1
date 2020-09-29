package ru.vsu.cs.course1;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() throws HeadlessException {
        Panel panel = new Panel();
        this.add(panel);
        this.setSize(900, 600);
//        setResizable(false);
    }
}
