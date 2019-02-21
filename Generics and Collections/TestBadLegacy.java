import java.util.*;

public class TestBadLegacy {
  public static void main(String[] args) {
    List<Integer> myList = new ArrayList<Integer>();
    myList.add(4);
    myList.add(6);
    Inserter in = new Inserter();
    in.insert(myList);
    // if use Integer, runtime exception will occur
    for (Object i : myList) {
      System.out.println(i + " ");
    }
  }
}

class Inserter {
  void insert(List list) {
    list.add(new String("42"));
  }
}

