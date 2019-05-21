class Laptop extends Computer {
   protected String type = "laptop";
}
public class Computer {
   protected String type = "computer";
   public static void main(String[] args) {
      Computer computer = new Laptop();
      Laptop laptop = new Laptop();
      System.out.print(computer.type + "," + laptop.type);
   }
}

