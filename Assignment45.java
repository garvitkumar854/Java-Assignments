// Demonstrate Multithreading using Extending Thread Class
class Assignment45 {
    public void run(){
        System.out.println("Hello World");
    }
    public static void main(String[] args){
        Assignment45 obj = new Assignment45();
        obj.start();
    }
}