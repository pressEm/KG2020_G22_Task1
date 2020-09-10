package ru.vsu.cs.course1;

import java.awt.*;

public class DrawCloud {
    public void draw(Graphics2D g, int x, int y, int size, Color color){
        g.setColor(color);
        g.fillOval(x+3*size, y, 10*size, 5*size);
        g.fillOval(x, y+2*size, 5*size, 3*size);
        g.fillOval(x +11*size, y+2*size, 5*size, 3*size);

    }
}
