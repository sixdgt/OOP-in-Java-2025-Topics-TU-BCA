package main;

public class MethodExample {
    /**
     * method examples in Java
     * Two types of method: 1. built-in 2. User-defined 
     * We are going to learn User-defined method in today's lab
     * User-defined method: method that are defined by user i.e programmer
     * developer in the customized requirements inside the class
     * We can define method in different ways. Such as:
     * 1. With return type and Without parameter
     * 2. Without return type and without parameter
     * 3. With return type and with parameter
     * 4. without return type and with parameter
     * 
     * a. return type: it holds the data type of the method
     * that means which type of data it is going to return
     * example: int, double, boolean, String
     * b. without return type: it is defined as type `void`
     * c. parameters: variable/value defined inside method's parenthesis
     * while defining the method
     * d. arguments: variable/value passed inside method's parenthesis
     * while invoking/calling the method
     * 
     * syntax of method:
     * access-specifier datatype(return type) method_name(){}
     * eg: public int doSum(){}
     */
    // 1. method with return type and without parameter
    /**
     * this method returns the area of circle
     * @return double
     */
    public double calculateArea(){
        double pi = 3.14258;
        double radius = 26.00;
        double area = pi * radius * radius; // area of circle
        return area;
    }
    public boolean getUserStatus(){
        boolean status = false;
        String username = "DAV";
        if(username == "DAV"){
            status = true;
        } else {
            status = false;
        }
        return status;
    }
    // lab task 1: create a method with type `int` which do sum of two
    // whole number
    public int sumOfTwoWholeNumber(){
        int num_one = 120;
        int num_two = 358;
        int sum = num_one + num_two;
        return sum;
    }
    // 2. without return type and without parameter
    // here method will be type: `void`
    public void displayQuote(){
        String quote = "Happy Day brings Happy Moment!";
        System.out.println("Quote: " + quote);
    }
    
    public void showPerimeter(){
        double pi = 3.1428;
        double radius = 15.00;
        double perimeter = 2 * pi * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
    /**
     * lab task 2: create a method with type `void`, and it should
     * display the details of student: full_name, email, gender, address
     * lab task 3: create a method with type `void`, and it should
     * display the calculation of vat & discount amount of a product
     * which has a marked price of Rs. 50,000.00, discount 10% & vat 13%
     */
    // task2:
    public void displayStudentInfo(){
        String full_name = "Madan Bhandari";
        String email = "madan@gmail.com";
        String gender = "Male";
        String address = "Baitadi";
        System.out.println("Name: " + full_name);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
    }
    // task 3:
    public void displayOrderPrice(){
        double marked_price = 50000.00;
        double discount_percent = 10/100;
        double vat_percent = 13/100;
        double discount_amount = marked_price * discount_percent;
        double vat_amount = marked_price * vat_percent;
        double total = marked_price - discount_amount + vat_amount;
        System.out.println("Marked Price: " + marked_price);
        System.out.println("Discount Percent: " + discount_percent);
        System.out.println("Discount Amount: " + discount_amount);
        System.out.println("VAT Percent: " + vat_percent);
        System.out.println("VAT Amount: " + vat_amount);
        System.out.println("Total Price: " + total);
    }
    // 3. with return type and with parameter
    // note: while invoking the method with parameter, we must pass
    // arguments through the parenthesis
    public String getStudentPosition(double obtained_marks){
        double full_marks = 100.00;
        String position = "Fail";
        double obtained_percent = (obtained_marks/100) * full_marks;
        if(obtained_percent <= 39.99){
            position = "Fail";
        } else if (obtained_percent >= 40 && obtained_percent <= 59.99){
            position = "Third Division";
        } else if (obtained_percent >= 60 && obtained_percent <= 69.99){
            position = "Second Division";
        } else if (obtained_percent >= 70 && obtained_percent <= 84.99){
            position = "First Division";
        } else if (obtained_percent >= 85 && obtained_percent <= 100){
            position = "Distinction";
        }
        return position;
    }
    // last task 4: create a method without return type and with parameter
    // with any example you wish
    
    // calling all method inside main method
    public static void main(String args[]){
        // creating class object
        MethodExample eg = new MethodExample();
        // calling methods of class
        // note: we can place the value return by method inside
        // System.out.println() but method without return type not allowed
        
        // 1. method with return type and without parameter
        System.out.println("Area of Circle: " + eg.calculateArea());
        System.out.println("User Status: " + eg.getUserStatus());
        System.out.println("Sum of Two Number: " + eg.sumOfTwoWholeNumber());
        // 2. method without return type and without parameter
        eg.displayOrderPrice();
        eg.displayQuote();
        eg.displayStudentInfo();
        eg.showPerimeter();
        // 3. method with return type and with parameter
        // note: must pass arguments through method
        // here: since method getStudentPosition() takes double value as
        // parameter so we are passing value to the method while calling
        System.out.println("Acquired Position: " + eg.getStudentPosition(68));
    }
}   

