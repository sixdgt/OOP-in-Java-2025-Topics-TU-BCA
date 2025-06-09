package examples.map;

import java.util.Map;
import java.util.HashMap;

public class MapExample {
    public static void main(String args[]){
        // it holds data in key-value pair
        Map<Integer, String> products = new HashMap<>();
        
        // adding elements/data in map
        products.put(0, "Desktop PC");
        products.put(1, "Monitor");
        products.put(2, "Mouse");
        products.put(3, "Keyboard");
        products.put(4, "Mic");
        
        // accessing data using get() with index
        System.out.println(products.get(2)); // it will display mouse
        // displaying map object
        System.out.println("Products: " + products);
        
        // displaying all data of map object using for loop
        for(Map.Entry<Integer, String> product: products.entrySet()){
            System.out.println("Products: key - " + product.getKey() + 
                    " value - " + product.getValue());
        }
        // in this example we have map with key type Integer and value type String
        // so it will give us Integer value as key and String value as value
        // We can also define type String key and value
        Map<String, String> students = new HashMap<>();
        students.put("full_name", "Bibek Maharjan");
        students.put("email", "bibekmh@gmail.com");
        students.put("address", "Lalitpur");
        // note key must follow the rule of identifier
        for(Map.Entry<String, String> std: students.entrySet()){
            System.out.println("Key: " + std.getKey() + " Value: " + std.getValue());
        }
        
        // updating data of map
        // same method put() is used to udpate data of map but it check the
        // condition before updating - if the key already exist in the map
        // then it updates the value of the existing key if not then it add the
        // data as new key-value pair
        // note: value can be duplicate but no keys are duplicate in map
        System.out.println("Students before updating: " + students);
        // updating with existing key
        students.put("address", "Pokhara");
        // updating with new key
        students.put("gender", "Male");
        System.out.println("Students after updating: " + students);
        
        // removing item/data from map
        System.out.println("Students before removing: " + students);
        students.remove("gender"); // it takes key as an argument
        System.out.println("Students after removing: " + students);
    }
}
