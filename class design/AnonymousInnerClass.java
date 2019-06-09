class Message {
  public void printMessage() {
    System.out.println("Hello!");
  }
}

public class AnonymousInnerClass {
  public static void main(String[] args) {
    Message msg = new Message() {
      public void printMessage() {
        System.out.println("HELLO!");
      }
    };
    msg.printMessage(); 
  }
}

