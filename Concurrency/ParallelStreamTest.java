import java.util.*;

public class ParallelStreamTest {
  public static void main(String [] args) {
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    int sum = nums.stream()
                  .parallel()
                  .peek(i -> System.out.println(i + ": " + Thread.currentThread().getName()))
                  .mapToInt(n -> n)
                  .sum();
    System.out.println("Sum is: " + sum);
  }
}

