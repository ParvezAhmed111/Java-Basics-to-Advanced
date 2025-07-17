/*
* Stamped Lock:
* It support read/write lock functionality like ReadWriteLock
* */

package multithreading.locks.stamped_lock.optimistic_lock_functionality;

public class Main {
    public static void main(String[] args) {
        SharedResource resource= new SharedResource();
        Thread th1= new Thread(() -> {
            resource.produce();
        });
        Thread th2= new Thread(() -> {
            resource.consume();
        });

        th1.start();
        th2.start();
    }
}

/*
Read Lock acquired by: Thread-0
Read Lock released by: Thread-0
Write Lock acquired by: Thread-1
Write Lock released by: Thread-1
Write Lock acquired by: Thread-2
Write Lock released by: Thread-2
*/
