import java.io.*;

public class SerializeDog {
  public static void main(String[] args) {
    Collar c = new Collar(3);
    Dog d = new Dog(c, 5);
    System.out.println("before: collar size is " + d.getCollar().getCollarSize());

    try {
      FileOutputStream fs = new FileOutputStream("testSer.ser");
      ObjectOutputStream os = new ObjectOutputStream(fs);
      os.writeObject(d);
      os.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      FileInputStream fis = new FileInputStream("testSer.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);
      d = (Dog) ois.readObject();
      ois.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("after: collar size is " + d.getCollar().getCollarSize());
  }
}

class Dog implements Serializable {
  transient private Collar theCollar;
  private int dogSize;
  public Dog(Collar collar, int size) {
    theCollar = collar;
    dogSize = size;
  }
  public Collar getCollar() {
    return theCollar;
  }

  private void writeObject(ObjectOutputStream os) {
    try {
      os.defaultWriteObject();
      os.writeInt(theCollar.getCollarSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void readObject(ObjectInputStream is) {
    try {
      is.defaultReadObject();
      theCollar = new Collar(is.readInt());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

