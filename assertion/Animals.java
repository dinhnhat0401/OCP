public class Animals {
  class Lamb implements Closeable {
    public void close() throws Exception {}
  }
  public static void main(String[] args) throws Exception {
    new Animals().run();
  }

  public void run() throws Exception {
    try (Lamb l = new Lamb();) {
    }
  }
}

