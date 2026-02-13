// Demonstrate the use of Thread class by creating a thread and printing the name of the thread and a message.
class Assignment49 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=0; i<3; i++){
            System.out.println("Count " + i);
        }
    }
    public static void main(String[] args){
        System.out.print(Thread.currentThread().getName());
        System.out.println("Thread");
        Assignment49 obj = new Assignment49();
        obj.start();
    }
}