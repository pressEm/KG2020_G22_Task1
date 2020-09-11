package ru.vsu.cs.course1;

import java.awt.*;

public class DrawTree {
    public void draw(Graphics2D g, int x, int y, int width, int height, Color color){ // левая верхняя точка
        g.setColor(new Color(0x724E00));
        g.fillPolygon(new int[] {(int)x+width/2, (int) x+5*width/12 ,(int) x+7*width/12}, new int[] {y + height/4, y + height, y + height}, 3);
        g.setColor(color);
        g.fillOval(x, y, width, 2*height/3);
        g.setColor(new Color(0x148526));
        g.drawOval(x, y, width, 2*height/3);
    }
}
