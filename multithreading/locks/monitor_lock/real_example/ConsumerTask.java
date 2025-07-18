package multithreading.locks.monitor_lock.real_example;

public class ConsumerTask implements Runnable{
    SharedResource sharedResource;
    ConsumerTask(SharedResource sharedResource){
        this.sharedResource= sharedResource;
    }

    @Override
    public void run() {
        System.out.println("Consumer Thread: "+ Thread.currentThread().getName());
        sharedResource.consumeItem();
    }
}
