package ru.vsu.cs.course1;

import java.awt.*;

public class DrawHouse {
    public void draw(Graphics2D g, int x, int y, int h){
        g.setColor(new Color(0x8F918A));
        g.fillRect(x, y, 60, h);
    }
}
