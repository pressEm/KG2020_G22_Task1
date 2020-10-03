package ru.vsu.cs.course1;

import java.awt.*;

public class Flowers implements Drawable {
    private int size;
    private int x0;
    private int y0;

    public Flowers(int size) {
        this.size = size;
    }

    public int random (int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    @Override
    public void draw(Graphics g, int width, int height) {
        int[] x = new int[120];
        int[] y = new int[120];
        for (int i = 0; i < x.length; i++) {
            x[i] = random((int) (7*width/10), (int) (99*width/100));
            y[i] = random((int) (6*height/10), (int) (99*height/100));
        }
        System.out.println(x.length);
        for (int i = 0; i < x.length; i++) {
            g.setColor(new Color(0xDA375D));
            for (int j = 0; j < 6; j++) {
                double a = 2 * Math.PI * j / 6;
                int x1 = (int) (x[i] + size * Math.cos(a));
                int y1 = (int) (y[i] + size * Math.sin(a));
                g.fillOval(x1 - size, y1 - size, 4 * size / 3, 4 * size / 3);
            }
            g.setColor(new Color(0xF4EC88));
            g.fillOval(x[i] - size, y[i] - size, 4 * size / 3, 4 * size / 3);
        }
    }
}

//    public void draw(Graphics g) {
//        for (int i = 0; i < x.length; i++) {
//            g.setColor(new Color(0xDA375D));
//            for (int j = 0; j < 6; j++) {
//                double a = 2 * Math.PI * j / 6;
//                int x1 = (int) (x[i] + size * Math.cos(a));
//                int y1 = (int) (y[i] + size * Math.sin(a));
//                g.fillOval(x1 - size, y1 - size, 4 * size / 3, 4 * size / 3);
//            }
//            g.setColor(new Color(0xF4EC88));
//            g.fillOval(x[i] - size, y[i] - size, 4 * size / 3, 4 * size / 3);
//        }
//    }

