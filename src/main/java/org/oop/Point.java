package org.oop;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] calculateDistance(Point otherPoint){

        double xDistance = otherPoint.x- this.x;
        double yDistance = otherPoint.y - this.y;

        double[] distance = {xDistance, yDistance};

        return distance;
    }
}
