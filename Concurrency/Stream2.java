import java.util.stream.*;
import java.util.*;

class Stream2 {
  public static void main(String [] args) {
    Stream<List<String>> sDogNames = Stream.generate(() -> Arrays.asList("boi", "aiko", "charis", "zooey", "clover"))
      .limit(2).unordered();
    sDogNames.parallel()
             .flatMap(s -> s.stream())
             .map(s -> s.toUpperCase())
             .forEach(s -> System.out.print(s + " "));
   
    System.out.println("");
     
    Stream<List<String>> sDogName2 = Arrays.asList(
      Arrays.asList("boi", "aiko", "charis", "zooey", "clover"), 
      Arrays.asList("boi", "aiko", "charis", "zooey", "clover"))
      .stream().unordered();
    sDogName2.parallel()
      .flatMap(s -> s.stream())
      .map(s -> s.toUpperCase())
      .forEach(s -> System.out.print(s + " "));
  }
}

