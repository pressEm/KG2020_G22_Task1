package ru.vsu.cs.course1;

import java.awt.*;

public class DrawTree implements Drawable{
    private double kx;
    private double ky;
    private int width;
    private int height;
    private Color color;

    DrawTree(double kx, double ky){
        this.kx = kx;
        this.ky = ky;
    }

//    public void drawTrees(Graphics2D gr) {
//        int width = 40;
//        int height = 90;
//        Color color1 = new Color(0x20AA4C);
//        Color color2 = new Color(0x187D38);
//        for (int j = 0; j < 7; j++) {
//            for (int i = 0; i < 7 - j; i++) {
//                if (j % 2 == 0) {
//                    new DrawTree(50 * i + j * 30 + 250, j * 10 + 250, width, height, color2).draw(gr);
//                } else new DrawTree(50 * i + j * 30 + 250, j * 10 + 250, width, height, color1).draw(gr);
//            }
//            width++;
//            height = height + 8;
//        }
//    }
//
    @Override
    public void draw(Graphics g, int width, int height) {
        int x = (int) (kx*width);
        int y = (int) (ky*height);
        System.out.println(x + "    4545 " + y);
        int widthTree = 40;
        int heightTree = 90;
        Color color1 = new Color(0x20AA4C);
        Color color2 = new Color(0x187D38);
        Color color;
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 7 - j; i++) {
                if (j % 2 == 0) {
                    color = color2;
                } else {
                    color = color1;
                }
                int x1 = x + 50 * i + j * 30;
                int y1 = y + j * 10;
                g.setColor(new Color(0x724E00));
                g.fillPolygon(new int[]{(int) x1 + widthTree / 2, (int) x1 + 5 * widthTree / 12, (int) x1 + 7 * widthTree / 12}, new int[]{y1 + heightTree / 4, y1 + heightTree, y1 + heightTree}, 3);
                g.setColor(color);
                g.fillOval(x1, y1, widthTree, 2 * heightTree / 3);
                g.setColor(new Color(0x148526));
                g.drawOval(x1, y1, widthTree, 2 * heightTree / 3);
            }
            widthTree++;
            heightTree = heightTree + 8;
        }
    }
}
