import java.util.stream.Stream;

public class InfinityStream {
  public static void main(String[] args) {
    Stream<Double> stream = Stream.generate(() -> new Double("1.0")).limit(100);
    System.out.println(stream.sorted().findFirst());
  }
}

