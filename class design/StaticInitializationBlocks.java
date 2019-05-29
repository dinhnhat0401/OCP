class StaticInitializationBlocks {
  static int a = 100;
  static {
    --a;
  }

  public static void main(String[] args) {
    System.out.println(a);
  }
}

