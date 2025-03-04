package main;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        System.out.println("Basic Arithmatic Operation");
        
        int num_one = 550;
        System.out.println("Number One: " + num_one);
        
        int num_two = 0;
        System.out.println("Number Two: " + num_two);
        try{
            int result = num_one/num_two;
            System.out.println("Result: " + result);
        } catch(Exception e){
            System.out.println("Message: " + e.getMessage());
        }
        System.out.println("This is a basic example of exception");
    }
}
