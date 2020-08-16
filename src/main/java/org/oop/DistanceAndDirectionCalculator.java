package org.oop;

public class DistanceAndDirectionCalculator {
    public static double distance(Point from, Point to) {
        //double xDistance = to.getX() - from.getX();
        //double yDistance = to.getY() - from.getY();


        double[] Distance = from.calculateDistance(to);

        return Math.sqrt(Math.pow(Distance[0], 2) + Math.pow(Distance[1], 2));
    }

    public static double direction(Point from, Point to) {
        //double xDistance = to.getX() - from.getX();
        //double yDistance = to.getY() - from.getY();

        double[] Distance = from.calculateDistance(to);

        return Math.atan2(Distance[1], Distance[0]);
    }
}
