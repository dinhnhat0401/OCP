import java.util.*;
import java.util.concurrent.*;

class q1 {
  public static void main(String [] args) {
    CopyOnWriteArrayList<Integer> cowList = new CopyOnWriteArrayList<>();
    cowList.add(4);
    cowList.add(2);
    Iterator<Integer> it = cowList.iterator();
    cowList.add(6);
    while(it.hasNext()) {
      System.out.println(it.next() + " ");
    }
  }
}

