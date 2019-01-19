import java.io.*;

class FileOutputStream {
  public static void main(String [] args) {
    try {
      File file = new File("fileOutputStream.txt");
      FileWriter fw = new FileWriter(file);
      PrintWriter pw = new PrintWriter(fw);
      pw.println("this content is created by");
      pw.println("print writer command");
      pw.flush();
      pw.close();
      
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
      String data;
      while ((data = br.readLine()) != null) {
        System.out.println(data);
      }
      br.close();
    } catch (IOException e) {
      
    }
  }
}

