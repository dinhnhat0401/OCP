import java.util.Arrays;
import java.util.List;

public class AsList {
  public static void main(String[] args) {
    // Returns a fixed-size list backed by the specified array.
    List<String> list = Arrays.asList("A", "E", "I", "O");
    list.add("U");
    list.forEach(System.out::print);
  }
}

