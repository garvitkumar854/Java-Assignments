// WAP to Calculate sum of Diagonals in 2D-Array.
import javax.swing.*;

class Assignment23 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter size of square matrix:"));

        int[][] arr = new int[n][n];

        // Input elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter value at [" + i + "][" + j + "]:"));
            }
        }

        System.out.println("Matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][i]; // main diagonal
        }
        System.out.println("Sum of diagonal = " + sum);
    }
}