package day13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutExample1 extends JFrame implements ActionListener{
    CardLayout crd;
    //button variables to hold the references of buttons
    JButton btn1, btn2, btn3;
    Container cPane;

    //constructor of the classs
    CardLayoutExample1() {
        cPane = getContentPane();
        //default constructor used therefore components will cover the whole area
        crd = new CardLayout();
        cPane.setLayout(crd);
        //creating the buttons
        btn1 = new JButton("Apple");
        btn2 = new JButton("Boy");
        btn3 = new JButton("Cat");
        //adding listeners to it
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        cPane.add("a", btn1); // first card is the button btn1
        cPane.add("b", btn2);
        cPane.add("c", btn3);
    }
    public void actionPerformed(ActionEvent e) {
        //upon clicking the button, the next card of the container is shown 
        //after the last card again the first card is shown upon clicking 
        crd.next(cPane);
    }
    public static void main(String[] args) {
        CardLayoutExample1 crd1 = new CardLayoutExample1();

        crd1.setSize(400, 400);
        crd1.setVisible(true);
        crd1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
