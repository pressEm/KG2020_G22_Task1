package ru.vsu.cs.course1;

import java.awt.*;

public class DrawSun implements Drawable{
    private double kx;
    private double ky;
    private int r;
    private int R;
    private int n;
    private Color color;

    public DrawSun(double x, double y, int r, int R, int n, Color color) {
      this.kx = x;
      this.ky = y;
      this.r = r;
      this.R = R;
      this.n = n;
      this.color = color;
    }

    @Override
    public void draw(Graphics g, int width, int height) {
        int x = (int) (kx*width);
        int y = (int) (ky*height);
        g.setColor(color);
        g.fillOval((int) (kx*width - r), (int) (ky*height - r), 2 * r, 2 * r);
        double rad = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double dx1 = r * Math.cos(rad * i);
            double dx2 = R * Math.cos(rad * i);
            double dy1 = r * Math.sin(rad * i);
            double dy2 = R * Math.sin(rad * i);
            g.drawLine(x + (int) dx1, y + (int) dy1, x + (int) dx2, y + (int) dy2);
        }
    }
}

