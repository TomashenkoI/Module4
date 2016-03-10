package ua.goit.java;

/**
 * Created by 7 on 10.03.2016.
 */
public class Distance {
    public static void main(String[] args) {
    Point1 point1 = new Point1();
    Point2 point2 = new Point2();

        double DistanceFrom0toPoint1;
        DistanceFrom0toPoint1 = Math.sqrt(Point1.X1*Point1.X1+Point1.X2*Point1.X2);

        double DistanceFrom0toPoint2;
        DistanceFrom0toPoint2 = Math.sqrt(Point2.X1*Point2.X1+Point2.X2*Point2.X2);

        double DistanceFromPoint1toPoint2;
        DistanceFromPoint1toPoint2 = DistanceFrom0toPoint1-DistanceFrom0toPoint2;
        System.out.println("Distance between Point1 and Point2 = "+DistanceFromPoint1toPoint2+"cm");

    }
}
