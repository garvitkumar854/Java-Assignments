// Demonstrate String Creation and chatAt(), compareTo() and compareToIgnoreCase() methods
public class Assignment52{
    public static void main(String[] args){
        String str1 = new String("Hello");
        System.out.println("String is: " + str1);

        // Chat At
        System.out.println("Second Character of String: " + str1.charAt(1));

        // Compare To
        String str2 = new String("World");
        System.out.println(str1.compareTo(str2));

        // Compre To Ignore Case
        String str3 = new String("world");
        System.out.println(str2.compareToIgnoreCase(str3));
    }
}