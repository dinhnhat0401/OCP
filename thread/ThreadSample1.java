public class ThreadSample1 {
  public static void main(String[] args) {
    Runnable nr = () -> {
      for (int x = 1; x <= 3; x++) {
        System.out.println("Run by " + Thread.currentThread().getName() + ", x is " + x);
      }
    };
    Thread one = new Thread(nr);
    Thread two = new Thread(nr);
    Thread three = new Thread(nr);
    
    one.setName("Fred");
    two.setName("Lucy");
    three.setName("Ricky");
    
    one.start();
    two.start();
    three.start();
  }
}

