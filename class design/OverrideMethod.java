interface Printer1 {
  default void print() {
    System.out.println("Printer1");
  }
}

interface Printer2 {
  public static void print() {
    System.out.println("Printer2");
  }
}

class Printer implements Printer1, Printer2 {
}

public class OverrideMethod {
  public static void main(String[] args) {
    Printer printer = new Printer();
    printer.print();
  }
}

