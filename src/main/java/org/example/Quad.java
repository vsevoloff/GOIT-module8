package org.example;

public class Quad extends  Shape {
     private int side;


     public Quad(int side) {
         if (side <= 0) {
             throw new IllegalArgumentException("Side cannot be <= 0");
         }
         this.side = side;
         square = side*side;
     }



     @Override
    public void print() {

         try {
             if (side > 100) {
                 throw new RuntimeException("Side is too big! I cannot draw it here!");
             }
         } catch (RuntimeException ex) {
             System.out.println(ex.getMessage());
             return;
         }

         System.out.println("Shape: Quad");
         System.out.println("Side length: " + side);

         if (side == 1) {
             System.out.print("*");
             return;
         }

         for (int i = 0; i < side; i++) {
             System.out.print("* ");
         }
         System.out.println();

         for (int j = 0; j < side - 2; j++) {
             System.out.print("* ");
             for (int i = 0; i < side - 2; i++) {
                 System.out.print("  ");
             }
             System.out.println("*");
         }

         for (int i = 0; i < side; i++) {
             System.out.print("* ");
         }
     }


    public int getSide() { return side; }

}
