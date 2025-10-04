package day13;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class RadioButton implements ItemListener {
    final JFrame frame = new JFrame("JRadioButton Demo");
    //implement ItemListener interface
    public void itemStateChanged(ItemEvent ev) {
        boolean selected = (ev.getStateChange() == ItemEvent.SELECTED);
        AbstractButton button = (AbstractButton) ev.getItemSelectable();
        String command = button.getActionCommand();
        String state;
        if (selected) 
            state = "selected";
        
        else 
            state = "unselected";
        
        String message;
        if (command.equals("Java")) 
            message = "The Java option has been " + state;
        
        else if (command.equals("ASP")) 
            message = "The ASP.Net option has been " + state;
        
        else 
            message = "The SQL option has been " + state;
        
        //show dialogue
        JOptionPane.showMessageDialog(frame, message);
    }
    public static void main(String[] args) {
        JRadioButton rdbJava = new JRadioButton("Java");
        rdbJava.setActionCommand("Java");
        JRadioButton rdbASP = new JRadioButton("ASP");
        rdbASP.setActionCommand("ASP");
        JRadioButton rdbSQL = new JRadioButton("SQL");
        rdbSQL.setActionCommand("SQL");
        
        //add event handler
        RadioButton r = new RadioButton();
        rdbJava.addItemListener(r);
        rdbASP.addItemListener(r);
        rdbSQL.addItemListener(r);
        
        //add radiobuttons to a button group
        final ButtonGroup group = new ButtonGroup();
        group.add(rdbJava);
        group.add(rdbASP);
        group.add(rdbSQL);
        
        //frame setting 
        r.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.frame.setSize(300, 200);
        Container cont = r.frame.getContentPane();

        cont.setLayout(new GridLayout(0, 1));
        cont.add(new JLabel("Please choose your favourite language: "));
        cont.add(rdbJava);
        cont.add(rdbASP);
        cont.add(rdbSQL);
        r.frame.setVisible(true);
    }
}
