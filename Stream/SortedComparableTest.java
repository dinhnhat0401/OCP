import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Fruit implements Comparable<Fruit>, Comparator<Fruit> {
    String name;
    String countryOfOrigin;
    
    Fruit() {}
        
    Fruit(String name, String countryOfOrigin) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
    }
    
    public String toString() {
        return name + ":" + countryOfOrigin;
    }
 
    @Override
    public int compareTo(Fruit o) {
        return this.name.compareToIgnoreCase(o.name);
    }
    
    @Override
    public int compare(Fruit o1, Fruit o2) {
        return o1.countryOfOrigin.compareToIgnoreCase(o2.countryOfOrigin);
    }
    
    public static int comp(String s1, String s2) {
        return s2.compareToIgnoreCase(s1);
    }
}
 
public class SortedComparableTest {
    public static void main(String[] args) {
        List<Fruit> list = new ArrayList<>();
        list.add(new Fruit("Olive", "Middle East"));
        list.add(new Fruit("Mango", "India"));
        list.add(new Fruit("Cranberry", "North America"));
        list.add(new Fruit("Watermelon", "Africa"));
        list.add(new Fruit("Peach", "China"));
        list.add(new Fruit("Fig", "Middle East"));
        list.add(new Fruit("Blueberry", "North America"));
        
        /* INSERT */
    
       //list.stream().sorted(new Fruit().reversed()).forEach(System.out::println);
       list.stream().sorted(new Fruit()).reversed().forEach(System.out::println);
   }
}
