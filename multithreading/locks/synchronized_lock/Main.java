package multithreading.locks.synchronized_lock;

public class Main {
    public static void main(String[] args) {
        SharedResource resource1= new SharedResource();
        Thread th1= new Thread(() -> {
            resource1.producer();
        });
        SharedResource resource2= new SharedResource();
        Thread th2= new Thread(() -> {
            resource2.producer();
        });

        th1.start();
        th2.start();
    }
}


/*
Lock acquired by: Thread-0
Lock acquired by: Thread-1
Lock released by: Thread-1
Lock released by: Thread-0

*/