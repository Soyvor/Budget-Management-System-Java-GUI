package swingex;

import javax.swing.*;
import java.awt.*;

public class CashIn extends JFrame {
    
    public CashIn() {
        // Set JFrame title
        setTitle("Cash Out");
        
        // Create and add components to JPanel
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
        
        // Add "Remark" label and text input field
        JLabel remarkLabel = new JLabel("Remark: ");
        JTextField remarkField = new JTextField(20);
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(remarkLabel, constraints);
        constraints.gridx = 1;
        panel.add(remarkField, constraints);
        
        // Add "Description" label and text input field
        JLabel descriptionLabel = new JLabel("Description: ");
        JTextField descriptionField = new JTextField(20);
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(descriptionLabel, constraints);
        constraints.gridx = 1;
        panel.add(descriptionField, constraints);
        
        // Add "Amount" label and number input field
        JLabel amountLabel = new JLabel("Amount: ");
        JFormattedTextField amountField = new JFormattedTextField(java.text.NumberFormat.getIntegerInstance());
        amountField.setColumns(10);
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(amountLabel, constraints);
        constraints.gridx = 1;
        panel.add(amountField, constraints);
        
        // Add JPanel to JFrame
        getContentPane().add(panel);
        
        // Set JFrame size and make it visible
        setSize(400, 200);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        CashOutPage frame = new CashOutPage();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
