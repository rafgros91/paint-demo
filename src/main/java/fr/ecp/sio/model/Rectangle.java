package fr.ecp.sio.model;

import java.awt.*;

public class Rectangle extends Shape{

    public int width;
    public int height;

    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle { x= " + x + ", y= " + y + ", width= " + width + ", height= " + height + " }";
    }

    public void paint(Graphics g) {
        g.drawRect(x, y, width, height);
    }
}
