package org.oop;

import java.util.Arrays;
import java.util.List;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public List<Double> calculateCoordinateDistance(Point otherPoint){
        double xDistance = otherPoint.x - this.x;
        double yDistance = otherPoint.y - this.y;

        return Arrays.asList(xDistance,yDistance);
    }

    public double calculateDistance(Point otherPoint){

        List<Double> coordinateDistance = calculateCoordinateDistance(otherPoint);

        return Math.sqrt(Math.pow(coordinateDistance.get(0), 2) + Math.pow(coordinateDistance.get(1), 2));
    }

    public double calculateDirection(Point otherPoint){

        List<Double> coordinateDistance = calculateCoordinateDistance(otherPoint);

        return Math.atan2(coordinateDistance.get(1), coordinateDistance.get(0));
    }

}