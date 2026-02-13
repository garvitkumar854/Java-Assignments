// Demonstrate Multithreading using Runnable Class
class Assignment46 implements Runnable {
    public void run(){
        System.out.println("Hello World");
    }
    public static void main(String[] args){
        Assignment46 obj = new Assignment46();
        Thread th = new Thread(obj);
        th.start();
    }
}