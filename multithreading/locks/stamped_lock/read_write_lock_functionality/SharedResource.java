package multithreading.locks.stamped_lock.read_write_lock_functionality;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    boolean isAvailable = false;
    StampedLock lock= new StampedLock();

    public void produce(){
        long stamp= lock.readLock();
        try {
            System.out.println("Read Lock acquired by: "+ Thread.currentThread().getName());
            isAvailable= true;
            Thread.sleep(6000);
        }catch (Exception e){

        }finally {
            lock.unlockRead(stamp);
            System.out.println("Read Lock released by: "+ Thread.currentThread().getName());
        }
    }

    public void consume(){
        long stamp= lock.writeLock();
        try {
            lock.writeLock();
            System.out.println("Write Lock acquired by: "+ Thread.currentThread().getName());
            isAvailable = false;
        }catch (Exception e){

        }finally {
            lock.unlockWrite(stamp);
            System.out.println("Write Lock released by: "+ Thread.currentThread().getName());
        }
    }
}
