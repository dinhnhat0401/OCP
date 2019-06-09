import java.util.stream.IntStream;

public class StreamSummaryStatistics {
  public static void main(String[] args) {
    IntStream stream = IntStream.rangeClosed(1, 20).filter(i -> i % 2 == 0);
    System.out.println(stream.summaryStatistics());
  }
}

