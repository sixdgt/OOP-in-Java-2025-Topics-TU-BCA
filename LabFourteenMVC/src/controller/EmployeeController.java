package controller;
import java.util.HashMap;
import model.Employee;

public class EmployeeController {
    public boolean addEmployee(HashMap<String, String> data){
        boolean status = false;
        Employee e = new Employee();
        e.setName(data.get("name"));
        e.setEmail("email");
        e.setDesignation("designation");
        if(e.createEmployee(e)){
            status = true;
        }
        return status;
    }
}
