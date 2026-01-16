// Demonstrate Single Inheritance 
class Person {
    void showPerson() {
        System.out.println("I'm Person");
    }
}

class Student extends Person {
    void showStudent() {
        System.out.println("I'm Student");
    }
}

public class Assignment31 {
    public static void main(String[] args) {
        Student s = new Student();
        s.showPerson();
        s.showStudent();
    }
}