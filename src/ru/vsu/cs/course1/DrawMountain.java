package ru.vsu.cs.course1;

import java.awt.*;

public class DrawMountain implements Drawable {
//    private int[] x;
//    private int[] y;
    private int n;
    private double kx;
    private double ky;


    public DrawMountain( double kx, double ky,  int n) {
        this.n = n;
        this.kx = kx;
        this.ky = ky;
    }


    @Override
    public void draw(Graphics g, int width, int height) {
        int dx0 = (int) (kx*width);
        int dy0 = (int) (ky*height);
        System.out.println(dx0 + "  1  " + dy0);
        for (int i = 0; i < n; i++) {
            int [] x = new int[] {dx0, dx0 + 100, dx0 + 50};
            int [] y = new int[] {dy0, dy0, 2*dy0/3 - 20 * i};
            g.setColor(new Color(0x986E50));
            g.fillPolygon(x, y, 3);
            g.setColor(new Color(0xE4EDFF));
            dx0 = dx0 + 70;
        }
    }
}
