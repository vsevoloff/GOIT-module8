package org.example;

public class Circle extends Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void print() {

    }

    public int getRadius() {
        return radius;
    }
}
