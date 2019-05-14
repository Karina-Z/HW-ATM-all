package Homework4.Task1;

public class Area extends Shape {

    @Override
    public double rectangleArea(double a, double b) {
        return a * b;
    }

    @Override
    public double squareArea(double side) {
        return Math.pow(side, 2);
    }

    @Override
    public double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
