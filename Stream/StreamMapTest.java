import java.util.ArrayList;
import java.util.List;

class MyString {
  String str;
  MyString(String str) {
    this.str = str;
  }

  // If a class doesn't override toString method, when pass it to print method, it will be printed as: CLASS-NAME@hash-code-in-hex
  public String toString() {
    return str;
  }  

  //public int hashCode() {
  //  return 444;
  //}
}

public class StreamMapTest {
  public static void main(String[] args) {
    List<MyString> list = new ArrayList<>();
    list.add(new MyString("Y"));
    list.add(new MyString("E"));
    list.add(new MyString("S"));

    list.stream().map(s -> s).forEach(System.out::print);    
  }
}

