// Demonstrate String Buffer Methods reverse(), length(), capacity().
public class Assignment56 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello World");
        System.out.println("Original String: " + str);
        
        // Reverse the string
        str.reverse();
        System.out.println("Reversed String: " + str);
        
        // Get the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // Get the capacity of the string buffer
        int capacity = str.capacity();
        System.out.println("Capacity of the string buffer: " + capacity);
    }
}
