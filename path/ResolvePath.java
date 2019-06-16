import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvePath {
  public static void main(String[] args) {
    Path file1 = Paths.get("/Users/admin/WORK/practice-c");
    Path file2 = Paths.get("path");
    System.out.println(file1.resolve(file2));
    System.out.println(file1.resolveSibling(file2));
  }
}

