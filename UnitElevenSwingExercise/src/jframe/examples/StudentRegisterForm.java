package jframe.examples;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
public class StudentRegisterForm {
    // constructor
    public StudentRegisterForm(){
        // creating JFrame object
        JFrame frame = new JFrame();
        // title
        frame.setTitle("Student Register Form");
        // size
        frame.setBounds(50, 100, 500, 600);
        // to stop program using cross icon
        // 0 -> DO nothing
        // 1 -> Dispose or Hide
        // 2 -> Exit on close
        frame.setDefaultCloseOperation(2);
        // creating component
        JLabel content_title = new JLabel();
        content_title.setText("This is JFrame Demo");
        content_title.setBounds(20, 30, 400, 20);
        // text field
        JTextField input_title = new JTextField();
        input_title.setBounds(20, 150, 400, 20);
        // by default textfield give String value
        // so if we need numeric value then we need to type caste it
        // 1. method one: directly primitive
        // int num = (int) input_title.getText();
        // 2. method two: to object
        int num = Integer.parseInt(input_title.getText());
        
        // adding component to frame
        frame.add(content_title);
        frame.add(input_title);
        frame.setVisible(true);
    }
    public static void main(String args[]){
        // method one: StudentRegisterForm srf = new StudentRegisterForm();
        // method two: new StudentRegisterForm();
        new StudentRegisterForm();
        // method three: using swing utilities
//        SwingUtilities.invokeLater(new Runnable(){
//            @Override
//            public void run(){
//                new StudentRegisterForm();
//            }
//        });
    }
}
