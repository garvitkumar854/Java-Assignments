// WAP to implementing interface & extending class.
class A {
    void showA() {
        System.out.println("From Class A");
    }
}

interface B {
    void showB();
}

class C extends A implements B {

    public void showB() {
        System.out.println("From Interface B");
    }
}

public class Assignment42 {
    public static void main(String[] args) {

        C obj = new C();

        obj.showA(); // from class A
        obj.showB(); // from interface B
    }
}
