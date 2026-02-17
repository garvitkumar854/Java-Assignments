// WAP to display the name and priority of the current thread.
public class Assignment51 extends Thread {
    public void run() {
        System.out.println("\nThread Name: " + Thread.currentThread().getName());
        System.out.println("Priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        System.out.println("Main Thread: " + Thread.currentThread().getName());
        System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());

        Assignment51 t1 = new Assignment51();
        t1.start();
    }
}
