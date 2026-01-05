import javax.swing.*;

class Assignment24 {
    public static void main(String[] args) {
        int row = Integer.parseInt(JOptionPane.showInputDialog("Enter number of rows:"));
        int col = Integer.parseInt(JOptionPane.showInputDialog("Enter number of columns:"));
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter value at [" + i + "][" + j + "]:"));
            }
        }

        System.out.println("Original Array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose
        System.out.println("Transpose Array:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}