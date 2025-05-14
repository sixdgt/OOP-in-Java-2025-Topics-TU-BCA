package key;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyEventExample extends JFrame implements KeyListener{
    JTextField txt_message;
    JLabel lbl_message, lbl_result;
    public KeyEventExample(){
        setTitle("Key Event Example");
        setBounds(50, 100, 500, 600);
        setLayout(new GridLayout(3, 1, 10, 15));
        lbl_message = new JLabel("Enter Message: ");
        lbl_result = new JLabel();
        txt_message = new JTextField();
        txt_message.addKeyListener(this);
        
        add(lbl_message);
        add(txt_message);
        add(lbl_result);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        lbl_result.setText(txt_message.getText());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed: " + e.getKeyChar());
        System.out.println("Key Location: " + e.getKeyLocation());
        System.out.println("Key Code: " + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key released: " + e.getKeyChar());
        System.out.println("Key Location: " + e.getKeyLocation());
        System.out.println("Key Code: " + e.getKeyCode());
    }
    
    public static void main(String args[]){
        new KeyEventExample();
    }
}
