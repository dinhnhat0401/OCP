import java.util.stream.Stream;

class StreamDataSearch {
  public static void main(String [] args) {
    // Iterate without limitation by using limit() function will generate an infinitive stream
    Stream<Integer> stream = Stream.iterate(1, i -> i+1);
    
    //System.out.println(stream.anyMatch(i -> i > 1));
    
    //System.out.println(stream.findFirst());
    
    //System.out.println(stream.findAny());

    // allMatch will return false for infinitive stream
    System.out.println(stream.allMatch(i -> i > 0));
  }
}

