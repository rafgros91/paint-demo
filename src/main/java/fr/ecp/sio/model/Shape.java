package fr.ecp.sio.model;

import java.awt.*;

public abstract class Shape implements Paintable{
    public int x;
    public int y;

    @Override
    public String toString() {
        return "toString() de shape" + super.toString();
    }

    public abstract double getArea();

    public abstract void paint(Graphics g);
}
