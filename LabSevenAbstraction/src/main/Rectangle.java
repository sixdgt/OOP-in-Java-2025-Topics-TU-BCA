package main;

public class Rectangle extends Shape{
    public double length;
    public double breadth;
    
    @Override
    public double area(){
        double area_of_rectangle = this.length * this.breadth;
        return area_of_rectangle;
    }
    
    @Override
    public double perimeter(){
        double perimeter_of_rectangle = 2 * (this.length + this.breadth);
        return perimeter_of_rectangle;
    }
}
