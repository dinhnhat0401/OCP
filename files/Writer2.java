import java.io.*;

class Writer2 {
  public static void main(String[] args) {
    char [] in = new char[50];
    int size = 0;
    try {
      File file = new File("fileWrite2.txt");
      FileWriter fw = new FileWriter(file);
      fw.write("howdy\nfolks\n");
      fw.flush();
      fw.write("illegal write 1");
      fw.close();
      //fw.write("illegal write 2");
      FileReader fr = new FileReader(file);
      size = fr.read(in);
      System.out.print(size + " ");
      for (char c : in) System.out.print(c);
      fr.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}

