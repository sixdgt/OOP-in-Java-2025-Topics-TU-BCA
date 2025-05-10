package jframe.examples;
// importing important packages
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

// method one: inheriting JFrame
public class StudentForm extends JFrame{
    // constructor
    public StudentForm(){
        setTitle("Student Register Form");// set title
        // int x, int y, int width, int height
        setBounds(20, 30, 600, 500); // set resolution
        setBackground(Color.BLUE);// will set BG blue
        
        // properties of JLabel
        JLabel content_title = new JLabel();
        content_title.setText("Add Student Details");
        content_title.setBounds(20, 30, 300, 50);
        
        JLabel first_name = new JLabel();
        first_name.setText("First Name:");
        first_name.setBounds(20, 100, 300, 50);
        // to add component inside JFrame
        add(content_title);
        add(first_name);
        //setVisible(true); // can be calld inside constructor
    }
    
    public static void main(String args[]){
        // creating StudentForm object
        StudentForm sf = new StudentForm();
        sf.setVisible(true); // can be called via object
    }
}
