package action;
import java.awt.GridLayout;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionEventExample extends JFrame implements ActionListener{
    JButton btn_result, btn_reset;
    JTextField txt_num_one, txt_num_two;
    public ActionEventExample(){
        setTitle("Action Event Example");
        setBounds(50, 100, 500, 600);
        setLayout(new GridLayout(3, 2, 10, 15));
        // components
        JLabel lbl_num_one = new JLabel("Number One: ");
        JLabel lbl_num_two = new JLabel("Number Two: ");
        txt_num_one = new JTextField();
        txt_num_two = new JTextField();
        btn_result = new JButton("Output");
        btn_reset = new JButton("Reset");
        // adding action listener to button
        btn_result.addActionListener(this);
        btn_reset.addActionListener(this);
        // adding component
        add(lbl_num_one);
        add(txt_num_one);
        add(lbl_num_two);
        add(txt_num_two);
        add(btn_result);
        add(btn_reset);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn_result){
            System.out.println("Result");
            System.out.println("Number One Value: " + txt_num_one.getText());
            System.out.println("Number Two Value: " + txt_num_two.getText());
            try{
                int num_one = Integer.parseInt(txt_num_one.getText());
                int num_two = Integer.parseInt(txt_num_two.getText());
                System.out.println("Sum of two number: " + (num_one + num_two));
                JOptionPane.showMessageDialog(rootPane,
                        "Sum of two number: " + (num_one + num_two));
            } catch(NumberFormatException error){
                // will show message dialog
                JOptionPane.showMessageDialog(rootPane, "Please enter numeric value");
            }
            
        } else if (e.getSource() == btn_reset){
            System.out.println("Reset");
            txt_num_one.setText("");
            txt_num_two.setText("");
        }
    }
    
    public static void main(String args[]){
        new ActionEventExample();
    }
    
}
