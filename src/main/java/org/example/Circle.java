package org.example;

import java.nio.file.Path;

public class Circle extends Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void print() {

        System.out.println("Shape: circle");
        System.out.println("Radius: " + radius);

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
