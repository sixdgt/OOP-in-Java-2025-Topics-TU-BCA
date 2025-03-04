package main;
// since our ConstructorOverloadingExample class is in different package
// we need to import the class and same for MethodOverloadingExample
import main.constructor.ConstructorOverloadingExample;
import main.method.MethodOverloadingExample;

public class Main {
    public static void main(String args[]){
        /** Constructor Overloading example
        * creating object with constructor having parameter and parameterless
        * 1. default constructor i.e parameterless constructor
        */
        ConstructorOverloadingExample eg_one = new ConstructorOverloadingExample();
        /** we have already initialized the data to class variable inside
        * default constructor so whenever we create object using default
        * constructor, the data are passed automatically but if any of the attributes
        * are not assigned value inside constructor then they will hold `null` value
        * during the time of object creation
        */
        // accessing data i.e attributes using object
        System.out.println("Name: " + eg_one.full_name);
        System.out.println("Username: " + eg_one.username);
        System.out.println("Role: " + eg_one.role);
        /** 2. creating object with single parameter constructor
        * in case of our example we have assigned value to `username` only so
        * except `username` other attributes will have `null` value during creating
        * object using this constructor
        */
        ConstructorOverloadingExample eg_two =
                new ConstructorOverloadingExample("useradmin");
        // accessing value:
        System.out.println("Username: " + eg_two.username);
        // Note: other attributes will have `null` value
        System.out.println("Full Name: " + eg_two.full_name);
        System.out.println("Role: " + eg_two.role);
        // 3. creating object with multple parameter constructor
        ConstructorOverloadingExample eg_three = 
                new ConstructorOverloadingExample("Himal Rai", "director");
        // accessing data of class attributes
        System.out.println("Full Name: " + eg_three.full_name);
        System.out.println("Role: " + eg_three.role);
        System.out.println("Username: " + eg_three.username);
        
        // method overloading example
        // creating object of class `MethodOverloadingExample`
        MethodOverloadingExample eg_four = new MethodOverloadingExample();
        // calling all method
        // 1. method with type void and two double parameter
        eg_four.area(15.00, 10.00);
        // 2. method with type double and single parameter
        // since the method returns value so we can re-use assigning it to variable
        // or simply print incase of no future use
        System.out.println("Area of Circle: " + eg_four.area(11.00));
        // storing to any value
        double result = eg_four.area(12.00); // since it returns double value
        System.out.println("Area of circle: " + result);
        // 3. method with type int and parameterless
        System.out.println("Area of Square: " + eg_four.area());
        // storing to any value
        int output = eg_four.area();
        System.out.println("Area of square: " + output);
        // 4. method with type int and two parameter
        System.out.println("Area of triangle: " + eg_four.area(5, 8));
    }
}
