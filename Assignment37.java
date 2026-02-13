// WAP to declare single method in interface.
interface MyInterface {
    void show();
}

class Demo implements MyInterface {

    public void show() {
        System.out.println("This is single method interface");
    }
}

public class Assignment37 {
    public static void main(String[] args) {

        Demo d = new Demo();
        d.show();
    }
}
