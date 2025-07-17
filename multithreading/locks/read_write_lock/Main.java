/*
* ReadLock: More than 1 thread can acquire the read lock
* WriteLock: Only 1 thread can acquire the write lock
*
* This lock is used when read is very high
* */

package multithreading.locks.read_write_lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        ReadWriteLock lock= new ReentrantReadWriteLock();
        SharedResource resource= new SharedResource();
        Thread th1= new Thread(() -> {
            resource.produce(lock);
        });
        Thread th2= new Thread(() -> {
            resource.consume(lock);
        });

        SharedResource resource1= new SharedResource();
        Thread th3= new Thread(() -> {
            resource1.consume(lock);
        });

        th1.start();
        th2.start();
        th3.start();
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
