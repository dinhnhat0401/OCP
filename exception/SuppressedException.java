import java.io.IOException;
import java.sql.SQLException;
 
class MyResource implements AutoCloseable {
    @Override
    public void close() throws IOException{
    }
 
    public void execute() throws SQLException {
        throw new SQLException("SQLException");
    }
}
 
public class SuppressedException {
    public static void main(String[] args) {
        try(MyResource resource = new MyResource()) {
            resource.execute();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getSuppressed().length);
        }
    }
}

