package lab4;

import java.lang.Math;

public class Circle {

    private double  radius;
    private Point   center;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = Math.abs(radius);
    }

    public double computeArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public boolean withinCircle(Point p) {
        return this.center.distance(p) <= this.radius;
    }

    public boolean intersects(Circle that) {
        return this.distance(that) <= this.radius + that.getRadius();
    }

    public boolean isInside(Circle that) {
        return this.distance(that) <= that.getRadius() - this.radius;
    }

    public boolean contains(Circle that) {
        return that.isInside(this);
    }

    public boolean isInscribed(Triangle t) {
        return t.A.distance(this.center) == this.radius 
                && t.B.distance(this.center) == this.radius 
                && t.C.distance(this.center) == this.radius;
    }

    @Override
    public int hashCode() {
        return (new Point(this.center.hashCode(), this.radius)).hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if(o == null){
            return false;
        }
        if(!(o instanceof Circle)){
            return false;
        }

        Circle that = (Circle)o;

        return this.point.equals(that.getCenter()) && this.radius == that.getRadius();
    }

    public double distance(Circle that) {
        return this.center.distance(that.getCenter());
    }

    public double getRadius() {
        return this.radius;
    }

    public Point getCenter(){
        return this.center;
    }

    public void setRadius (double r) {
        this.radius = r;
    }
}