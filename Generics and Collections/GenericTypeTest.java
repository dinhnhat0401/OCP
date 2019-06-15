import java.util.ArrayList;
import java.util.Collection;

public class GenericTypeTest<T> {
  private T t;
  
  GenericTypeTest() {
  }
   
  GenericTypeTest(T t) {
    this.t = t;
  } 
  
  public T get() {
    return t;
  }

  public void set(T t) {
    this.t = t;
  }
  
  public String toString() {
    return t + "";
  }

  public static void main(String args[]) {
    GenericTypeTest obj = new GenericTypeTest();
    obj.set("OCP");
    obj.set(85);
    obj.set('%');

    class LocalInner {
      private String str;
      LocalInner(String str) {
        this.str = str;
      }
    }
    
    obj.set(new LocalInner("Test"));
    
    System.out.println(obj.get());
    
    Collection<GenericTypeTest> arr = new ArrayList<>();
    arr.add(new GenericTypeTest("OCP"));
    arr.add(new GenericTypeTest(85));
    arr.add(new GenericTypeTest('%'));
    for (GenericTypeTest gtt : arr) {
      System.out.println(gtt);
    }
  }
}

