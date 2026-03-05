// Demonstrate String Methods replace(), startsWith(), toUpperCase(), toLowerCase().
public class Assignment54 {
    public static void main(String[] args) {
        String str = "Hello World!";

        // Using replace() method
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);

        // Using startsWith() method
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);

        // Using toUpperCase() method
        String upperCaseStr = str.toUpperCase();
        System.out.println("Upper Case String: " + upperCaseStr);

        // Using toLowerCase() method
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lower Case String: " + lowerCaseStr);
    }
}
