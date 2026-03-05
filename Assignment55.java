// Demonstrate String Buffer Methods insert(), replace(), delete().
public class Assignment55 {
    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer("Hello World!");

        // Using insert() method to insert a string at a specific index
        strBuffer.insert(6, "Java ");
        System.out.println("After insert: " + strBuffer);

        // Using replace() method to replace a substring with another string
        strBuffer.replace(6, 11, "Programming");
        System.out.println("After replace: " + strBuffer);

        // Using delete() method to delete a substring from the StringBuffer
        strBuffer.delete(0, 5);
        System.out.println("After delete: " + strBuffer);
    }
}
