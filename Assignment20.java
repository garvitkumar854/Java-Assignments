import javax.swing.*;

class Assignment20 {
    public static void main(String[] args) {
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter array size: "));
        int arr[] = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter value at index " + i + " : "));
            sum += arr[i];
        }

        System.out.println("\nSum of elements = " + sum);
    }
}