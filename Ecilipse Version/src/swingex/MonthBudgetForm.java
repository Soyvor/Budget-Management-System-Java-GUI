package swingex;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MonthBudgetForm extends JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel titleLabel;
    private JTable dataTable;
    private DefaultTableModel tableModel;
    private JTextField totalInField, totalOutField, budgetField;
    private JButton cashInButton, cashOutButton;
    
    public MonthBudgetForm() {
        
        // Set up the JFrame
        setTitle("Month Budget");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 960, 600);
        
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        // Create the title label and add it to the top of the JFrame
        titleLabel = new JLabel("Month Name");
        titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        titleLabel.setBounds(0, 0, 944, 48);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        getContentPane().add(titleLabel);
        
        // Create the data table and add it to the center of the JFrame
        dataTable = new JTable();
        tableModel = new DefaultTableModel(new String[]{"Date", "Remark", "Category", "Cash In", "Cash Out"}, 0);
        dataTable.setModel(tableModel);
        JScrollPane scrollPane = new JScrollPane(dataTable);
        scrollPane.setBounds(32, 48, 878, 339);
        getContentPane().add(scrollPane);
        
        // Create the section showing the totals and budget at the bottom of the JFrame
        JPanel totalsPanel = new JPanel(new GridLayout(1, 3));
        totalsPanel.setBounds(0, 0, 0, 0);
        totalInField = new JTextField();
        totalOutField = new JTextField();
        budgetField = new JTextField();
        totalInField.setEditable(false);
        totalOutField.setEditable(false);
        budgetField.setEditable(false);
        totalsPanel.add(new JLabel("Total In: "));
        totalsPanel.add(totalInField);
        totalsPanel.add(new JLabel("Total Out: "));
        totalsPanel.add(totalOutField);
        totalsPanel.add(new JLabel("Budget: "));
        totalsPanel.add(budgetField);
        getContentPane().add(totalsPanel);
        
        JLabel lblNewLabel = new JLabel("Total In");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblNewLabel.setForeground(Color.GREEN);
        lblNewLabel.setBounds(32, 398, 100, 25);
        getContentPane().add(lblNewLabel);
        
        JLabel lblTotalOut = new JLabel("Total Out");
        lblTotalOut.setForeground(Color.RED);
        lblTotalOut.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblTotalOut.setBounds(30, 434, 100, 25);
        getContentPane().add(lblTotalOut);
        
        JButton btnMonthlyAnalysis = new JButton("Monthly Analysis");
        btnMonthlyAnalysis.setBounds(729, 427, 181, 50);
        getContentPane().add(btnMonthlyAnalysis);
        btnMonthlyAnalysis.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnMonthlyAnalysis.setBackground(UIManager.getColor("Button.light"));
        cashOutButton = new JButton("Cash Out");
        cashOutButton.setBounds(539, 495, 148, 38);
        getContentPane().add(cashOutButton);
        cashOutButton.setBackground(Color.RED);
        cashInButton = new JButton("Cash In");
        cashInButton.setBounds(279, 495, 148, 38);
        getContentPane().add(cashInButton);
        cashInButton.setBackground(Color.GREEN);
        
        JLabel lblBudget = new JLabel("Budget");
        lblBudget.setForeground(Color.BLACK);
        lblBudget.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblBudget.setBounds(32, 461, 100, 38);
        getContentPane().add(lblBudget);
        
        // Add listeners to the Cash In and Cash Out buttons
        cashInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Add code to handle cash in button click
            }
        });
        
        cashOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Add code to handle cash out button click
            }
        });
        
        // Display the JFrame
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MonthBudgetForm();
    }
}
