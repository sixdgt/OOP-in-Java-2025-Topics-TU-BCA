package examples.list;

import java.util.List;
import java.util.ArrayList;

public class ListExample {
    public static void main(String args[]){
        // creating list object
        List<String> cities = new ArrayList<>();
        // adding elements in List
        cities.add("Kathmandu");
        cities.add("Bhaktapur");
        cities.add("Lalitpur");
        cities.add("Dharan");
        cities.add("Biratnagar");
        
        // calculating the size of list
        System.out.println("Total no. of cities: " + cities.size());
        
        // displaying all elements of list
        System.out.println("Cities of Nepal: " + cities);
        // it will show [Kathmandu, Bhaktapur, Lalitpur, Dharan, Biratnagar]
        
        // displaying all elements of list in sequential order
        // method one: using advance for loop
        for(String city_name: cities){
            System.out.println("City Name: " + city_name);
        }
        // method two: using for loop with get() method of list which takes index
        // as an arguments
        for(int i=0; i < cities.size(); i++){
            System.out.println("Index: " + i + " Name: " + cities.get(i));
        }
        
        // updating element of list
        // method one: simple logic with direct access using index
        System.out.println("Cities Before Updating: " + cities);
        cities.set(2, "Pokhara"); // note: index must be valid
        System.out.println("Cities After Updating: " + cities);
        // method two: applying logic with condition
        for(int i=0; i < cities.size(); i++){
            if(i == 3 && cities.get(i).equals("Dharan")){
                System.out.println("Updating element of index: " + i);
                cities.set(i, "Patan");
            }
        }
        System.out.println("Cities after update: " + cities);
        
        // checking if the element is available in the list
        boolean result = cities.contains("Kathmandu"); // returns boolean value
        if(result){
            System.out.println("Is available");
        } else {
            System.out.println("Not available");
        }
        
        // removing elements of list
        System.out.println("Cities before removing any element: " + cities);
        // method one: using index
        cities.remove(2); // note: index must be available
        // method two: using value
        cities.remove("Biratnagar");
        System.out.println("Cities after removing elements: " + cities);
    } 
}
