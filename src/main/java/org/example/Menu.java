package org.example;

import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    Shape shape;

    private byte choice = 1;
    private static Scanner scanner = new Scanner(System.in);

    public void run() {
        while (choice != 0) {

            System.out.println("Welcome to the ShapeDrawer Game");
            System.out.println("1. Quad");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Triangle");
            System.out.println("5. Trapezoid");
            System.out.println("0. Close");
            System.out.print("Please choose > ");

            choice = scanner.nextByte();
            clear();

            switch (choice) {
                case 1:
                    int side = 0;
                    System.out.print("Side length > ");
                    Quad quad = new Quad(scanner.nextInt());
                    print(quad);
                    break;
                case 2:
                    int side1, side2;
                    System.out.print("First side length > ");
                    side1 = scanner.nextInt();
                    System.out.print("Second side length > ");
                    side2 = scanner.nextInt();
                    Rectangle rec = new Rectangle(side1,side2);
                    print(rec);
                    break;
                case 3:
                    int radius;
                    System.out.print("Radius length > ");
                    radius = scanner.nextInt();
                    Circle circle = new Circle(radius);
                    print(circle);
                    break;
                case 4:
                    System.out.print("Side length > ");
                    side = scanner.nextInt();
                    Triangle triangle = new Triangle(side);
                    print(triangle);
                    break;
                case 5:
                    int height;
                    System.out.print("Height length > ");
                    height = scanner.nextInt();
                    System.out.print("First basis length > ");
                    side1 = scanner.nextInt();
                    System.out.print("Second basis length > ");
                    side2 = scanner.nextInt();
                    Trapezoid trapezoid = new Trapezoid(height,side1,side2);
                    print(trapezoid);
                    break;
                case 0:
                    scanner.close();
                    System.exit(1);
                    break;
                default:
                    System.out.println("Please, choose the correct point!");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    clear();
            }
        }
    }

    private static void print(Shape shape) {
        System.out.println("Square: " + shape.getSquare());
        shape.print();
        System.out.println("\n< Press Any Key >");
        scanner.nextLine();
        scanner.nextLine();
        clear();
    }

    private static void clear() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
}
