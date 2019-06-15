public class GenericTypeTest2 {
  public static <T> T get(T t) {
    return t;
  }

  public static void main(String[] args) {
    String str = get("HELLO");
    System.out.println(str);
  }
}

