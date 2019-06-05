class Parent {
  public void m() {
    System.out.println("Parent");
  }
}

public abstract class MainInAbstractMethod extends Parent {
  public static void main(String [] args) {
    new Parent().m();
  }
}

