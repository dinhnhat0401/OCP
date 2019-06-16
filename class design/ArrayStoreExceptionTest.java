class Animal {
  void eat() {
    System.out.println("Animal eats.");
  }
}

class Dog extends Animal {
  public void eat() {
    System.out.println("Dog eats biscuit.");
  }
}

class Cat extends Animal {
  public void eat() {
    System.out.println("Cat eats biscuit.");
  }
}

public class ArrayStoreExceptionTest {
  public static void main(String[] args) {
    Animal [] animals = new Dog[3];
    animals[0] = new Dog();
    // This will cause: Exception in thread "main" java.lang.ArrayStoreException: Cat at ArrayStoreExceptionTest.main(ArrayStoreExceptionTest.java:21)
    animals[1] = new Cat();
    animals[2] = new Animal();


    // This will cause classCastException
    animals[3] = (Dog)new Animal();

    animals[0].eat();
    animals[1].eat();
    animals[2].eat();

    //Double [] doubleArray = new Double[2];
    //doubleArray[0] = new Double(2);
    // ArrayStoreExceptionTest.java:28: error: incompatible types: Integer cannot be converted to Double
    // doubleArray[1] = new Integer(3);
    
     int [] intArr = new int[3];
     int [] intArr2 = {1, 3, 4, 7};
     intArr = intArr2;
     for (int i : intArr) {
       System.out.println(i);
     }
     System.out.println(intArr);
  }
}

