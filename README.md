##Articulation

1. Getters and setters were removed as they weren't leveraging any advantages of OOP.

2. Encapsulation was not achieved initially due to exposure of private variables in the DistanceAndDirectionCalculator.java

3. Logic for Calculation of direction and distance was abstracted away from DistanceAndDirectionCalculator.java to Point.java 

4. Avoided duplication of common part of the code (calculation of X and Y distance twice)

**Changes in DistanceAndDirectionCalculator.java**
```java
    public static double distance(Point from, Point to) {

        // abstract away from the calculator
        return from.calculateDistance(to);
    }

    public static double direction(Point from, Point to) {

        // abstract away from the calculator
        return from.calculateDirection(to);
    }
```

**Changes in Point.java**
```java
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

```