package ru.vsu.cs.course1;

import java.awt.*;

public class DrawBoard implements Drawable {
    private double kx;
    private double ky;
    private int size;

     public DrawBoard( double kx, double ky, int size) {
        this.kx = kx;
        this.ky = ky;
        this.size = size;
    }

    @Override
    public void draw(Graphics g, int width, int height) {
         int x = (int) (kx*width);
         int y = (int) (ky*height);
        g.setColor(new Color(0x6F4423));
        g.fillRect(x, y, 20, 200); // палка
        g.fillRect(x +20, y + 20, 100, 80); // правый
        g.fillRect(x -100, y, 100, 80); //  левый
        g.fillPolygon(new int[] {x +120, x + 120, x + 160}, new int[] {y +20, y +100, y +60}, 3); // правый треугольник +40
        g.fillPolygon(new int[] {x - 100, x - 100, x - 140}, new int[] {y, y + 80, y + 40}, 3); // левый треугольник -40
        g.setColor(new Color(0xFE9D51));
        g.drawString("You chose", x - 55, y + 30);
        g.drawString("your own path", x + 30, y + 50);
    }
}
