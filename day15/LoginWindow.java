package day15;

import day13.BoxLayoutExample1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginWindow extends JFrame implements ActionListener {
    JLabel userLabel, passLabel, messageLabel;
    JTextField userText;
    JPasswordField passText;
    JButton loginButton;
    LoginWindow() {
        setTitle("Login Page");
        setLayout(new GridLayout(4, 2, 10, 10));
        userLabel = new JLabel("Username:");
        add(userLabel);
        userText = new JTextField();
        add(userText);
        passLabel = new JLabel("Password");
        add(passLabel);
        passText = new JPasswordField();
        add(passText);
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        add(new JLabel());
        add(loginButton);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed (ActionEvent e) {
        String username = userText.getText();
        String password = String.valueOf(passText.getPassword());
        if(username.equals("admin") && password.equals("1234")) {
            messageLabel.setText("Login Successful");
            messageLabel.setForeground(Color.GREEN);
            BoxLayoutExample1 b = new BoxLayoutExample1();
            b.setVisible(true);
            //this.setVisible(false);
        }
        else {
            messageLabel.setText("Invalid username or password!");
            messageLabel.setForeground(Color.RED);
        }
    }
    public static void main(String[] args) {
        new LoginWindow();
    }
}