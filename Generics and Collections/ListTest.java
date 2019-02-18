import java.util.*;

class ListTest {
  public static void main(String [] args) {
    String[] sa = {"one", "two", "three", "four"};
    List sList = Arrays.asList(sa);
    //System.out.println("size " + sList.size());
    //System.out.println("idx2 " + sList.get(2));

    sList.set(3, "zero");
    for (String s : sa) System.out.print(s + " ");
  }
}

