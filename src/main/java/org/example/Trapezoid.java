package org.example;

public class Trapezoid  extends  Shape{
     private int height;
     private int basis;
     private int basis2;

     public Trapezoid(int height,int basis,int basis2) {
          this.height = height;
          this.basis = basis;
          this.basis2 = basis2;
     }

     @Override
     public void print() {

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
