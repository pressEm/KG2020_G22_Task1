package ru.vsu.cs.course1;

import java.awt.*;

public class DrawCloud implements Drawable{
    private double kx;
    private double ky;
    int size;
    Color color;

    public DrawCloud(double kx, double ky, int size, Color color) {
        this.kx = kx;
        this.ky = ky;
        this.size = size;
        this.color = color;
    }

    @Override
    public void draw(Graphics g, int width, int height) {
        int x = (int) (kx * width);
        int y = (int) (ky * height);
        g.setColor(color);
        g.fillOval(x + 3 * size, y, 10 * size, 5 * size);
        g.fillOval(x, y + 2 * size, 5 * size, 3 * size);
        g.fillOval(x + 11 * size, y + 2 * size, 5 * size, 3 * size);
    }

}
