import java.util.stream.IntStream;

public class RangeTest {
  public static void main(String [] args) {
    // Note: range(startIndex, endIndex), will return an empty stream if startIndex > endIndex
    System.out.println(IntStream.range(1, 10).count());
  }
}

