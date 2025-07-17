/*
* ReadLock: More than 1 thread can acquire the read lock
* WriteLock: Only 1 thread can acquire the write lock
*
* This lock is used when read is very high
* */

package multithreading.locks.semaphore_lock;

public class Main {
    public static void main(String[] args) {
        SharedResource resource= new SharedResource();
        Thread th1= new Thread(() -> {
            resource.produce();
        });
        Thread th2= new Thread(() -> {
            resource.produce();
        });
        Thread th3= new Thread(() -> {
            resource.produce();
        });
        Thread th4= new Thread(() -> {
            resource.produce();
        });

        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}

/*
Lock acquired by: Thread-1
Lock acquired by: Thread-0
Lock acquired by: Thread-2
Lock acquired by: Thread-3
Lock released by: Thread-0
Lock released by: Thread-1
Lock released by: Thread-3
Lock released by: Thread-2
*/
