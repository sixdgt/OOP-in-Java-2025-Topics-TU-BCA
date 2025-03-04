package main.constructor;

public class ConstructorOverloadingExample {
    // attributes of class
    public String full_name;
    public String username;
    public String role;
    public int reg_no;
    public boolean status;
    
    /** constructor overloading
     * defining multiple constructor with different
     * parameter inside same class
     */
    // 1. default constructor
    public ConstructorOverloadingExample(){
        this.full_name = "Rajesh Hamal";
        this.role = "manager";
        this.username = "rajesh";
        this.status = true;
        this.reg_no = 11;
    }
    // 2. constructor with single parameter
    // Note: here `param_username` is the parameter &
    // this.username is the class variable i.e class attribute
    public ConstructorOverloadingExample(String param_username){
        this.username = param_username;
        // here the data that param_username carries is assigned to username
    }
    // 3. constructor with multiple parameter
    public ConstructorOverloadingExample(String full_name, String role){
        this.full_name = full_name;
        this.role = role;
        // Note: here this.full_name refers to class variable whereas
        // full_name is local variable and data that full_name holds is
        // assigned to class variable full_name which is referenced using
        // `this` keyword
    }
}
