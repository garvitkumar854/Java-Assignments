// Demonstrate Constructor Overloading
class Over {
    public Number ans;

    public Over(int a, int b) {
        ans = a + b;
    }

    public Over(int a, int b, int c) {
        ans = a + b + c;
    }

    public Over(double a, int b) {
        ans = a + b;
    }

    public void display() {
        System.out.println("Ans: " + ans);
    }
}

class Assignment30 {
    public static void main(String[] args) {
        Over obj1 = new Over(148, 48);
        Over obj2 = new Over(3.14, 544);
        Over obj3 = new Over(45, 595, 74);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
