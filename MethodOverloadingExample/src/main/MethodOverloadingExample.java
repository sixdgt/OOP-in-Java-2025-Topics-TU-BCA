package main;

public class MethodOverloadingExample {
    double radius;
    double pi;
    double base;
    double height;
    
    public MethodOverloadingExample(){
        this.radius = 0;
        this.pi = 3.1428;
        this.base = 0;
        this.height = 0;
    }
    
    public void area(double radius){
        this.radius = radius;
        double result = this.pi * this.radius * this.radius;
        System.out.println("Area of Circle: " + result);
    }
    
    public double area(double base, double height){
        this.base = base;
        this.height = height;
        double result = 0.5 * (this.base * this.height);
        return result;
    }
    
    public static void main(String args[]){
        MethodOverloadingExample eg = new MethodOverloadingExample();
        // method one with single parameter which is void type
        eg.area(12);
        // method two with double parameter which is double type
        System.out.println("Area of Equilateral Triangle: " 
                + eg.area(12, 15));
    }
    
}
