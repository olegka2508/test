package com.company;

import static java.lang.StrictMath.sqrt;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a, b, c, D;
        double x1, x2;
        a = 1;
        b = 2;
        c = 1;
        D = b * b - (4 * a * c);
        if (D > 0) {
            x1 = (-b + sqrt(D)) / (2 * a);
            x2 = (-b - sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения равны:");
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
        if (D == 0) {
            x1 = (-b + sqrt(D)) / (2 * a);
            System.out.println("Единственный корень уравнения равен:");
            System.out.println("x=" + x1);
        }
        if (D < 0) {
            System.out.println("Корней уравнения нет");
        }
    }

}
