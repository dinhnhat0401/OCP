interface PublicInterface {
  void superMethod();
}

class Super {
  protected String prop1;
  
  public static void staticMethod() {
    System.out.println("Super");
  }
  
  protected void superMethod() {
    System.out.println("super method");
  }
}

class Sub extends Super implements PublicInterface {
  public static void staticMethod() {
    System.out.println("Sub");
  }

  public void superMethod() {
    System.out.println("super method @ sub");
  }

  public void subMethod() {
    System.out.println("sub method");
  }
}

class SubClassStaticMethod {
  public static void main(String [] args) {
    Sub.staticMethod();
    Super.staticMethod();
    Super s = new Sub();
    s.superMethod();
  }
}
