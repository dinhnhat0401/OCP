import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileTime;

class TestBasicFileAttributes {
  public static void main(String[] args) {
    try {
      Path p = Paths.get("Writer1.java");
      System.out.println(p.toAbsolutePath());
      final BasicFileAttributes basic = Files.readAttributes(p, BasicFileAttributes.class);
      System.out.println("create: " + basic.creationTime());
      System.out.println("access: " + basic.lastAccessTime());
      System.out.println("modify: " + basic.lastModifiedTime());
      System.out.println("directory: " + basic.isDirectory());
      
      System.out.println("\nChange the lastUpdated, now, created time");
      FileTime now = FileTime.fromMillis(System.currentTimeMillis());
      BasicFileAttributeView basicView = Files.getFileAttributeView(p, BasicFileAttributeView.class);
      basicView.setTimes(now, null, null);
    } catch (IOException e) {
    }
  }
}

