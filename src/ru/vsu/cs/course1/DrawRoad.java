package ru.vsu.cs.course1;

import java.awt.*;

public class DrawRoad {
    public void draw(Graphics2D g, int [] x, int[] y, int tops){
        g.setColor(new Color(0x8C6000));
        g.fillPolygon(x, y, tops);
    }
}
