class Assertion {
  private static void doStuff(int x) {
    assert (x > 0);
    System.out.println("Finished stuff");
  }

  public static void main(String[] args) {
    try {      
      doStuff(Integer.parseInt(args[0]));
      System.out.println("Input value " + Integer.parseInt(args[0]));
    } catch(NumberFormatException e) {
      System.out.println(e.getMessage());
    }
  }
}

