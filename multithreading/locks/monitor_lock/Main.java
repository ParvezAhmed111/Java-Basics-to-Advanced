package multithreading.locks.monitor_lock;

class MonitorLock {
    public synchronized void task1(){
        try {
            System.out.println("inside Task 1");
            Thread.sleep(1000);
            System.out.println("Task 1 completed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void task2(){
        System.out.println("Task 2, but before synchronized");
        synchronized (this){
            System.out.println("Task 2, inside synchronized");
        }
    }

    public void task3(){
        System.out.println("inside Task 3");
    }
}


public class Main {
    public static void main(String[] args) {
        MonitorLock monitorLock= new MonitorLock();
        Thread t1= new Thread(() -> monitorLock.task1()); //lambda
        Thread t2= new Thread(monitorLock::task2); //method reference
        Thread t3= new Thread(monitorLock::task3); //method reference

        t1.start();
        t2.start();
        t3.start();

    }
}
