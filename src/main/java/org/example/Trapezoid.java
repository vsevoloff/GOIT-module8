package org.example;

public class Trapezoid  extends  Shape{
     private int height;
     private int basis;
     private int basis2;

     public Trapezoid(int height,int basis,int basis2) {

        try {
            if (height <= 0 || basis <= 0 || basis2 <= 0) {
                throw new IllegalArgumentException("One of the arguments is less than or equal to zero!");
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

          this.height = height;
          this.basis = basis;
          this.basis2 = basis2;
     }

     @Override
     public void print() {

         System.out.println("Shape: Trapezoid");
         System.out.println("Height" + height);
         System.out.println("Basis: " + basis);
         System.out.println("Second basis: " + basis2);

         try {
             if (height > 100 || basis > 100 || basis2 > 100) {
                 throw new RuntimeException("One of the sides is too big. I cannot draw it!");
             }
         } catch (RuntimeException exception) {
             System.out.println(exception.getMessage());
             return;
         }

          int difference = basis2 - basis;
          double step = (double) difference / height;

          for (int i = 0; i < height; i++) {
               int currentLength = basis + (int) (i * step);
               System.out.print("*");
               for (int j = 0; j < currentLength; j++) {
                    if(i == height -1 || i == 0 || j == currentLength - 1) {
                         System.out.print("*");
                    }
                    else {
                         System.out.print(" ");
                    }
                }
               System.out.println();
          }
     }

     public int getHeight() {
          return height;
     }

     public int getBasis() {
          return basis;
     }

     public int getBasis2() {
          return basis2;
     }
}
