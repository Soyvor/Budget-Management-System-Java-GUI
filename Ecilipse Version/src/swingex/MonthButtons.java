package swingex;

import java.awt.*;
import javax.swing.*;

public class MonthButtons extends JFrame {
    
    public MonthButtons() {
        setTitle("Month Buttons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 960, 600);
        setResizable(false);
        
        JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        contentPane.setLayout(null);
        
        // create buttons for each month
        JButton janButton = new JButton("January");
        janButton.setBounds(51, 51, 203, 88);
        janButton.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(janButton);
        
        JButton febButton = new JButton("February");
        febButton.setBounds(264, 51, 203, 88);
        febButton.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(febButton);
        
        JButton marButton = new JButton("March");
        marButton.setBounds(477, 51, 203, 88);
        marButton.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(marButton);
        
        JButton aprButton = new JButton("April");
        aprButton.setBounds(690, 51, 203, 88);
        aprButton.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(aprButton);
        
        JButton mayButton = new JButton("May");
        mayButton.setBounds(51, 168, 203, 88);
        mayButton.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(mayButton);
        
        JButton junButton = new JButton("June");
        junButton.setBounds(264, 168, 203, 88);
        junButton.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(junButton);
        
        JButton julButton = new JButton("July");
        julButton.setBounds(477, 168, 203, 88);
        julButton.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(julButton);
        
        JButton augButton = new JButton("August");
        augButton.setBounds(690, 168, 203, 88);
        augButton.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(augButton);
        
        JButton sepButton = new JButton("September");
        sepButton.setBounds(51, 285, 203, 88);
        sepButton.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(sepButton);
        
        JButton octButton = new JButton("October");
        octButton.setBounds(264, 285, 203, 88);
        octButton.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(octButton);
        
        JButton novButton = new JButton("November");
        novButton.setBounds(477, 285, 203, 88);
        novButton.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(novButton);
        
        JButton decButton = new JButton("December");
        decButton.setBounds(690, 285, 203, 88);
        decButton.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(decButton);
        
        // create Annual Expenditure button
        JButton annualButton = new JButton("Annual Expenditure");
        annualButton.setBounds(51, 484, 203, 47);
        annualButton.setFont(new Font("Arial", Font.PLAIN, 20));
        annualButton.setBackground(new Color(255, 182, 193));
        contentPane.add(annualButton);
        
        setContentPane(contentPane);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MonthButtons();
    }
}
