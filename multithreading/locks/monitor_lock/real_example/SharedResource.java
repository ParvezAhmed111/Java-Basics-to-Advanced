package multithreading.locks.monitor_lock.real_example;

public class SharedResource {
    boolean isItemAvailable= false;

    //synchronized put the monitor lock
    public synchronized void addItem(){
        isItemAvailable= true;
        System.out.println("Item added by Producer Thread: "+ Thread.currentThread().getName());
        System.out.println("Producer Thread calling the notify method");
        notifyAll();
    }

    public synchronized void consumeItem() {
        System.out.println("ConsumeItem method invoked by: "+ Thread.currentThread().getName());

        // using while loop to "suprious wake-up", sometimes because of system noise
        while (!isItemAvailable){
            try {
                System.out.println("Consumer Thread "+ Thread.currentThread().getName() + " is waiting now");
                wait(); //it releases monitor lock
            }catch (Exception e){
                // handle exception here
            }
        }
    }
}
