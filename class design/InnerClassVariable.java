class P {
  private int var = 100;
  class Q {
    // Overriding the Outer class's variable
    // If the variable isn't overrided by Outer class then var will be considered as: P.this.var
    // String var = "Java";
    //int var = 200;
    void print() {
      System.out.println(var);
    }
  }
}

public class InnerClassVariable {
  public static void main(String [] args) {
    new P().new Q().print();
  }
}

