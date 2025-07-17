package multithreading.thread_creation;
class MultiThreading1 extends Thread{
    @Override
    public void run() {
        System.out.println("code executed by thread: "+Thread.currentThread().getName());
    }

}
public class ExtendingThreadClass {
    public static void main(String[] args) {
        System.out.println("Going inside main method: "+ Thread.currentThread().getName());
        // step 1 : creating runnable object
        MultiThreading1 myThread= new MultiThreading1();
        // step 2 : creating thread by passing runnable object into thread
        myThread.start();
        System.out.println("Finish main method: "+ Thread.currentThread().getName());
    }
}

/*
    Going inside main method: main
    Finish main method: main
    code executed by thread: Thread-0

*/