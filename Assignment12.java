// WAP to check a Prime Number.
import javax.swing.*;

class Assignment12 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime Number!");
        } else {
            System.out.println("Not A Prime Number!");
        }
    }
}
