package swingcomponents;
// importing swing packages
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
// we are extending the JFrame here with our custom class
public class StudentRegistrationForm extends JFrame{
    // constructor
    public StudentRegistrationForm(){
        setTitle("Student Registration Form"); // title of JFrame
        // 1st param: x-axis, 2nd param: y-axis, 3rd param: width &
        // 4th param: height
        setBounds(50, 50, 500, 700); // cordinates & size of JFrame
        // layout of JFrame
        // method one: by creating Layout Manager object
        // GridLayout(int rows, int cols, int hgap, int vgap);
        GridLayout gl = new GridLayout(7, 2, 10, 15);
        setLayout(gl);
        
        // creating components
        // JLabel
        JLabel lbl_first_name = new JLabel();
        lbl_first_name.setText("First Name:");
        lbl_first_name.setForeground(Color.red);
        JLabel lbl_last_name = new JLabel();
        lbl_last_name.setText("Last Name:");
        lbl_last_name.setForeground(new Color(204, 96, 195)); // RGB
        JLabel lbl_email = new JLabel();
        lbl_email.setText("Email:");
        
        JLabel lbl_address = new JLabel();
        lbl_address.setText("Address:");
        JLabel lbl_dob = new JLabel();
        lbl_dob.setText("Date of Birth: ");
        JLabel lbl_gender = new JLabel();
        lbl_gender.setText("Gender:");
        
        // JTextField
        JTextField txt_first_name = new JTextField();
        //txt_first_name.setForeground(Color.red);
        JTextField txt_last_name = new JTextField();
        JTextField txt_email = new JTextField();
        JTextField txt_address = new JTextField();
        JTextField txt_dob = new JTextField();
        JTextField txt_gender = new JTextField();
        
        // JButton
        JButton reset = new JButton();
        reset.setText("RESET");
        reset.setForeground(Color.white); // font color
        reset.setBackground(Color.red); // background color
        reset.setSize(200, 50);
        
        JButton submit = new JButton();
        submit.setText("SUBMIT");
        submit.setForeground(Color.white);
        submit.setBackground(Color.blue);
        submit.setSize(200, 50);
        
        // adding components into JFrame
        add(lbl_first_name);
        add(txt_first_name);
        add(lbl_last_name);
        add(txt_last_name);
        add(lbl_email);
        add(txt_email);
        add(lbl_address);
        add(txt_address);
        add(lbl_dob);
        add(txt_dob);
        add(lbl_gender);
        add(txt_gender);
        add(reset);
        add(submit);
        // displaying JFrame
        setVisible(true);
        // DefaultCloseOperation: EXIT_ON_CLOSE will close the JFrame
        // and stop the program
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
    
    // main method
    public static void main(String args[]){
        new StudentRegistrationForm();
    }
}
