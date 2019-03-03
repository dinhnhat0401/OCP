class Reader extends Thread {
  Calculator c;
  public Reader(Calculator calc) {
    c = calc;
  }
 
  public void run() {
    synchronized(c) {
      System.out.println("Waiting for calculation...");
      try {  
        c.wait();
      } catch (InterruptedException e) {
      }
      System.out.println("Total is: " + c.total);
    }
  }

  public static void main(String [] args) {
    Calculator cal = new Calculator();
    
    new Reader(cal).start();
    new Reader(cal).start();
    new Reader(cal).start();
    
    new Thread(cal).start();
  }
}

class Calculator implements Runnable {
  int total;
  
  public void run() {
    synchronized(this) {
      for (int i = 0; i < 100; i++) total += i;
      notifyAll();
    }
  }
}

