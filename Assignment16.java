import javax.swing.*;

class Assignment16 {
    public static void main(String[] args) {
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter size of Array: "));
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter value of Index " + i + " : "));
        }

        System.out.println("Array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}