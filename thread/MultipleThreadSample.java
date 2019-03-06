class MultipleThreadSample implements Runnable {
  private int a;
  private int b;
  public int read() {
    return a + b;
  }

  public void set(int a, int b) {
    this.a = a;
    this.b = b;
  }
  
  public void run() {
    System.out.println("Begin --- set");
    set((int)Thread.currentThread().getId(), (int)Thread.currentThread().getId());
    System.out.println("Did --- set");
    System.out.print("a = " + a + ", b = " + b + ", read result = " + read() + "\n");
    System.out.println("Did --- read");
  }

  public static void main(String [] args) {
    MultipleThreadSample s1 = new MultipleThreadSample();
    

    MultipleThreadSample s2 = new MultipleThreadSample();
    Thread t1 = new Thread(s1);
    Thread t2 = new Thread(s1);
    t1.start();
    t2.start();
  }
}

