package main;

public class Product {
    // attributes of class `Product`
    public int product_id;
    public String product_title;
    public double product_price;
    public String product_category;
    public String product_brand;
    public String product_description;
    
    // initializing default constructor
    // Note: constructor name must be same as class name and 
    // must be of without any return type
    public Product(){
        // initializing value/data to attributes inside constructor
        // that means whenever the object of this class is created
        // the below initialized data are assigned automatically
        this.product_id = 1;
        this.product_title = "Smart Board";
        this.product_category = "Electronics";
        this.product_brand = "Huawei";
        this.product_price = 200000.00;
        this.product_description = "AI integrated Smart Board";
    }
    
    // method
    public void displayProduct(){
        System.out.println("Product ID: " + this.product_id);
        System.out.println("Product Title: " + this.product_title);
        System.out.println("Product Category: " + this.product_category);
        System.out.println("Product Brand: " + this.product_brand);
        System.out.println("Product Price: " + this.product_price);
        System.out.println("Product Description: " + this.product_description);
    }
}
