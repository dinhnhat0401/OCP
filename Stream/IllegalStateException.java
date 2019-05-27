import java.util.stream.IntStream;
 
public class IllegalStateException {
    public static void main(String[] args) {
        IntStream stream = "OCP".chars();
//        stream.forEach(c -> System.out.print((char)c));
        System.out.println(stream.count()); //Line 9
    }
}
