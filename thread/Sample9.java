class Sample9 {
  public static void main(String [] args) throws InterruptedException {
    Thread t = new Thread();
    // If we don't acquire a lock on t before calling t.wait() exception:java.lang.IllegalMonitorStateException will occur
    synchronized(t) {
      t.start();
      System.out.println("X");
      t.wait(100000);
      System.out.println("Y");
    }
  }
}

