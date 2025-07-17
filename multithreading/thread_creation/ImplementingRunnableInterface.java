package multithreading.thread_creation;
// recommended in companies
class MultiThreading implements Runnable{

    @Override
    public void run() {
        System.out.println("code executed by thread: "+Thread.currentThread().getName());
    }
}
public class ImplementingRunnableInterface {
    public static void main(String[] args) {
        System.out.println("Going inside main method: "+ Thread.currentThread().getName());
        // step 1 : creating runnable object
        MultiThreading runnableObj= new MultiThreading();
        // step 2 : creating thread by passing runnable object into thread
        Thread thread= new Thread(runnableObj);
        // step 3 : starting thread
        thread.start();
        System.out.println("Finish main method: "+ Thread.currentThread().getName());
    }
}

/*
    Going inside main method: main
    Finish main method: main
    code executed by thread: Thread-0
*/