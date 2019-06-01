import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Random;
import java.util.stream.IntStream;

public class ConsumerFunctionExample {
  public static void main(String [] args) {
    Consumer<Integer> consumer = i -> { System.out.println(" " + i); };
    
    Supplier<Integer> supplier = () -> {
      Random r = new Random();
      return r.nextInt(40) + 1;
    }; 
   
    List<Integer> list = Arrays.asList(supplier.get(), supplier.get(), new Integer(2), new Integer(4), new Integer(9));
    List<Integer> list1 = Arrays.asList(supplier.get());
    
    System.out.println("sum = " + list1.stream().map(i -> i.intValue()).reduce(10, (i, j) -> i + j));

    printList(list1, consumer);

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

