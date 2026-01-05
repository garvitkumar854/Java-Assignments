import javax.swing.*;

class Assignment22 {
    public static void main(String[] args) {
        int row = Integer.parseInt(JOptionPane.showInputDialog("Enter number of rows:"));
        int col = Integer.parseInt(JOptionPane.showInputDialog("Enter number of columns:"));

        int[][] arr = new int[row][col];

        // Input elements
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter value at [" + i + "][" + j + "]:"));
            }
        }
        System.out.println("Array is:");
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println(" | Sum of row " + i + " = " + sum);
        }
    }
}