package ru.vsu.cs.course1;

import java.awt.*;

public class DrawMountain {
    public void draw(Graphics2D g, int[] x, int[] y){
        g.setColor(new Color(0x986E50));
        g.fillPolygon(x,  y, 3);
    }
}
