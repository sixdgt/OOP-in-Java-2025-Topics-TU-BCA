package product;

public class ProductInterfaceImplementation implements ProductInterface{
    // attributes/members of product
    public String product_title;
    public double product_price;
    public String product_category;
    public double discount_percent;
    public double vat_percent;
    public int product_quantity;
    public double total_price;
    
    // parameterized constructor
    public ProductInterfaceImplementation(String title, double price,
            String category, double discount, double vat, int quantity){
        this.product_title = title;
        this.product_category = category;
        this.product_price = price;
        this.product_quantity = quantity;
        this.discount_percent = discount;
        this.vat_percent = vat;
    }
    
    // overriding all abstract methods of ProductInterface
    @Override
    public void calculateProductPrice(){
        // calculating price using method as well
        // we can directly use the method as it returns double value but in this
        // case we are creating variable
        double discount_price = this.calculateDiscount();
        double vat_amount = this.calculateVatAmount();
        this.total_price = this.product_price - discount_price + vat_amount;
        System.out.println("Actual Price: Rs." + this.product_price);
        System.out.println("Discount in Percent: " + this.discount_percent + "%");
        System.out.println("Discount in Amount: Rs." + discount_price);
        System.out.println("Vat in Percent: " + this.vat_percent +"%");
        System.out.println("Vat in Amount: Rs." + vat_amount);
        System.out.println("Total Price: Rs." + this.total_price);
    }
    @Override
    public double calculateDiscount(){
        double discount = this.product_price * (this.discount_percent * 0.01);
        return discount;
    }
    @Override
    public double calculateVatAmount(){
        double vat = this.product_price * (this.vat_percent * 0.01);
        return vat;
    }
}
