// WAP to check Vowel Case in a String.
import javax.swing.*;

class Assignment10 {
    public static void main(String[] args) {
        // Taking string input from the user
        String str = JOptionPane.showInputDialog("Enter a string: ");
        
        // Extracting the first character
        char ch = str.charAt(0);
        
        // if-else ladder to check for vowels
        if (ch == 'a' || ch == 'A') {
            System.out.println("First letter is a vowel (a/A): " + str);
        } else if (ch == 'e' || ch == 'E') {
            System.out.println("First letter is an vowel (e/E): " + str);
        } else if (ch == 'i' || ch == 'I') {
            System.out.println("First letter is an vowel (i/I): " + str);
        } else if (ch == 'o' || ch == 'O') {
            System.out.println("First letter is an vowel (o/O): " + str);
        } else if (ch == 'u' || ch == 'U') {
            System.out.println("First letter is an vowel (u/U): " + str);
        } else {
            System.out.println("First letter is not an vowel: " + str);
        }
    }
}
