package capitulo2;

import javax.swing.JOptionPane;

// Figure 2.7: ModifiedAddition.java
// Program that inputs two numbers, then displays their sum.

public class ModifiedAddition {
    public static void main(String[] args) {
        // ask user to enter the first number
        String number1 = JOptionPane.showInputDialog("Enter the first number");

        // ask user to enter the second number
        String number2 = JOptionPane.showInputDialog("Enter the second number");

        // create the message with the sum
        String soma = String.format("The sum of %s and %s is %d",
                number1, number2, Integer.parseInt(number1) + Integer.parseInt(number2));

        // display the message
        JOptionPane.showMessageDialog(null, soma);
    }
}

