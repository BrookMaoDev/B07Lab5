package lab4;

import lab4.Point;

public class Square {
    java.awt.Point topLeft;
    double sideLength;

    public Square(Point topLeft, double sideLength) {
        this.topLeft = topLeft;
        this.sideLength = sideLength;
    }

    public double perimeter() {
        return sideLength * 4;
    }

    public double area() {
        return sideLength * sideLength;
    }

    public Point center() {
        return Point(topLeft.x + sideLength / 2, topLeft.y + sideLength / 2);
    }

    @Override
    public int hashCode() {
        return topLeft.hashCode() + Double.hashCode(sideLength);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (getClass() != o.getClass()) {
            return false;
        }

        Point other = (Point) o;

        return topLeft.equals(other.topLeft) && sideLength == other.sideLength;
    }
}
