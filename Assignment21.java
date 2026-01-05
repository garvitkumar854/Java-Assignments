import javax.swing.*;

class Assignment21 {
    public static void main(String[] args) {
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter array size: "));

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter value at index " + i + " : "));
        }

        int key = Integer.parseInt(JOptionPane.showInputDialog("Enter element to search: "));
        boolean found = false;
        int position = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                found = true;
                position = i;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + key + " found at index " + position);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }
    }
}