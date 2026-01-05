// WAP to Demonstrate 2D-Array (Method3).
import javax.swing.*;

class Assignment19 {
    public static void main(String[] args) {
        int row = Integer.parseInt(JOptionPane.showInputDialog("Enter row size: "));
        int col = Integer.parseInt(JOptionPane.showInputDialog("Enter column size: "));

        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of " + i + " " + j + " : "));
            }
        }

        System.out.println("Array is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
