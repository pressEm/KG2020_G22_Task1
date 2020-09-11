package ru.vsu.cs.course1;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        gr.setColor(new Color(0x6A9209));
        gr.fillRect(0,300, 900, 600);
        new DrawRoad().draw(gr, new int[] {200, 450, 650, 550, 600, 250, 350}, new int[] {300, 500, 300, 500, 600, 600, 550}, 7);
        new DrawSun().draw(gr, 680, 100, 40, 70, 30, Color.orange);
        drawTrees(gr);
        drawMountains(gr, 600);

        int h = 200;
        for (int i = 0; i < 3; i++) {
            new DrawHouse().draw(gr, 90*i, 100 +20*i, h);
            h= h - 20;
        }

        new DrawBoard().draw(gr, 400, 430, 100);
        new DrawCloud().draw(gr, 300, 50, 10, Color.white);
        new DrawCloud().draw(gr, 150, 120, 10, new Color(0x616B75));
        new DrawCloud().draw(gr, 80, 150,7,  new Color(0x607078));
        new DrawCloud().draw(gr, 740, 200, 5, Color.white);
    }

    public void drawMountains(Graphics2D gr, int dx) {
        for (int i = 0; i < 5; i++) {
            new DrawMountain().draw(gr, new int[] {dx, dx + 100, dx + 50}, new int[] {300, 300, 200-20*i});
            dx = dx + 70;
        }
    }

    public void drawTrees(Graphics2D gr) {
        int width = 40;
        int height = 90;
        Color color1 = new Color(0x20AA4C);
        Color color2 = new Color(0x187D38);
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 7 - j; i++) {
                if (j%2 == 0) {
                    new DrawTree().draw(gr, 50 * i + j * 30 + 250, j * 10 + 250, width, height, color2);
                } else new DrawTree().draw(gr, 50 * i + j * 30 + 250, j * 10 + 250, width, height, color1);
            }
            width++;
            height = height+ 8;
        }
    }
}
