package Homework1;

public class EQSolver {
    public static void main(String[] args) {

        double a = 10;
        double b = 20;
        double c = 30;

        double x1;
        double x2;

        x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
        x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;

        System.out.println(x1);
        System.out.println(x2);

    }
}

