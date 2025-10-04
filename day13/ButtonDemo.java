package day13;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonDemo extends JFrame {
    JButton yes,no,close;
    JLabel lbl;
    ButtonDemo(){
        yes = new JButton("YES");
        no = new JButton("No");
        close = new JButton("CLOSE");
        lbl = new JLabel("");

        setLayout(new GridLayout(4,1));
        setSize(400,200);
        add(yes);
        add(no);
        add(close);
        add(lbl);
        setVisible(true);

        //setdeafultcloseopeation(JFRame.EXITNOCLOSE)
        ButtonHandler bh = new ButtonHandler();
        
        yes.addActionListener(bh);
        no.addActionListener(bh);
        close.addActionListener(bh);
    }
    class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == yes) {
                lbl.setText("Button yes is pressed");
            }
            if (ae.getSource() == no) {
                lbl.setText("Button no is pressed");
            }
            if(ae.getSource() == close) {
                System.exit(0);
            }
        }
    }
    public static void main(String[] args) {
        new ButtonDemo();
    }
}