package main;

public class Main {
    public static void main(String[] args) {
        // creating employee object
        Employee emp = new Employee();
        // storing data in employee attributes
        emp.name = "Sanam Raj";
        emp.department = "IT Department";
        emp.designation = "Developer"; // protected
        emp.gender = "Male"; // protected
        emp.emp_no = 321;
        emp.setEmail("sanamraj@gmail.com");
        emp.setContact(9875451);
        
        emp.showDetails();
    }
}
