package lab4;

import java.awt.Point;

public class Parallelogram{

    Point upperLeft, bottomRight;
    double length;

    public Parallelogram(Point upperLeft, Point bottomRight, double length){
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
        this.length = length;
    }

    public double area(){
        return Math.abs((upperLeft.y - bottomRight.y) * length);
    }
    
    public double perimeter(){
        return 2 * length + 2 * (this.getUpperRight().distance(bottomRight));
    }
    
    publicPointt getUpperRight(){
        return new Point(upperLeft.x + length, upperLeft.y);
    }
    
    public Point getBottomLeft(){
        return new Point(bottomRight.x - length, bottomRight.y);
    }

    @Override
    public int hashCode(){
        return 3 * upperLeft.hashCode() + 5 * bottomRight.hashCode() + 7 * (int) length;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Parallelogram other = (Parallelogram) obj;
        if(!(other.upperLeft.equals(upperLeft))) return false;
        if(!(other.bottomRight.equals(bottomRight))) return false;
        if(other.length != length) return false;
        return true;
    }
}   