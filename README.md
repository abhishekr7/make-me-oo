
1. Getters and setters were removed as they weren't leveraging any advantages of OOP

2. Distances(xDistance, yDistance) was being calculated twice , so added common part of the code to Point class as

```
public double[] calculateDistance(Point otherPoint){

        double xDistance = otherPoint.x- this.x;
        double yDistance = otherPoint.y - this.y;

        double[] distance = {xDistance, yDistance};

        return distance;
    }
```