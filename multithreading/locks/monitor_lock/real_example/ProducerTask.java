package multithreading.locks.monitor_lock.real_example;

public class ProducerTask implements Runnable{
    SharedResource sharedResource;
    ProducerTask(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }


    @Override
    public void run() {
        System.out.println("Producer Thread: "+ Thread.currentThread().getName());
        try {
            Thread.sleep(5000l);
        }catch (Exception e){
            // handle exception here
        }
        sharedResource.addItem();
    }
}
