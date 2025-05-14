package mouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseMotionEventExample extends JFrame implements MouseMotionListener {
    JLabel lbl_result;
    public MouseMotionEventExample(){
        setTitle("MouseMotion Event Example");
        setBounds(10, 20, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        lbl_result = new JLabel();
        add(lbl_result);
        setVisible(true);
        addMouseMotionListener(this);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        lbl_result.setText("Mouse Dragged - Value of X: " + e.getX() +
                " Value of Y: " + e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        lbl_result.setText("Mouse Moved - Value of X: " + e.getX() + 
                " Value of Y: " + e.getY());
    }
    public static void main(String args[]){
        new MouseMotionEventExample();
    }
    
}
