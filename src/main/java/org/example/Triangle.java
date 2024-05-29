package org.example;

public class Triangle extends  Shape{
    public int side;

    public Triangle(int side) {
        if (side <= 0) {
            throw  new IllegalArgumentException("Side cannot be <= 0");
        }
        this.side = side;
        square = (side*side*Math.sqrt(3))/4;
    }

    @Override
    public void print() {

        System.out.println("Shape: Triangle");
        System.out.println("Side length:" + side);

        try {
            if (side > 100) {
                throw new RuntimeException("Side is too big! I cannot draw it here!");
            }
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        for (int i = 0; i <= side; i++) {
            for (int j = 0; j <= side * 2; j++) {
                if (j == side - i || j == side + i || i == side) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public int getSide() { return side; }
}
