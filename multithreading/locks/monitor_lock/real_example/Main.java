package multithreading.locks.monitor_lock.real_example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method start");
        SharedResource sharedResource= new SharedResource();
        // producer thread
        Thread producerThread = new Thread(new ProducerTask(sharedResource));
        // consumer thread
        Thread consumerThread = new Thread(new ConsumerTask(sharedResource));

        // thread is in runnable state
        producerThread.start();
        consumerThread.start();
        System.out.println("Main method end");
    }
}


/*
Main method start
Main method end
Consumer Thread: Thread-1
Producer Thread: Thread-0
ConsumeItem method invoked by: Thread-1
Thread Thread-1 is waiting now
Item added by: Thread-0 and invoking all threads which are waiting
*/