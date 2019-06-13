import java.nio.file.*;
import java.util.*;

public class PathComponent {
  public static void main(String [] args) {
    Path path = Paths.get("/Users/nhat.dinh/WORK/ocp");
    path.forEach(System.out::println);
  }
}

