public class EqualsTest {
  public static void main(String[] args) {
    Moof one = new Moof(8);
    Moof two = new Moof(8);
    if (one == two) {
      System.out.println("one and two are pointing to the same object");
    } else if (one.equals(two)) {
      System.out.println("one and two have the same moofValue");
    } else {
      System.out.println("We don't have anything in common");
    }
  }
}

class Moof {
  private int moofValue;
  Moof(int val) {
    moofValue = val;
  }

  public int getMoofValue() {
    return moofValue;
  }

  public boolean equals(Object o) {
    System.out.println("Method with Object param called");
    return (o instanceof Moof) && (((Moof)o).getMoofValue() == this.moofValue);
  }

  public boolean equals(Moof o) {
    System.out.println("Method with Moof param called");
    return (o instanceof Moof) && (((Moof)o).getMoofValue() == this.moofValue);
  }
}

