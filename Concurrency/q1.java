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

    ArrayList<Integer> arr1List = new ArrayList<>();
    arr1List.add(5);
    arr1List.add(67);
    arr1List.add(8);
    Iterator<Integer> it2 = arr1List.iterator();
    arr1List.add(6);
    while(it2.hasNext()) {
      System.out.print(it2.next() + " ");
    }
  }
}

