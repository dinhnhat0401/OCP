import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class FlatMapTest {
  public static void main(String [] args) {
    int [] intArray = {1, 2, 3, 4, 5, 6};
    
    Stream<int[]> streamArray = Stream.of(intArray);
    
    Stream intStream = streamArray.flatMap(x -> Arrays.stream(x));
    intStream.forEach(x -> System.out.println(x));
  }
}

