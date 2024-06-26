package lab4;

public class Square {
    Point topLeft;
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

        Square other = (Square) o;

        return (topLeft.equals(other.topLeft) && sideLength == other.sideLength);
    }
}
