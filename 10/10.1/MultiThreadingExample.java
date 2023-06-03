class Th extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class MultiThreadingExample {
    public static void main(String[] args) {
        Thread t1 = new Th();
        Thread t2 = new Th();
        
        t1.start();
        t2.start();
    }
}
