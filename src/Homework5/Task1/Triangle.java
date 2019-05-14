package Homework5.Task1;

public class Triangle {

    void area(double x1, double y1, double x2, double y2, double x3, double y3) {

        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));

        try {
            if (a + b > c && a + c > b && b + c > a) {

                double p = (a + b + c) / 2.0;
                double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(area);
            } else {
                throw new NotTriangleException("Exception! This is not a triangle");
            }
        } catch (NotTriangleException e) {
            System.out.println(e.getMessage());
        }

    }


}

