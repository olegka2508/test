package com.company;

import static java.lang.StrictMath.sqrt;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a, b, c, D, numberOfRoots;
        double x1, x2;
        a = 15;
        b = 28;
        c = 5;
        numberOfRoots = 99;
        D = b * b - (4 * a * c);
        if (D > 0) {
            numberOfRoots = 2;
        }
        if (D == 0) {
            numberOfRoots = 1;
        }
        if (D < 0) {
            numberOfRoots = 0;
        }
        switch (numberOfRoots) {
            case 2:
                x1 = (-b + sqrt(D)) / (2 * a);
                x2 = (-b - sqrt(D)) / (2 * a);
                System.out.println("Корни уравнения равны:");
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
                break;
            case 1:
                x1 = (-b + sqrt(D)) / (2 * a);
                System.out.println("Единственный корень уравнения равен:");
                System.out.println("x=" + x1);
                break;
            case 0:
                System.out.println("Корней уравнения нет");
                break;
        }
    }
}