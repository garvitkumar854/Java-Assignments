// Demonstrate Non Parameterized Constructor
class Default {
    public String first_name, last_name;
    int dd, mm, yyyy;

    public Default() {
        first_name = "John";
        last_name = "Doe";
        dd = 01;
        mm = 02;
        yyyy = 2026;
    }

    public void Display() {
        System.out.println("\n--User Data--");
        System.out.println("First Name: " + first_name);
        System.out.println("Last Name: " + last_name);
        System.out.println("DoB: " + dd + "-" + mm + "-" + yyyy);
    }
}

class Assignment28 {
    public static void main(String[] args) {
        Default obj1 = new Default();
        obj1.Display();
    }
}
