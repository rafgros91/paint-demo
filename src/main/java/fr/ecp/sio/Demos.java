package fr.ecp.sio;

import fr.ecp.sio.model.Rectangle;
import fr.ecp.sio.model.Shape;

import java.util.ArrayList;
import java.util.List;

public class Demos {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        int a = 2;
        long b;
        b = 3;
        float c = 2.37f;
        char d = 'e';
        double e = b / 3.;

        String helloWorld = "Hello" + "world!";
        System.out.println(helloWorld);

        if (a == 2) {
            System.out.println("a is 2");
        }
        if (helloWorld.contains("r")) {
            System.out.println("helloWorld contains r");
        }

        for (int i = 0; i < 10; i++){
            System.out.println("loop: " + i);
        }

        switch (a) {
            case 2:
                System.out.println("a is 2");
                break;
            case 3:
                System.out.println("a is 3");
                break;
        }

        Rectangle r1 = new Rectangle();
        r1.x = 40;
        r1.y = 20;
        r1.width = 20;
        r1.height = 40;

        double area1 = r1.getArea();
        System.out.println("Air du rectangle r1 : " + area1);

        Rectangle r2 = new Rectangle();
        r2.x = 30;
        r2.y = 60;
        r2.width = 20;
        r2.height = 80;

        //Array
        Rectangle[] rects = new Rectangle[2];
        rects[0] = r1;
        rects[1] = r2;
        boolean[] bools = new boolean[] {true, false};
        int[] ints = {12, 56};

        Rectangle r = rects[1];

        //List
        List<Rectangle> list = new ArrayList();
        list.add(r2);
        Rectangle r4 = list.get(0);

        System.out.println(r.toString());

        // Polymorphism
        Shape r3 = new Rectangle();
        r3.x = 20;
        r3.y = 30;

        List<Shape> list2 = new ArrayList<Shape>();
        list2.add(r3);
        Rectangle r5 = (Rectangle) list2.get(0);
        System.out.println(r5.toString());

        Shape shape = new Rectangle();
        System.out.println(shape.toString()); //toString() de Rectangle va etre utilise!
    }
}
