class Printer<String> {
  private String t; // This is type parameter not java.lang.String
  
  // this String is type parameter not java.lang.String
  Private (String t) {
    this.t = t;
  }

  // This String is type parameter not java.lang.String
  // Because this isn't java.lang.String, this caused compilation error
  public String toString() {
    return null;
  }
}

public class WeirdTypeParameter {
  public static void main(String [] args) {
    Printer<Integer> obj = new Printer<>(100);
    System.out.println(obj);
  }
}

