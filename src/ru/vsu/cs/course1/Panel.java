package ru.vsu.cs.course1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Panel extends JPanel {
    private DrawBoard board;
    private java.util.List<DrawCloud> clouds = new ArrayList<>();
    private DrawHouse houses;
    private DrawMountain mountains;
    private DrawSun sun;
    private DrawRoad road;
    private  DrawTree trees;
    private java.util.List<Flowers> flowersList = new ArrayList<>();
    private Flowers flowers;
    int[] xFlowers = new int[120];
    int[] yFlowers = new int[120];


    public Panel() {
        this.sun = new DrawSun(3./4, 1./6, 40, 70, 30, Color.orange);
        this.houses = new DrawHouse(1./90,  1./2, 60, 200, 3);
        this.board = new DrawBoard(4./9, 4./6, 100);
        this.clouds.add(new DrawCloud(1./3,  1./12, 10, Color.white));
        this.clouds.add(new DrawCloud(1./6,  1./5, 10, new Color(0x616B75)));
        this.clouds.add(new DrawCloud( 1./9,  1./4, 7, new Color(0x607078)));
        this.clouds.add(new DrawCloud(74./90, 1./3, 5, Color.white));
        this.mountains = new DrawMountain( 2./3,  1./2, 4);
        this.road = new DrawRoad(new double[]{2./9, 1./2, 13./18, 11./18, 2./3, 5./18, 7./18}, new double[]{1./2,  5./6, 1./2, 5./6, 1., 1., 55./60}, 7);
        this.trees = new DrawTree(1./4, 2./5);
        for (int i = 0; i < xFlowers.length; i++) {
            xFlowers[i] = random(650, 870);
            yFlowers[i] = random(320, 550);
        }
        this.flowers = new Flowers (6);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        gr.setColor(new Color(0x6A9209));
        int width = this.getWidth();
        int height = this.getHeight();
        System.out.println(height);
        gr.fillRect(0, height/2, width, height);
//        new DrawRoad(new int[]{200, 450, 650, 550, 600, 250, 350}, new int[]{300, 500, 300, 500, 600, 600, 550}, 7).draw(gr);
        sun.draw(gr, getWidth(), getHeight());
        road.draw(gr, getWidth(), getHeight());
        houses.draw(gr, getWidth(), getHeight());
        mountains.draw(gr, getWidth(), getHeight());
        trees.draw(gr, getWidth(), getHeight());
        board.draw(gr, getWidth(), getHeight());
        for (int i = 0; i < clouds.size(); i++) {
            clouds.get(i).draw(gr, getWidth(), getHeight());
        }
        flowers.draw(gr, getWidth(), getHeight());





//        drawFlowers(gr);
//        drawMountains(gr, 600);
//        drawHouses(gr);
//        new DrawHous(90,120,60, 200, 3);
//        new DrawCloud(300, 50, 10, Color.white).draw(gr);
//        new DrawCloud(150, 120, 10, new Color(0x616B75)).draw(gr);
//        new DrawCloud(80, 150, 7, new Color(0x607078)).draw(gr);
//        new DrawCloud(740, 200, 5, Color.white).draw(gr);
    }

//    public void drawFlowers(Graphics2D gr){
//        int[] x = new int[50];
//        int [] y = new int[50];
//        for (int i = 0; i < 50; i++) {
//
//            x[i] = random(650,900);
//            y[i] = random(300, 550);
//        }
//        new Flowers(x, y, 10).draw(gr);
//    }
    public int random (int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
    public void drawFlowers(Graphics2D gr) {
        List listX = new List();
        List listY = new List();

        int size = 10;
        int x0 = 650;
        while (x0 < 900) {
            int y0 = 330;
            while (y0 < 550) {
                listX.add(String.valueOf(x0));
                listY.add(String.valueOf(y0));

                y0 += random(5, 50);
            }
            x0 += random(5, 50);
        }
//        new Flowers(listX, listY, size).draw(gr);


// for (int i = 0; i < 50; i++) {
//
// x[i] = random(650, 900);
// y[i] = random(300, 550);
// }
// new Flowers(x, y, 10).draw(gr);
    }

//    public void drawHouses(Graphics2D gr) {
//        int h = 200;
//        for (int i = 0; i < 3; i++) {
//            new DrawHouse(90 * i, 100 + 20 * i,  60, h).draw(gr);
//            h = h - 20;
//        }
//    }

//    public void drawMountains(Graphics2D gr, int dx) {
//        for (int i = 0; i < 5; i++) {
//            new DrawMountain(new int[]{dx, dx + 100, dx + 50}, new int[]{300, 300, 200 - 20 * i}).draw(gr);
//            dx = dx + 70;
//        }
//    }

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
}
