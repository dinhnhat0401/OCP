import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

class Deletion {
  public static void main(String [] args) {
    try {
      File dir1 = new File("dir1");
      dir1.mkdir();
      File file1 = new File(dir1, "file1.txt");
      file1.createNewFile();
      PrintWriter pw = new PrintWriter(file1);
      pw.println("test content for file1");
      pw.flush();
      pw.close();
      
      System.out.println("delDir is " + dir1.delete());
      File newFile = new File(dir1, "newFile.txt");
      boolean rename = file1.renameTo(newFile);
      System.out.println("The rename progrogress result is:  " + rename);
      System.out.println("file1's new name is: " + file1.getName());
      System.out.println("file1's new path is: " + file1.getPath());
      //System.out.println("delDir attemp 2 is " + dir1.delete());
    } catch (IOException e) {
      e.printStackTrace();
    }
  } 
}

