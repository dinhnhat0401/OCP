import java.sql.SQLException;

public class ThrowNullException {
  private static void m() throws SQLException {
    throw null;
  }

  public static void main(String[] args) {
    try {
      m();
    } catch(SQLException e) {
      System.out.println("Caught Successfully.");
    }
  }
}

