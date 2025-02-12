package main.single;

public class Main {
    public static void main(String[] args) {
        User u1 = new User();
        u1.first_name = "Madan";
        u1.last_name = "Bhandari";
        u1.address = "Kathmandu";
        u1.email = "madan@gmail.com";
        u1.gender = "male";
        
        Employee e1 = new Employee();
        // storing values to parent properties via child object
        e1.first_name = "Sudip Bajimaya";
        e1.emp_no = "005";
        e1.shift = "Morning";
        e1.department = "Administration";
        e1.designation = "Manager";
        // accessing parent class properties
        System.out.println("First Name: " + e1.first_name);
        e1.showInfo(); // own method
        e1.info(); // parent class method
    }
}
