// WAP to declare variable in interface
interface MyInterface {
    int x = 10; // public static final by default
}

class Demo implements MyInterface {

    void show() {
        System.out.println("Value of x = " + x);
    }
}

public class Assignment43 {
    public static void main(String[] args) {

        Demo d = new Demo();
        d.show();
    }
}
