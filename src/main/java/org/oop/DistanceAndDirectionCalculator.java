package org.oop;

public class DistanceAndDirectionCalculator {
    public static double distance(Point from, Point to) {

        // abstract away from the calculator
        return from.calculateDistance(to);
    }

    public static double direction(Point from, Point to) {

        // abstract away from the calculator
        return from.calculateDirection(to);
    }
}
