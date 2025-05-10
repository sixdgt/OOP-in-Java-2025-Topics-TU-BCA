package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student std_list[] = null;

        Scanner sc = new Scanner("Enter Student Details:");
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("Enter student name:");
            s.name = sc.next();
            std_list[i] = s;
        }

    }
}
