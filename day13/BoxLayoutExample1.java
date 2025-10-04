package day13;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutExample1 extends JFrame {
    JButton buttons[];
    public BoxLayoutExample1() {
        buttons = new JButton[5];
        for (int i=0; i<5; i++) {
            buttons[i] = new JButton("Button " + (i+1));
            add(buttons[i]);
        }
        //set BoxLayout (Y_AXIS = vertical)
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        //close properly when window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new BoxLayoutExample1();
    }
}
