import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamGet {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("Z", "Y", "X"));
    System.out.println(list.stream().sorted().findFirst().get());
  }
}

