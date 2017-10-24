package fr.ecp.sio.ui;

import fr.ecp.sio.model.Paintable;
import fr.ecp.sio.model.Rectangle;

import java.awt.*;
import java.util.List;

public class DrawingCanvas extends Canvas{

    public List<fr.ecp.sio.model.Shape> shapes;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Paintable shape : shapes) {
            shape.paint(g);
        }
    }

}
