package view;
import controller.EmployeeController;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class AddEmployee extends JFrame implements ActionListener{
    JButton btn_add;
    JTextField txt_name, txt_email, txt_designation;
    public AddEmployee(){
        setTitle("Add Employee");
        setLayout(new GridLayout(4, 2, 20, 15));
        setBounds(50, 100, 600, 500);
        
        JLabel lbl_name = new JLabel("Full Name: ");
        JLabel lbl_email = new JLabel("Email: ");
        JLabel lbl_designation = new JLabel("Designation: ");
        
        txt_name = new JTextField();
        txt_email = new JTextField();
        txt_designation = new JTextField();
        
        btn_add = new JButton("Add Employee");
        btn_add.addActionListener(this);
        
        add(lbl_name); add(txt_name);
        add(lbl_email); add(txt_email);
        add(lbl_designation); add(txt_designation);
        add(btn_add);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn_add){
            HashMap<String, String> data = new HashMap<>();
            data.put("name", txt_name.getText());
            data.put("email", txt_email.getText());
            data.put("designation", txt_designation.getText());
            if(data.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Enter required field");
            } else {
                EmployeeController ec = new EmployeeController();
                if(ec.addEmployee(data)){
                    JOptionPane.showMessageDialog(rootPane, "Added successfully!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Fail! Try again!!");
                }
            }
        }
    }
    
    public static void main(String args[]){
        new AddEmployee();
    }
}
