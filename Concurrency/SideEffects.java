import java.util.stream.*;

class SideEffects {
  public static void stateful() {
    class Count {
      int counter = 0;
    }

    Count count = new Count();
    IntStream stream = IntStream.range(0, 50);
    int sum = stream
      .parallel()
      .filter(i -> {
        if (i % 10 == 0) {
          count.counter++;
          return true; 
        }
        return false;
      })
      .sum();
    System.out.println("Sum: " + sum + ", count: " + count.counter);
  }
  
  public static void main(String [] args) {
    stateful();
  }
}

