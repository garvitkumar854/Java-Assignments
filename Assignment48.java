// Demonstrate the use of setName() and getName() methods of Thread class
class Assignment48{
    public static void main(String[] args) {
        Thread.currentThread().setName("Main Thread");
        System.out.println("Current Thread: " + Thread.currentThread().getName());
    }
}