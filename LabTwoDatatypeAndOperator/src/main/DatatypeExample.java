package main;

public class DatatypeExample {
    public static void main(String args[]){
        // Datatype Examples in Java
        /**
         * 1. Numeric Value
         * # to store whole number we use 'int'
         * # to store decimal number we use 'double' & 'float'
         */
        int reg_no = 22314;
        int page_no = 223;
        int roll_no = 154;
        
        float price = 2450.2f;
        float result = 212.1f;
        
        double discount = 123.23;
        double vat = 0.13;
        // printing all the variables
        System.out.println("Registration No: " + reg_no);
        System.out.println("Page No: " + page_no);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Price: " + price);
        System.out.println("Result: " + result);
        System.out.println("Discount: " + discount);
        System.out.println("VAT: " + vat);
        
        /**
         * 2. Characters and Alphabets
         * we use 'String' to store such data
         */
        String name = "Lab Two";
        String faculty = "BCA";
        String module = "OOP in JAVA";
        String date = "2025-02-05";
        System.out.println("Session Name: " + name);
        System.out.println("Faculty: " + faculty);
        System.out.println("Module: " + module);
        System.out.println("Session Date: " + date);
        
        /**
         * 3. True or False and 1 or 0 
         * we use 'boolean' to store such data
         */
        boolean status = true;
        boolean present = false;
        boolean active = true;
        System.out.println("Course Status: " + status);
        System.out.println("Student Attendance: " + present);
        System.out.println("Application Active Status: " + active);
    }
}
