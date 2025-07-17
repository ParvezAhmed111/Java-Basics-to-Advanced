package multithreading.problem.a;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource= new SharedResource(3);
        Thread producerThread =new Thread(() -> {
           for(int i=1; i<=10; i++){
               try {
                   sharedResource.produce(i);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });

        Thread consumerThread= new Thread(() -> {
           for (int i=1; i<=10; i++){
               try {
                   sharedResource.consume();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });

        producerThread.start();
        consumerThread.start();
    }
}

/*
    Produced: 1
    Produced: 2
    Produced: 3
    Buffer is full, producer is waiting for consumer
    Consumed: 1
    Consumed: 2
    Consumed: 3
    Buffer is empty, consumer is waiting for producer
    Produced: 4
    Produced: 5
    Produced: 6
    Buffer is full, producer is waiting for consumer
    Consumed: 4
    Consumed: 5
    Consumed: 6
    Buffer is empty, consumer is waiting for producer
    Produced: 7
    Produced: 8
    Produced: 9
    Buffer is full, producer is waiting for consumer
    Consumed: 7
    Consumed: 8
    Consumed: 9
    Buffer is empty, consumer is waiting for producer
    Produced: 10
    Consumed: 10
*/