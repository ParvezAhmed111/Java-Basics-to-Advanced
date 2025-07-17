package multithreading.locks.monitor_lock.real_example;

public class MainOptimised {
    public static void main(String[] args) {
        System.out.println("Main method start");
        SharedResource sharedResource= new SharedResource();
        // creating producer thread using lambda expression
        Thread producerThread = new Thread(() -> {
            System.out.println("Producer Thread: "+ Thread.currentThread().getName());
            try {
                Thread.sleep(5000l);
            }catch (Exception e){
                // handle exception here
            }
            sharedResource.addItem();
        });
        // creating consumer thread using lambda expression
        Thread consumerThread = new Thread(() -> {
            System.out.println("Consumer Thread: "+ Thread.currentThread().getName());
            sharedResource.consumeItem();
        });

        // thread is in runnable state
        producerThread.start();
        consumerThread.start();
        System.out.println("Main method end");
    }
}

/*
    Main method start
    Main method end
    Producer Thread: Thread-0
    Consumer Thread: Thread-1
    ConsumeItem method invoked by: Thread-1
    Thread Thread-1 is waiting now
    Item added by: Thread-0 and invoking all threads which are waiting
*/

