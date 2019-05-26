class Resource1 {
//class Resource1 implements AutoCloseable {
  public void close() {
    System.out.println("Resource1");
  }
}

class Resource2 {
//class Resource2 implements AutoCloseable {
  public void close() {
    System.out.println("Resource2");
  }
}

public class NotImplementAutoCloseable {
  public static void main(String [] args) {
    try (Resource1 r1 = new Resource1(); Resource2 r2 = new Resource2()) {
      System.out.println("Test");
    }
  }
}

