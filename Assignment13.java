// WAP to find Factorial of Number.
import javax.swing.*;

class Assignment13 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter any Number: "));
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial is: " + fact);
    }
}
