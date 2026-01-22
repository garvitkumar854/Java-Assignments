// Demonstrate Interface's in Java.
interface I {
    int value = 56;
    void showValue();
}

class Display implements I {
    public void showValue() {
        System.out.println("Value is: " + value);
    }
}

class Assignment34 {
    public static void main(String[] args) {
        Display d = new Display();
        d.showValue();
    }
}