package ru.vsu.cs.course1;

import java.awt.*;

public class DrawRoad implements Drawable{
    private double[] kx;
    private double[] ky;
    private int tops;
    public DrawRoad (double[] kx, double[] ky, int tops){
        this.kx = kx;
        this.ky = ky;
        this.tops = tops;
    }


    @Override
    public void draw(Graphics g, int width, int height) {
         int[] x = new int[kx.length];
         int[] y = new int[ky.length];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int)(kx*)
        }
        g.setColor(new Color(0x8C6000));
        g.fillPolygon(x, y, tops);
    }
}
