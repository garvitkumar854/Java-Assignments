// WAP to Input Two Number & Find Max.
import javax.swing.*;

class Assignment07 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first Number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second Number: "));

        // Checking for maximum number using if-else
        if (num1 > num2) {
            System.out.println("Max: " + num1);
        } else {
            System.out.println("Max: " + num2);
        }
    }
}
