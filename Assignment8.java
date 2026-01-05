import javax.swing.*;

class Assignment8{
    public static void main(String[] args) {
        // Input 3 numbers using JOptionPane
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first Number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second Number: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter third Number: "));

        // Logic to find the maximum using nested if-else
        if (num1 > num3) {
            if (num1 > num2) {
                System.out.println("Max: " + num1);
            } else {
                System.out.println("Max: " + num2);
            }
        } else {
            System.out.println("Max: " + num3);
        }
    }
}
