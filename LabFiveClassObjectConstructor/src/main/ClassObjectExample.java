package main;

public class ClassObjectExample {
    public static void main(String args[]){
        /** creating object of classes
        * Note: class `Customer` does not have any constructor
        * so here `default constructor` will be invoked/called while
        * creating the object of `Customer`
        */
        Customer c1 = new Customer();
        // assigning/storing data in class `Customer` attributes
        c1.full_name = "Hira Lal Bajagain";
        c1.email = "hiralb@gmail.com";
        c1.address = "Bharatpur";
        c1.contact = "+977 9876543210";
        c1.gender = "Male";
        c1.dob = "1990-02-15";
        // lab task 1: create two different object storing data
        Customer c2 = new Customer();
        Customer c3 = new Customer();
        // Note: here all objects c1, c2 & c3 are different object and
        // they will carry different data i.e state of class `Customer`
        c2.full_name = "Shree Kumari Shahi";
        c2.address = "Dolalghat";
        c2.email = "shreekumari@gmail.com";
        c2.contact = "+977 9812345670";
        c2.dob = "1998-07-13";
        c2.gender = "Female";
        
        c3.full_name = "Manju Basnet";
        c3.address = "Pokhara";
        c3.contact = "+977 9871234560";
        c3.dob = "2000-06-18";
        c3.gender = "Female";
        c3.email = "manjubasnet@gmail.com";
        
        // invoking/calling class `method`
        c1.displayCustomerInfo();
        c2.displayCustomerInfo();
        c3.displayCustomerInfo();
        // calling/invoking `method` with parameter & return type
        // method one: storing value return by method in any variable
        // note: datatype of variable must be same as return type
        boolean result = c1.checkAvailability("harilal@gmail.com");
        // we can use either condition statement or simply ternary operator
        // in this case: we are using ternary operator
        System.out.println("Email Status: " + 
                (result? "Email is correct":"Email is incorrect"));
        // method two: direct using conditional statement
        if(c2.checkAvailability("shreekumari@gmail.com")){
            System.out.println("Email is matching");
        } else {
            System.out.println("Email is not matching");
        }
        // method three: direct printing
        System.out.println("Email status: " + 
                c3.checkAvailability("manjubasnet1@gmail.com"));
        
        // creating object of class `Product`
        // Note: we have defined default constructor of class `Product`
        // so here the defined constructor will be called whenever the
        // object is created
        Product p1 = new Product();
        // invoking the method of class `Product`
        // since the data are already initialized inside the constructor
        // so the default value/data are assigned to class attributes
        // we can also change the data/value if needed
        p1.displayProduct();
        // changing default value
        System.out.println("Category Before: " + p1.product_category);
        p1.product_category = "Computer & Electronics";
        System.out.println("Category After: " + p1.product_category);
    }
}
