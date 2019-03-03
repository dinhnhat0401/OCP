class StringIncrement extends Thread {
  private StringBuffer sb;
  public StringIncrement(StringBuffer sb) {
    this.sb = sb;
  }  
 
  public static void main (String [] args) {
    StringBuffer A = new StringBuffer("A");
    StringIncrement s1 = new StringIncrement(A);
    StringIncrement s2 = new StringIncrement(A);
    StringIncrement s3 = new StringIncrement(A);
    s1.start();
    s2.start();
    s3.start();
  }

  public void run() {
    synchronized (sb) {
      for (int i = 0; i < 100; i++) System.out.print(sb + " ");
      sb.setCharAt(0, (char)(sb.charAt(0) + 1));
    }
  }
}

