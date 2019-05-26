import java.lang.Integer;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.List;

public class Reduce {
  public static void main(String [] args) {
    List<String> codes = Arrays.asList("1st", "2nd", "3rd", "4th");
    System.out.println(codes.stream().filter(s -> s.endsWith("d")).reduce((s1, s2) -> s1 + s2));
  
    int res = 1;
    IntStream stream = IntStream.rangeClosed(1, 5);
    System.out.println(stream.reduce(1, (i, j) -> i * j));
    // System.out.println(stream.reduce(1, Integer::intValue)); // Integer class have intValue method but that is single param method, for reduce function, we need BinaryOperator/BiFunction
  }
}

