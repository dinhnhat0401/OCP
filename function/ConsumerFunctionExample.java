import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerFunctionExample {
  public static void main(String [] args) {
    Consumer<Integer> consumer = i -> { System.out.println("consumer print"); };
    List<Integer> list = Arrays.asList(new Integer(12), new Integer(1), new Integer(2), new Integer(4), new Integer(9));
    printList(list, consumer);

    Predicate<Integer> p = (i) -> {
      System.out.println("evaluated i = " + i);
      return i % 2 == 0;
    };

    printListUsingStream(list, p, consumer);
  }

  private static void printList(List<Integer> list, Consumer<Integer> consumer) {
    for (Integer i : list) {
      consumer.accept(i);
    }  
  }

  private static void printListUsingStream(List<Integer> list, Predicate<Integer> p, Consumer<Integer> consumer) {
    System.out.println("===========");
    list.stream().filter(p).forEach(consumer);
    //list.stream().filter(p);
    //list.stream().forEach(i -> { System.out.println(i.getClass()); consumer.accept(i); });
  }
}

