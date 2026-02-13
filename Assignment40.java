// WAP to show inheritance of interface.
interface A {
    void showA();
}

interface B extends A {
    void showB();
}

class Demo implements B {

    public void showA() {
        System.out.println("Method from Interface A");
    }

    public void showB() {
        System.out.println("Method from Interface B");
    }
}

public class Assignment40 {
    public static void main(String[] args) {

        Demo d = new Demo();
        d.showA();
        d.showB();
    }
}
