// WAP to perform Basic Calculator Operations - switch.
import javax.swing.*;

class Assignment09 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));

        System.out.println("-- Choose an operator --");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int opt = Integer.parseInt(JOptionPane.showInputDialog("Enter choice: "));

        switch (opt) {
            case 1:
                System.out.println("Ans: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Ans: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Ans: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Ans: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
