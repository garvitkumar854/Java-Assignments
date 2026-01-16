// Demonstrate Hierarchical Inheritance
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

class Teacher extends Person {
    void showTeacher() {
        System.out.println("I'm Teacher");
    }
}

class Assignment33 {
    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();

        s.showPerson();
        s.showStudent();

        t.showPerson();
        t.showTeacher();
    }
}
