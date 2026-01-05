import javax.swing.*;

class Assignment06 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first Number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second Number: "));
        int ans = num1 + num2;
        System.out.println("Sum is: " + ans);
    }
}
