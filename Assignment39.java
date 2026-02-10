// WAP to declare multiple interfaces
interface A {
    void showA();
}

interface B {
    void showB();
}

class Demo implements A, B {

    public void showA() {
        System.out.println("Method from Interface A");
    }

    public void showB() {
        System.out.println("Method from Interface B");
    }
}

public class Assignment39 {
    public static void main(String[] args) {

        Demo d = new Demo();
        d.showA();
        d.showB();
    }
}
