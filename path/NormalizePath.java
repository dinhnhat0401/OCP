import java.nio.file.Path;
import java.nio.file.Paths;
 
public class NormalizePath {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/admin/WORK/../ocp/path");
        path.normalize();
        System.out.println(path);
    }
}

