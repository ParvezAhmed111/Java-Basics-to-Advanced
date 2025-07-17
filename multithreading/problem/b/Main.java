package multithreading.problem.b;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource= new SharedResource();
        System.out.println("Main thread started");
        Thread th1= new Thread(() -> {
            System.out.println("Thread1 calling produced method");
            sharedResource.produce();
        });

        Thread th2= new Thread(() -> {
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                // handle exception
            }
            System.out.println("Thread2 calling produce method");
            sharedResource.produce();
        });

        th1.start();
        th2.start();
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            // handle exception
        }
        System.out.println("Thread1 is suspended");
        th1.suspend();
        System.out.println("Main thread is finishing its work");

    }
}
