package Homework2.Task2;

import java.util.Scanner;

public class EQSolver {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter some number as a: ");
        double a = in.nextDouble();
        System.out.println("Enter some number as b: ");
        double b = in.nextDouble();
        System.out.println("Enter some number as c: ");
        double c = in.nextDouble();

        double x1;
        double x2;

        x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        if (x1 < 0 || x2 < 0) {
            System.out.println("There is no solution");
        }
        if (x1 == 0 || x2 == 0) {
            System.out.println("There is only one root");
            System.out.println("x1 is: " + x1);
            System.out.println("x2 is: " + x2);
        }
        else {
            System.out.println("x1 is: " + x1);
            System.out.println("x2 is: " + x2);
        }
    }
}