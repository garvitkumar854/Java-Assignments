// WAP to create multiple instance of same name of method in different interface.
interface A {
    void show();
}

interface B {
    void show();
}

class Demo implements A, B {

    public void show() {
        System.out.println("Same method implemented from both interfaces");
    }
}

public class Assignment41 {
    public static void main(String[] args) {

        Demo d = new Demo();
        d.show();
    }
}
