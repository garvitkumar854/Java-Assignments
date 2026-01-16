// Demonstrate Multilevel Inheritance
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

class CollegeStudent extends Student {
    void showCollegeStudent() {
        System.out.println("I'm College Student");
    }
}

class Assignment32 {
    public static void main(String[] args) {

        CollegeStudent cs = new CollegeStudent();
        cs.showPerson();         // from Person
        cs.showStudent();        // from Student
        cs.showCollegeStudent(); // from CollegeStudent
    }
}
