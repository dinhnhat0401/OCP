import java.nio.file.Files;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

class DirectoryStreamTest {
  public static void main(String[] args) throws IOException {
    Path dir = Paths.get("/users");
    try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
      for (Path path : stream) {
        System.out.println(path.getFileName());
      }
    }
  }
}

