// WAP to create a jaaged array of 6, 7, 8 and calculate the sum of each row
import javax.swing.*;

class Assignment26 {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[5];
        arr[2] = new int[6];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer
                        .parseInt(JOptionPane.showInputDialog("Enter value of row " + i + " column " + j + " : "));
            }
        }

        System.out.println("Array is: ");
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.print(" | Sum of row = " + sum);
            System.out.println();
        }
    }
}