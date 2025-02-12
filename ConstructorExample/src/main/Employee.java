package main;

public class Employee {

    // attributes
    int emp_no;
    String full_name;
    String email;
    String designation;
    String department;

    // constructor
    public Employee() {
        // initializing class's attributes
        this.emp_no = 156;
        this.full_name = "Hridesh Bhakta";
        this.email = "hrideshbh@gmail.com";
        this.department = "IT Department";
        this.designation = "Computer Operator";
    }

    public Employee(String email, String designation) {
        this.email = email;
        this.designation = designation;
    }

    public Employee(int no, String name, String email, String dpt, String designation) {
        this.emp_no = no;
        this.full_name = name;
        this.email = email;
        this.department = dpt;
        this.designation = designation;
    }

    // method
    public void showEmployeDetail() {
        System.out.println("Reg No: " + this.emp_no);
        System.out.println("Name: " + this.full_name);
        System.out.println("Email: " + this.email);
        System.out.println("Designation: " + this.designation);
        System.out.println("Department: " + this.department);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(12, "Himal", "himal@gmail.com", "Admin", "Manager");
        Employee emp2 = new Employee(13, "Rama", "Rama@gmail.com", "IT Department", "IT Manager");
        Employee emp3 = new Employee();
        Employee emp4 = new Employee("hiralal@gmail.com", "Manager");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
//        emp.showEmployeDetail();

        System.out.println("Name Before: " + emp1.full_name);
        emp1.full_name = "Rajesh Hamal";
        System.out.println("Name After: " + emp1.full_name);
        emp1.showEmployeDetail();
        emp2.showEmployeDetail();
        emp3.showEmployeDetail();
        emp4.showEmployeDetail();
    }
}
