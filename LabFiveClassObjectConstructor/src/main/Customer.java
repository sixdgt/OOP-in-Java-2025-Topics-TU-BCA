package main;

public class Customer {
    // attributes/members of class `Customer`
    public String full_name;
    public String email;
    public String contact;
    public String gender;
    public String address;
    public String dob;
    
    // behavior/methods of class `Customer`
    public void displayCustomerInfo(){
        System.out.println("Name: " + this.full_name);
        System.out.println("Email: " + this.email);
        System.out.println("Contact: " + this.contact);
        System.out.println("Gender: " + this.gender);
        System.out.println("Address: " + this.address);
        System.out.println("Date of Birth: " + this.dob);
    }
    /**
     * This method check if the email is already available
     * in the system or not before registering the customer
     * @param param_email
     * @return 
     */
    public boolean checkAvailability(String param_email){
        boolean status = false;
        if(this.email == param_email){
            status = true;
        }
        return status;
    }
    
//    public boolean status(boolean check){
//        if(check){
//            return true;
//        }
//        return false;
//    }
}
