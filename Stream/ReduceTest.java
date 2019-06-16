import java.util.stream.Stream;
 
public class ReduceTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("J", "A", "V", "A");
        String text = stream.parallel().reduce((a, b) -> { System.out.println("a = " + a + ", b = " + b + ";"); return a + b;}).get();
        System.out.println(text);

        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println(stream2.parallel().reduce((a, b) -> { System.out.println("a = " + a + ", b = " + b + ";"); return a + b;} ).get());
    }
}

