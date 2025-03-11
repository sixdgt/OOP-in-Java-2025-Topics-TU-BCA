package main;

public class ReverseStringExample {
    public static void main(String args[]){
        String name = "Rajesh";
        char data[] = name.toCharArray();
        char reverse_data[] = name.toCharArray();
        int index = data.length - 1;
        for(int i = 0; i < data.length; i++){
            reverse_data[i] = data[index];
            index--;
        }
        String reverse_string = new String(reverse_data);
        System.out.println("Result: " + reverse_string);
    }
}
