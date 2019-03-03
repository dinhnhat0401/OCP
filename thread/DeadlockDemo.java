class DeadlockDemo extends Thread {
  static Thread mainThread;
  public void run() {
    System.out.println("Child thread is waiting for main thread completion");
    try {
      mainThread.join();
    } catch (InterruptedException e) {
      System.out.println("Child thread execution completes");
    }
  }

  public static void main(String[] args) throws InterruptedException {
    DeadlockDemo.mainThread = Thread.currentThread();
    DeadlockDemo thread = new DeadlockDemo();
    thread.start();
    System.out.println("Main thread waiting for Child thread completion");
    thread.join();
    System.out.println("Main thread execution completes");
  }
}

