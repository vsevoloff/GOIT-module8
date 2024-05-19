package org.example;

import java.nio.file.Path;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius cannot be 0");
        }
        this.radius = radius;
    }

    @Override
    public void print() {


        System.out.println("Shape: circle");
        System.out.println("Radius: " + radius);

        try {
            if (radius > 100) {
                throw new RuntimeException("Radius is too big! I cannot draw it here!");
            }
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
            return;
        }


        // draw circle
        int width = radius;
        int length = (int) (width * 1.5);
        int y = width;
        while (y >= - width) {
            int x = - length;
            while (x <= length) {
                if(Circle.coordinate(x,y) == radius){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                x++;
            }
            System.out.println();
            y -= 2;
        }
    }

    private static int coordinate(int x, int y) {
        return (int) (Math.sqrt(Math.pow(x,2) + Math.pow(y,2)));
    }


    public int getRadius () {
        return radius;
    }

}
