import java.util.stream.IntStream;

public class ParallelIntStream {
  public static void main(String[] args) {
    //IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
    IntStream.rangeClosed(11, 20).peek(System.out::println).forEach(System.out::println);
  }
}

