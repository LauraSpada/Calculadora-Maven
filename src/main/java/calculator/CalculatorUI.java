package calculator;

import javax.swing.*; 
import java.awt.*; 
//import java.awt.event.ActionListener;

public class CalculatorUI extends JFrame { 
    private Calculator calculator = new Calculator(); 
    private JTextField input1 = new JTextField(5); 
    private JTextField input2 = new JTextField(5);  
    private JLabel result = new JLabel("Result:");

    public CalculatorUI() {
        setTitle("Calculator");
        setSize(600, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLayout(new FlowLayout()); 
        
        JButton addButton = new JButton("Add");
        JButton subButton = new JButton("Subtract");
        JButton mulButton = new JButton("Multiply");
        JButton divButton = new JButton("Divide");

        add(new JLabel("Number 1:"));
        add(input1);
        add(new JLabel("Number 2:"));
        add(input2);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(result);

        addButton.addActionListener(e -> calculate("add"));
        subButton.addActionListener(e -> calculate("sub"));
        mulButton.addActionListener(e -> calculate("mul"));
        divButton.addActionListener(e -> calculate("div"));
    }

    private void calculate(String op) {
        try {
            int a = Integer.parseInt(input1.getText());
            int b = Integer.parseInt(input2.getText());
            double res = 0;
            switch (op) {
                case "add": res = calculator.add(a, b); break;
                case "sub": res = calculator.subtract(a, b); break;
                case "mul": res = calculator.multiply(a, b); break;
                case "div": res = calculator.divide(a, b); break;
            }
            result.setText("Result: " + res);
        } catch (Exception ex) {
            result.setText("Error: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorUI().setVisible(true));
    }
}
