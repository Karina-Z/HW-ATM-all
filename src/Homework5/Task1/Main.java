package Homework5.Task1;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.area(53, 18, 56, 23, 24, 27);

        System.out.println("----------------------------------------------------------");

        Triangle triangleWithEx = new Triangle();
        triangleWithEx.area(1, 1, 2, 2, 3, 3);
    }
}
