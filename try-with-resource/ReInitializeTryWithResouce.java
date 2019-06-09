class Resource implements AutoCloseable {
  public void close() {
    System.out.println("CLOSE");
  }
}

public class ReInitializeTryWithResouce {
  public static void main(String[] args) {
    try (Resource r = null) {
      r = new Resouce();
      System.out.println("HELLO");
    }
  }
}

