package main;

import product.ProductInterfaceImplementation;

public class Main {
    public static void main(String args[]){
        ProductInterfaceImplementation product = new 
        ProductInterfaceImplementation("Gaming Mouse", 2500.00, "Mouse", 
                9.5 , 13, 4);
        product.calculateProductPrice();
    }
}
