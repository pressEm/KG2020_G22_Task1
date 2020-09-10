package ru.vsu.cs.course1;

import java.awt.*;

public class DrawBoard {
    public void draw(Graphics2D g, int x, int y){
        g.setColor(new Color(0x6F4423));
        g.fillRect(x,y, 20, 200); // палка
        g.fillRect(x+20, y, 100, 80); // правый
        g.fillRect(x-100, y+20, 100, 80); //  левый
        g.fillPolygon(new int[] {x+120, x + 120, x + 160}, new int[] {y, y+80, y +40}, 3); // правый треугольник +40
        g.fillPolygon(new int[] {x - 100, x - 100, x - 140}, new int[] {y+20, y + 100, y + 60}, 3); // левый треугольник -40
        g.setColor(new Color(0xFE9D51));
//        Font font = new Font("Tahoma", Font.BOLD|Font.ITALIC, 40);

        g.drawString("You chose your own path", x - 80, y + 30);
    }
}
