package main;

public class OperatorExample {
    public static void main(String args[]){
        /** Operators in Java
         * Operators are use to run/execute certain operations
         * 1. Arithmetic Operator
         * sum, multiplication, division, subtraction, modulas
         */
        double price = 15778.23;
        double discount = 1578;
        double vat = 1348;
        // sum
        double price_with_vat = price + vat;
        // subtract
        double price_after_discount = price_with_vat - discount;
        System.out.println("Price: " + price);
        System.out.println("Discount Amount: " + discount);
        System.out.println("VAT Amount: " + vat);
        System.out.println("Price with VAT: " + price_with_vat);
        System.out.println("Price After Discount: " + price_after_discount);
        
        // multiplication
        int item_quantity = 5;
        double total_price = price * item_quantity;
        System.out.println("Total Price: " + total_price);
        
        // division
        double offer_percent = 5;
        double offer_amount = (offer_percent/100) * total_price;
        System.out.println("Offer Amount: " + offer_amount);
        
        // modulas - will return remainder value
        int num = 17; 
        System.out.println("Modulas: " + num % 2);
        
        /**
         * 2. Assignment Operator
         * =, +=, -=, /=, *=
         */
        int cart_no = 12;
        System.out.println("Cart no before adding: " + cart_no);
        cart_no += 4; // cart_no = cart_no + 4 i.e 12 + 4
        System.out.println("Cart no after adding: " + cart_no);
        // it will work with -, /, * & % in similar way
        
        /**
         * 3. Comparative Operator
         * ==, !=, <, >, <=, >=
         */
        String username = "dav";
        String password = "1234";
        int roll_no = 12;
        System.out.println("Equals To: " + username == "dav");
        System.out.println("Not equals to: " + password != "1234");
        System.out.println("Greater Than: " + (roll_no > 10));
        System.out.println("Lesser Than: " + (roll_no < 10));
        System.out.println("Greater than equals to: " + (roll_no >= 12));
        System.out.println("Lesser than equals to: " + (roll_no <= 12));
        
        /**
         * 4. Logical Operator
         * && -> AND - all condition must return true
         * || -> OR - if any of the condition is true then return true
         */
        boolean result_AND = roll_no >= 12 && roll_no <= 12;
        System.out.println("Logical AND: " + result_AND);
        boolean result_OR = roll_no <= 12 || roll_no >= 13;
        System.out.println("Logical OR: " + result_OR);
        
        /**
         * 5. Ternary operator
         * syntax: condition ? "true":"false"
         */
        double sum = 23 + 12;
        System.out.println("Result: " + (sum == 35? "Correct": "Wrrong"));
    }
}
