package ru.vsu.cs.course1;

import java.awt.*;

public class DrawHouse implements Drawable {

    private double kx;
    private double ky;
    private int w;
    private int h;
    private int n;

    public DrawHouse(double kx, double ky, int w, int h, int n) {
        this.kx = kx;
        this.ky = ky;
        this.w = w;
        this.h = h;
        this.n = n;
    }


    @Override
    public void draw(Graphics g, int width, int height) {
        int x = (int) (kx*width);
        int y = (int) (ky*height);
        System.out.println( x + "  " + y);
        for (int i = 0; i < n; i++) {
            g.setColor(new Color(0x8F918A));
            g.fillRect(x, y - h, w, h);
            g.setColor(new Color(0x97C6D3));
            int x1 = x;
            while (x1 < x + w - w/5) {
                int y1 = y - h;
                x1 = (int) x1 + w / 12;
                while (y1 < y - h/10) {
                    y1 = (int) y1 + h / 40;
                    g.fillRect(x1, y1, (int) w / 10, (int) h / 15);
                    y1 = (int) y1 + h / 10;
                }
                x1 = (int) x1 + w / 10;
            }
//        int i = x;
//        while (i < w + x) {
//            int j = y;
//            while (j < h + y) {
//                g.fillRect(w / 20 + i, h / 20 + j, w / 10, h / 10);
//                j = j + (int) (3 / 10 * h);
//            }
//            i = i + (int) (3 / 10 * w);
//        }
            x += 90;
//            y += 20;
//            h = h - h/10;
        }
    }

//    public void drawHouses(Graphics2D gr) {
//        int h = 200;
//        for (int i = 0; i < 3; i++) {
//            new DrawHouse(90 * i, 100 + 20 * i,  60, h).draw(gr);
//            h = h - 20;
//        }
//    }
}
