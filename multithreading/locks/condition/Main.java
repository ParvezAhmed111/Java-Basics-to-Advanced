package multithreading.locks.condition;

public class Main {
    public static void main(String[] args) {
        SharedResource resource= new SharedResource();
        Thread th1= new Thread(() -> {
            for (int i=0; i<2; i++){
                resource.produce();
            }
        });
        Thread th2= new Thread(() -> {
            for (int i=0; i<2; i++){
                resource.consume();
            }
        });

        th1.start();
        th2.start();
    }
}

/*
Produce Lock acquired by: Thread-0
Produce Lock released by: Thread-0
Produce Lock acquired by: Thread-0
Produce thread is waiting: Thread-0
Consume lock acquired by: Thread-1
Produce Lock released by: Thread-0
Consume lock released by: Thread-1
Consume lock acquired by: Thread-1
Consume lock released by: Thread-1
*/
