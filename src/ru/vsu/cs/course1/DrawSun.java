package ru.vsu.cs.course1;

import java.awt.*;

public class DrawSun extends Component{
    public void draw(Graphics2D g, int x, int y, int r, int R, int n, Color color) {
        g.setColor(color);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
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

