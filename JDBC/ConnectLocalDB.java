import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class ConnectLocalDB { 
  static final String url = "jdbc:mysql://127.0.0.1:3306/msystem_development";
  static final String user = "root";
  static final String pwd = "";

  public static void main(String [] args) {
    try {
      // This is deprecated. We don't need to call this method
      //Class.forName("com.mysql.cj.jdbc.Driver");
      
      Connection conn = DriverManager.getConnection(url, user, pwd);
      Statement stmt = conn.createStatement();
      String query = "SELECT * FROM candidate_users LIMIT 20";
      ResultSet rs = stmt.executeQuery(query);
      while (rs.next()) {
        // Get values by field name
        System.out.print(rs.getInt("id") + "  ");
        System.out.print(rs.getString("email") + "  ");
        System.out.println(rs.getString("username"));

        // Get values by column indexes
        // Remember: Column indexes start with 1.
        System.out.print(rs.getInt(1) + "  ");
        System.out.print(rs.getString(2) + "  ");
        System.out.println(rs.getString(14) + "  ");
      }
    } catch (SQLException se) { 
      System.out.println(se.getMessage());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

