public class GenericTypeTest<T> {
  private T t;
   
  public T get() {
    return t;
  }

  public void set(T t) {
    this.t = t;
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
  }
}

