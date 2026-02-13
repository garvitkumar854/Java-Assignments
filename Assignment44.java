// WAP to declare same name of variable in different interface.
interface A {
    int x = 10;
}

interface B {
    int x = 20;
}

class Demo implements A, B {

    void show() {
        System.out.println("Value of x from Interface A = " + A.x);
        System.out.println("Value of x from Interface B = " + B.x);
    }
}

public class Assignment44 {
    public static void main(String[] args) {

        Demo d = new Demo();
        d.show();
    }
}
