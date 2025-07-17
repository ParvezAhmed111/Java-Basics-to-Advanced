package multithreading.locks.stamped_lock.optimistic_lock_functionality;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    int a= 10;
    StampedLock lock= new StampedLock();

    public void produce(){
        long stamp= lock.tryOptimisticRead();
        try {
            System.out.println("Taken optimistic lock by: "+ Thread.currentThread().getName());
            a=11;
            Thread.sleep(6000);
            if(lock.validate(stamp)){
                System.out.println("updated a value successfully");
            }
            else {
                System.out.println("rollback of work");
                a= 10; //rollback
            }
        }catch (Exception e){

        }
    }

    public void consume(){
        long stamp= lock.writeLock();
        System.out.println("Write Lock acquired by: "+ Thread.currentThread().getName());
        try {
            System.out.println("performing work");
            a= 9;
        }catch (Exception e){

        }finally {
            lock.unlockWrite(stamp);
            System.out.println("Write Lock released by: "+ Thread.currentThread().getName());
        }
    }
}
