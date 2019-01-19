import java.io.File;
import java.io.IOException;

class Writer3 {
  public static void main (String[] args) { 
  try {
    File f = new File("writer3.txt");
    boolean newFileCreated = f.createNewFile();
    if (newFileCreated) {
      System.out.println("Created file successfully");
    }
    System.out.println(f.isFile());
  } catch (IOException e) {
  }
  }
}

