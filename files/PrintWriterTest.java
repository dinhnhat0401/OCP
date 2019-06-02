import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
  public static void main(String [] args) {
    try (PrintWriter bw = new PrintWriter("file.txt")) {
      bw.close(); 
      bw.write("This is a new message from PrintWriterTest");
    } catch (IOException e) {
      System.out.println("IOException");
    } 
  }
}

