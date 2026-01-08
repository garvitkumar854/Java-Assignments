// WAP to create jagged array of 3, 5, 7 and calculate the prime number in each row

import javax.swing.*;

class Assignment27{
    public static void main(String[] args) {
        
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[3];
        arr[2] = new int[3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter value of row " + i + " column " + j + " : "));
            }
        }

        System.out.println("Array is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int i=0; i<3; i++){
            System.out.print("Prime Numbers in Row " + i + " : ");
            for(int j=0; j<arr[i].length; j++){
                int num = arr[i][j], count=0;
                for(int k=1; k<=num; k++){
                    if(num % k == 0){
                        count++;
                    }
                }
                if(count == 2){
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
}