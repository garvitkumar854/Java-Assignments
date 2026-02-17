// Demonstrate try & catch blocks in java.
public class Assignment50 {
    public static void main(String[] args) {
        int a = 1045;
        int ans = 0;
        try {
            ans = a / 0;
        } catch (Exception e) {
            System.out.println("Cannot divide by zero: ");
        }
    }
}
