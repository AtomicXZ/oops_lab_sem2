class Counter {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
        System.out.println("Count incremented: " + count);
    }
}

class MyTh extends Thread {
    private Counter counter;
    
    public MyTh(Counter counter) {
        this.counter = counter;
    }
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            counter.increment();
        }
    }
}

public class SyncExample {
    public static void main(String[] args) {
        Counter counter = new Counter();
        
        Thread thread1 = new MyTh(counter);
        Thread thread2 = new MyTh(counter);
        
        thread1.start();
        thread2.start();
    }
}
