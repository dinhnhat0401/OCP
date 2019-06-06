import java.io.PrintWriter;

public class TryWithNull {
  public static void main(String[] args) {
    try (PrintWriter writer = null) {
      System.out.println("HELLO");
    }
  }
}

