package swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {

    private JLabel passwordLabel;
    private JTextField userText;
    private JPasswordField passwordText;
    private JButton loginButton, resetButton, registerButton;

    public Login() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 960, 600);
        setResizable(false);
        getContentPane().setLayout(null);

        userText = new JTextField();
        userText.setBounds(675, 204, 204, 32);
        getContentPane().add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(297, 90, 393, 88);
        getContentPane().add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(673, 288, 206, 32);
        getContentPane().add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(675, 359, 77, 23);
        getContentPane().add(loginButton);
        loginButton.addActionListener(this);

        resetButton = new JButton("Reset");
        resetButton.setBounds(802, 359, 77, 23);
        getContentPane().add(resetButton);
        resetButton.addActionListener(this);

        registerButton = new JButton("Register!");
        registerButton.setBounds(789, 443, 90, 23);
        getContentPane().add(registerButton);
        
        JLabel lblNewLabel = new JLabel("Background");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\udayb\\eclipse-workspace\\MiniProjectJava\\Resources\\Background.png"));
        lblNewLabel.setBounds(0, 11, 960, 550);
        getContentPane().add(lblNewLabel);
        registerButton.addActionListener(this);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            // handle login button action
        } else if (e.getSource() == resetButton) {
            // handle reset button action
            userText.setText("");
            passwordText.setText("");
        } else if (e.getSource() == registerButton) {
            // handle register button action
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
