package swingex;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextField nameField;
    private JTextField phoneField;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField rePasswordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Registration frame = new Registration();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Registration() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 960, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 30, 100, 14);
        contentPane.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(200, 30, 150, 20);
        contentPane.add(nameField);
        nameField.setColumns(10);

        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(50, 60, 100, 14);
        contentPane.add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(200, 60, 150, 20);
        contentPane.add(phoneField);
        phoneField.setColumns(10);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 90, 100, 14);
        contentPane.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(200, 90, 150, 20);
        contentPane.add(usernameField);
        usernameField.setColumns(10);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 120, 100, 14);
        contentPane.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(200, 120, 150, 20);
        contentPane.add(passwordField);

        JLabel rePasswordLabel = new JLabel("Re-enter Password:");
        rePasswordLabel.setBounds(50, 150, 130, 14);
        contentPane.add(rePasswordLabel);

        rePasswordField = new JPasswordField();
        rePasswordField.setBounds(200, 150, 150, 20);
        contentPane.add(rePasswordField);

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // handle register button action
            }
        });
        registerButton.setBounds(200, 190, 100, 23);
        contentPane.add(registerButton);

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                phoneField.setText("");
                usernameField.setText("");
                passwordField.setText("");
                rePasswordField.setText("");
            }
        });
        resetButton.setBounds(310, 190, 70, 23);
        contentPane.add(resetButton);
        setLocationRelativeTo(null);
    }
}
