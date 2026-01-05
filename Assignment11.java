import javax.swing.*;

class Assignment11 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number: ");
        int num = Integer.parseInt(input);

        String result = "Table of " + num + ":\n";

        for (int i = 1; i <= 10; i++) {
            result += num + " x " + i + " = " + (num * i) + "\n";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}
