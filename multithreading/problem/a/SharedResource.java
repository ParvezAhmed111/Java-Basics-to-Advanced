package multithreading.problem.a;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedBufferQueue;
    private Integer bufferSize;

    public SharedResource(int bufferSize){
        sharedBufferQueue= new LinkedList<>();
        this.bufferSize= bufferSize;
    }

    public synchronized void produce(int item) throws InterruptedException {
        // if buffer is full wait for the consumer to consume item
        while (sharedBufferQueue.size()==bufferSize){
            System.out.println("Buffer is full, producer is waiting for consumer");
            wait();
        }
        sharedBufferQueue.add(item);
        System.out.println("Produced: "+ item);
        notify(); //notify consumer that there are items to consume now
    }

    public synchronized int consume() throws InterruptedException {
        while (sharedBufferQueue.isEmpty()){
            System.out.println("Buffer is empty, consumer is waiting for producer");
            wait();
        }
        int item= sharedBufferQueue.poll();
        System.out.println("Consumed: "+ item);
        notify(); //notify producer that there is space in buffer now
        return item;
    }
}
