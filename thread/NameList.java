import java.util.*;

public class NameList {
  private List<String> names = Collections.synchronizedList(new LinkedList<>());
  public void add(String name) {
    names.add(name);
  }

  public String removeFirst() {
    if (names.size() > 0) { 
      return (String) names.remove(0); 
    } else { 
      return null;
    }
  }

  public static void main(String[] args) {
    final NameList nl = new NameList();
    nl.add("name1");
    class NameDropper extends Thread {
      public void run() {
        String name = nl.removeFirst();
        System.out.println(name);
      }
    }
    Thread t1 = new NameDropper();
    Thread t2 = new NameDropper();
    t1.start();
    t2.start();
  }
}

