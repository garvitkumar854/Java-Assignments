// Demonstrate the use of sleep() method in Thread class.
class Assignment47 extends Thread {
    public static void main(String[] args) throws Exception{
        for(int i=0; i<5; i++){
            System.out.println("Hello World");
            Assignment47 obj = new Assignment47();
            obj.start();
            Thread.sleep(5000);
        }
    }
}
