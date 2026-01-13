// Demonstrate Parameterized Constructor
import javax.swing.*;

class Parameterized{
public 
    String first, last;
    int dd, mm, yyyy;

    public Parameterized(String first_name, String last_name, int d, int m, int y){
        first = first_name;
        last = last_name;
        dd = d;
        mm = m;
        yyyy = y;
    }
    public void Display(){
        System.out.println("\n--User Data--");
        System.out.println("First Name: " + first);
        System.out.println("Last Name: " + last);
        System.out.println("DoB: " + dd + "-" + mm + "-" + yyyy);
    }
}

public class Assignment29 {
    public static void main(String[] args) {
        String first = JOptionPane.showInputDialog("Enter first name: "); 
        String last = JOptionPane.showInputDialog("Enter last name: ");
        int dd = Integer.parseInt(JOptionPane.showInputDialog("Enter date: "));
        int mm = Integer.parseInt(JOptionPane.showInputDialog("Enter month: "));
        int yyyy = Integer.parseInt(JOptionPane.showInputDialog("Enter year: "));
        
        Parameterized obj1 = new Parameterized(first, last, dd, mm, yyyy);
        obj1.Display();
    }
}
