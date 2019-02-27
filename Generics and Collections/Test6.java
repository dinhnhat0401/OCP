import java.util.*;

class Test6 {
  public static void main(String [] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(2);
    pq.add(4);
    pq.add(1);
    pq.add(5);
    System.out.print(pq.peek() + " ");
    System.out.print(pq.poll() + " ");
    //System.out.print(pq.pollFirst());
    //pq.offer("1");
    //pq.add();
  }
}

