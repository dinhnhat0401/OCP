public class Outer {
  class Inner {
    
  }

  static class StaticInner {
    
  }

  public static void main(String... args) {
    class MethodInner {
    }

    // This is illegal, only nested class can be static    
    //static class StaticMethodInner {
    //}
    
    Outer o = new Outer();
    
    // Because Inner is not a static class, we need to initialize an Outer object
    // then use that object to initialize an inner class
    Inner inner1 = o.new Inner();
    Outer.Inner inner = o.new Inner();

    // StaticInner is a static class
    StaticInner staticInner = new Outer.StaticInner();
    Outer.StaticInner staticInner2 = new Outer.StaticInner();

    // instantiate a new local class 
    MethodInner methodInner = new MethodInner();
  } 
}

