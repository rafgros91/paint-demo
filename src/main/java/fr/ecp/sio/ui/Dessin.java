package fr.ecp.sio.ui;

import fr.ecp.sio.model.Circle;
import fr.ecp.sio.model.Rectangle;
import fr.ecp.sio.model.Shape;

import javax.swing.*;
import java.util.Arrays;

public class Dessin {

    public static void main(String[] args){

        //Define some shapes
        fr.ecp.sio.model.Rectangle rect1 = new Rectangle();
        rect1.x = 50;
        rect1.y = 60;
        rect1.width = 200;
        rect1.height = 300;

        Circle circle1 = new Circle();
        circle1.x = 80;
        circle1.y = 130;
        circle1.radius = 150;

        DrawingCanvas panel = new DrawingCanvas();
        panel.shapes = Arrays.asList((Shape) rect1, (Shape) circle1);

        // UI classes are provided in the javax.swing.* package
        // We create a window, give it a size, add the panel ( the default is fullscreen) and display it.
        JFrame window = new JFrame("Photoshop");
        window.setSize(640, 480);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.add(panel);
        window.setVisible(true);
    }
}
