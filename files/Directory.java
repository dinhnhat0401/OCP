import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

class Directory {
  public static void main(String [] args) {
    try {
      File myDir = new File("mydir");
      //myDir.mkdir();
      File myFile = new File(myDir, "myfile.txt");
      myFile.createNewFile();
      PrintWriter pw = new PrintWriter(myFile);
      pw.println("test");
      pw.flush();
      pw.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}

