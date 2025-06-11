package model;

import config.DbConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
    private String name;
    private String email;
    private String designation;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setDesignation(String designation){
        this.designation = designation;
    }
    public String getDesignation(){
        return this.designation;
    }
    // business logic
    public boolean createEmployee(Employee e){
        boolean status = false;
        try{
            Connection connect = DbConnection.getInstance().getConnection();
            Statement stmt = connect.createStatement();
            String query = "INSERT INTO employee(name, email, designation) VALUES("
                    + "'"+e.getName()+"', '"+e.getEmail()+"','"+e.getDesignation() +"')";
            if(stmt.executeUpdate(query) > 0){
                status = true;
            }
        } catch(SQLException error){
            System.out.println("Error: " + error.getMessage());
        }
        return status;
    }
}
