// Demonstrate String Methods concat(), endsWith(), equals(), indexOf().
public class Assignment53 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Using concat() to concatenate two strings
        String str3 = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + str3);

        // Using endsWith() to check if the string ends with a specific suffix
        boolean endsWithWorld = str3.endsWith("World");
        System.out.println("Does the string end with 'World'? " + endsWithWorld);

        // Using equals() to compare two strings
        boolean isEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + isEqual);

        // Using indexOf() to find the index of a character or substring
        int indexOfO = str3.indexOf('o');
        System.out.println("Index of 'o' in the concatenated string: " + indexOfO);
    }
}