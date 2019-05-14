package Homework4.Task1;

public class Main {
    public static void main(String[] args) {

        Area area = new Area();
        System.out.println("Area of a rectangle " + area.rectangleArea(4.56, 3.18));
        System.out.println("Area of a square " +area.squareArea(4));
        System.out.println("Area of a circle " +area.circleArea(3.8));
    }
}