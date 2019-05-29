class Outer {
    static class Inner {
        static void greetings(String s) {
            System.out.println(s);
        }
    }
    static void test() {
      System.out.println("static void test is called!!");
    }
}
 
public class StaticMethodInvoke {
    public static void main(String[] args) {
      Outer.Inner inner = new Outer.Inner();  
      inner.greetings("HELLO!");

      Outer outer = new Outer();
      outer.test();
    }
}
