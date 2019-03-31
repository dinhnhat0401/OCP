import java.util.Date;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
  public static void main(String[] args) {
    final CyclicBarrier barrier = new CyclicBarrier(3);
    
    Thread serviceOneThread = new Thread(new ServiceOne(barrier));
    Thread serviceTwoThread = new Thread(new ServiceTwo(barrier));

    System.out.println("Starting both the services at"+new Date());
         
    serviceOneThread.start();
    serviceTwoThread.start();
         
    try {
        barrier.await();
    } catch (InterruptedException e) {
        System.out.println("Main Thread interrupted!");
        e.printStackTrace();
    } catch (BrokenBarrierException e) {
        System.out.println("Main Thread interrupted!");
        e.printStackTrace();
    }
    System.out.println("Ending both the services at"+new Date());
  }
}


class ServiceOne implements Runnable {
 
    private final CyclicBarrier cyclicBarrier;
 
    public ServiceOne(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }
 
    @Override
    public void run() {
        System.out.println("Starting service One...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        System.out
                .println("Service One has finished its work... waiting for others...");
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            System.out.println("Service one interrupted!");
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            System.out.println("Service one interrupted!");
            e.printStackTrace();
        }
        System.out.println("The wait is over, lets complete Service One!");
 
    }
 
}


class ServiceTwo implements Runnable {
     
    private final CyclicBarrier cyclicBarrier;
 
    public ServiceTwo(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }
 
    @Override
    public void run() {
        System.out.println("Starting service Two....");
         
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        System.out.println("Service Two has finished its work.. waiting for others...");
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            System.out.println("Service one interrupted!");
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            System.out.println("Service one interrupted!");
            e.printStackTrace();
        }
        System.out.println("The wait is over, lets complete Service two!");
 
    }
 
}
