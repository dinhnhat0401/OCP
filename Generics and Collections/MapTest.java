import java.util.*;

class Dog {
  public String name;
  public Dog(String n) {
    name = n;
  }
  
  public boolean equals(Object o) {
    if ((o instanceof Dog) && ((Dog)o).name.equals(name)) return true;
    return false;
  }

  public int hashCode() {
    return name.length();
  }
}

class Cat { }

enum Pets { DOG, CAT, HORSE }

class MapTest {
  public static void main(String[] args) {
    Map<Object, Object> m = new HashMap<Object, Object>();

    m.put("k1", new Dog("aiko"));
    m.put("k2", Pets.DOG);
    m.put(Pets.CAT, "CAT key");
    
    Dog d1 = new Dog("clover");
    m.put(d1, "DOG key");

    Cat c1 = new Cat();
    m.put(c1, "CAT key");
    
    Cat c2 = new Cat();
    m.put(c2, "CAT key2");

    System.out.println(m.get("k1"));
    System.out.println(m.get("k2"));
    
    Pets p = Pets.CAT;
    System.out.println(m.get(p));
    System.out.println(m.get(d1));
    System.out.println(m.get(c1));
    System.out.println(m.get(c2));
    System.out.println(m.size());

    d1.name = "magnolia";
    System.out.println(m.get(d1));
    d1.name = "clover";
    System.out.println(m.get(new Dog("clover")));
    d1.name = "arthur";
    System.out.println(m.get(new Dog("clover")));
  }
}

