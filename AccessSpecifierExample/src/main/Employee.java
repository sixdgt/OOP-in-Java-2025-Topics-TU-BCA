package main;

public class Employee {
    // public attributes
    public String name;
    public String department;
    // protected attributes
    protected String gender;
    protected String designation;
    // private attributes
    private String email;
    private int contact;
    // default attributes
    int emp_no;
    
    // to store and access private attributes we make public getter and setter method
    // setter method takes argument
    // getter method returns value
    public void setEmail(String param_email){
        this.email = param_email;
    }
    public String getEmail(){
        return this.email;
    }
    
    public void setContact(int param_contact){
        this.contact = param_contact;
    }
    public int getContact(){
        return this.contact;
    }
    public void showDetails(){
        System.out.println("Employee No: " + this.emp_no);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Gender: " + this.gender);
        System.out.println("Designation: " + this.designation);
        System.out.println("Email: " + this.email);
        System.out.println("Contact: " + this.contact);
    }
}
