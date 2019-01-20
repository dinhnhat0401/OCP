import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.InvalidPathException;
import java.io.IOException;

import java.util.Set;

class PosixFileAttributesTest {
  public static void main(String [] args) {
    try {
      Path file = Paths.get("myfile.txt");
      PosixFileAttributes posix = Files.readAttributes(file, PosixFileAttributes.class);
      Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-r--r--");
      Files.setPosixFilePermissions(file, perms);
      System.out.println(posix.group());
      System.out.println(posix.permissions());
      
      DosFileAttributes dos = Files.readAttributes(file, DosFileAttributes.class);
      System.out.println(dos.isHidden());
    } catch (InvalidPathException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

