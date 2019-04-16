// The result is unpredictable because the reduction function is not associative and the stream is parallel.

import java.util.Optional;
import java.util.stream.*;

class ParallelTest {
  public static void main(String [] args) {
    Stream<Integer> nums = Stream.of(10, 5, 3, 2);
    Optional<Integer> result = nums.parallel()
                                   .map(n -> n * 10)
                                   .reduce((n1, n2) -> n1 - n2);
    System.out.println("Result: " + result.get());
  }
}

