// WAP to declare multiple methods in interface
interface MyInterface {

    void show();

    void display();
}

class Demo implements MyInterface {

    public void show() {
        System.out.println("Show Method");
    }

    public void display() {
        System.out.println("Display Method");
    }
}

public class Assignment38 {
    public static void main(String[] args) {

        Demo d = new Demo();
        d.show();
        d.display();
    }
}
