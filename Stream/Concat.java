import java.util.Arrays;
import java.util.stream.Stream;
 
public class Concat {
    public static void main(String[] args) {
        Stream<String> stream = Arrays.asList("One", "Two", "Three").stream();
        System.out.println(stream.reduce(null, (s1, s2) -> s1 + s2));
        System.out.println(null + "One");
    }
}

