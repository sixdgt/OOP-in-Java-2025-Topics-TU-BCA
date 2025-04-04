package main;
// extending abstract class
// Note: either class should be defined as abstract or should override all
// abstract method of its parent abstract class
public class Circle extends Shape {
    public final double PI = 3.1428;
    public double RADIUS;
    
    // overriding abstract method of parent abstract class
    @Override
    public double area(){
        double area_of_circle = PI * RADIUS * RADIUS;
        return area_of_circle; // since result is type double so returning it as final data
    }
    
    @Override
    public double perimeter(){
        double perimeter_of_circle = 2 * PI * RADIUS;
        return perimeter_of_circle;
    }
}
