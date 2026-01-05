// User input - CUI Based.
import java.util.Scanner;

class Assignment04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Percentage: ");
        float percentage = sc.nextFloat();

        System.out.println("\n--User Details--");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);
    }
}