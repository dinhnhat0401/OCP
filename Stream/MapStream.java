import java.util.HashMap;
import java.util.Map;

public class MapStream {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "ONE");
    map.put(2, "TWO");
    map.put(3, "THREE");
    // System.out.println(map.stream().count());
    System.out.println(map.keySet().stream().count());
  }
}

