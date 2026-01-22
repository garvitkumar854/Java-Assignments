// Demonstrate Hybrid Inheritance
interface A {
    void showA();
}

interface B extends A {
    void showB();
}

class C {
    void showC() {
        System.out.println("From Class C");
    }
}

class D extends C implements B {

    public void showA() {
        System.out.println("From Interface A");
    }

    public void showB() {
        System.out.println("From Interface B");
    }
}

public class Assignment36 {
    public static void main(String[] args) {

        D obj = new D();

        obj.showA();
        obj.showB();
        obj.showC();
    }
}
