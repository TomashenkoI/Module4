package ua.goit.java;

import static ua.goit.java.Circle.*;

/**
 * Created by 7 on 10.03.2016.
 */
public class SquareCalculate {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();


        double CircleSquare;
        double Pi = 3.14d;
        CircleSquare = Pi*Circle.Radius*Circle.Radius;
        System.out.println("Circle Square = "+CircleSquare);

        int RectangleSquare;
        RectangleSquare = Rectangle.SideA*Rectangle.SideB;
        System.out.println("Rectangle Square = "+RectangleSquare);

        int TriangleSquare;
        TriangleSquare = Rectangle.SideA*Rectangle.SideB/2;
        System.out.println("Triangle Square = "+TriangleSquare);


}
}
