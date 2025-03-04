package main;
// importing package

import java.util.Random;

public class ExceptionHandlingExampleTwo {

    public static void main(String[] args) {
        Random r = new Random();
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < 100; i++) {
            try {
                b = r.nextInt(1, 5);
                System.out.println("Random value of b: " + b);
                c = r.nextInt(7, 12);
                System.out.println("Random value of c: " + c);
                a = 3211 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Message: " + e.getMessage());
                a = 0;
            }
            System.out.println("Value of a: " + a);
        }
    }
}
