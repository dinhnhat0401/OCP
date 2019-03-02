class ThreadSleepTest {
  public static void main(String [] args) {
    OCPThread t = new OCPThread();
    t.start();
  }
}

class OCPThread extends Thread {
  public void run() {
    for (int i = 0; i < 100; i++) {
      if (i % 10 == 0) System.out.println("==============");
      System.out.println(i);
      try {
        sleep(1000);
      } catch (InterruptedException e) { }
    }
  }
}

