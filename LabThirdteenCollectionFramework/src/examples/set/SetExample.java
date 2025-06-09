package examples.set;

import java.util.Set;
import java.util.HashSet;

public class SetExample {
    public static void main(String args[]){
        // Creating object
        Set<Integer> whole_num = new HashSet<>();
        Set<Integer> even_num = new HashSet<>();
        Set<Integer> odd_num = new HashSet<>();
        // adding elements to set
        whole_num.add(1); whole_num.add(2); whole_num.add(3);
        whole_num.add(4); whole_num.add(5); whole_num.add(6);
        whole_num.add(7); whole_num.add(8); whole_num.add(9);
        
        even_num.add(2); even_num.add(4); even_num.add(6);
        even_num.add(8); even_num.add(10); even_num.add(12);
        
        odd_num.add(1); odd_num.add(3); odd_num.add(5);
        odd_num.add(7); odd_num.add(9); odd_num.add(11);
        // displaying element of set
        System.out.println("Whole Number: " + whole_num);
        System.out.println("Even Number: " + even_num);
        System.out.println("Odd Number: " + odd_num);
        
        // displaying elements using loop
        for(Integer i: whole_num){
            System.out.println("Whole Number: " + i);
        }
        // do it for even and odd number
        
        // getting set intersection using retainAll() method
        Set<Integer> intersect_set_a = new HashSet<>(whole_num);
        intersect_set_a.retainAll(even_num); // intersection of even number
        Set<Integer> intersect_set_b = new HashSet<>(whole_num);
        intersect_set_b.retainAll(odd_num); // intersection of odd number
        System.out.println("Intersected Set A: " + intersect_set_a);
        System.out.println("Intersected Set B: " + intersect_set_b);
        
        // getting the set difference using removeAll() method
        Set<Integer> diff_set_a = new HashSet<>(whole_num);
        Set<Integer> diff_set_b = new HashSet<>(whole_num);
        // even number difference
        System.out.println("Diff Set A before: " + diff_set_a);
        System.out.println("Even Set before: " + even_num);
        diff_set_a.removeAll(even_num);
        System.out.println("Diff Set A after: " + diff_set_a);
        System.out.println("Even Set after: " + even_num);
        
        // odd number difference
        System.out.println("Diff Set B before: " + diff_set_b);
        System.out.println("Odd Set before: " + odd_num);
        diff_set_b.removeAll(odd_num);
        System.out.println("Diff Set B after: " + diff_set_b);
        System.out.println("Odd Set after: " + odd_num);
        
        // change in element of existing set
        whole_num.add(12); // while change in whole_num but not in diff_set_a
        System.out.println("Whole Number: " + whole_num);
        System.out.println("Diff Set A: " + diff_set_a);
        
        // create new set with whole number and clear all elements using clear()
        Set<Integer> new_whole_num_set = new HashSet<>(whole_num);
        System.out.println("New Whole Num Set Before: " + new_whole_num_set);
        new_whole_num_set.clear();
        System.out.println("New Whole Num Set After: " + new_whole_num_set);
        
        // to get the size of a set use size() method
        System.out.println("Size of new whole number: " + new_whole_num_set.size());
        System.out.println("Size of whole number: " + whole_num.size());
        
        // checking if the set if empty using isEmpty() method
        System.out.println("New whole number: " + new_whole_num_set.isEmpty());
        System.out.println("Whole number: " + whole_num.isEmpty());
    }
}
