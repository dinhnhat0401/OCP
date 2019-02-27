import java.util.*;

class Test4 {
  public static void main(String[] args) {
    Map<Todos, String> m = new HashMap<Todos, String>();
    Todos t1 = new Todos("Monday");
    Todos t2 = new Todos("Monday");
    Todos t3 = new Todos("Tuesday");
    
    m.put(t1, "doLaundry");
    m.put(t2, "payBills");
    m.put(t3, "cleanAttic");
    
    System.out.println(m.size());
  }
}

class Todos {
  String day;
  Todos (String d) { day = d; }
  public boolean equals(Object o) {
    return ((Todos)o).day.equals(this.day);
  }
   
  public int hashCode() { return 9; }
}

