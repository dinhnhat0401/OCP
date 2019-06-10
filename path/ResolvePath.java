import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvePath {
  public static void main(String[] args) {
    Path file1 = Paths.get("~\\A\\B\\C");
    Path file2 = Paths.get("Book.java");
    System.out.println(file1.resolve(file2));
    System.out.println(file1.resolveSibling(file2));
  }
}

