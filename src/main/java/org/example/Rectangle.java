package org.example;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width or Height aren't to be equal or smaller than 0");
        }
        this.height = height;
        this.width = width;
        square = height*width;
    }

    @Override
    public void print() {

        System.out.println("Shape: Rectangle");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);

        try {
            if (width > 100 || height > 100) {
                throw new RuntimeException("Width or Height are too big! I can't draw it!");
            }
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        if (width == 1) {
            for (int i =0; i < height; i++) {
                System.out.println("*");
            }
            return;
        }
        else if(height == 1) {
            for (int i =0; i<width;i++) {
                System.out.print("* ");
            }
            return;
        }

        for (int i = 0; i < width; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int j = 0; j < height - 2; j++) {
            System.out.print("* ");
            for (int i = 0; i < width - 2; i++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < width; i++) {
            System.out.print("* ");
        }
    }


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
