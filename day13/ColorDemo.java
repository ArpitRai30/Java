package day13;

import java.awt.*;
import java.awt.event.*;

public class ColorDemo extends Frame {
    Label lbl1, lbl2, lbl3, lbl4, lbl5;
    public ColorDemo() {
        // Set layout first
        setLayout(new FlowLayout());
        setBackground(Color.gray);
        
        // Create and configure labels with correct color assignments
        lbl1 = new Label("All the Best");
        lbl1.setForeground(Color.red);
        add(lbl1);
        
        lbl2 = new Label("All the Best");
        lbl2.setForeground(Color.magenta);  // Fixed: was lbl1.setForeground
        add(lbl2);
        
        lbl3 = new Label("All the Best");
        lbl3.setForeground(Color.blue);     // Fixed: was lbl1.setForeground
        add(lbl3);
        
        lbl4 = new Label("All the Best");
        lbl4.setForeground(Color.green);    // Fixed: was lbl1.setForeground
        add(lbl4);
        
        lbl5 = new Label("All the Best");
        lbl5.setForeground(Color.cyan);     // Fixed: was lbl1.setForeground
        add(lbl5);
        
        setSize(400, 300);
        setVisible(true);

        //add window listener to close the program
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    
    public void paint(Graphics g) {
        g.setColor(Color.magenta);
        g.drawString("All the Best", 100, 100);
        g.setColor(Color.cyan);
        g.drawString("All the Best", 150, 150);
        g.setColor(Color.red);
        g.drawString("All the Best", 200, 200);
        g.setColor(Color.black);
        g.drawString("All the Best", 250, 250);
        g.setColor(Color.magenta);
    }
    
    public static void main(String[] args) {
        new ColorDemo();
    }
}
