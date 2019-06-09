import java.util.*;

public class AddToDeque {
  public static void main(String[] args) {
    int i = 2000;
    Deque<Integer> deque = new ArrayDeque<>();
    deque.add(1000);
    deque.add(i);
    deque.add(3000);

    deque.forEach(i -> System.out.println(i));
  }
}

