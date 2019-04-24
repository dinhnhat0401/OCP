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
        System.out.print(rs.getInt("id") + "  ");
        System.out.print(rs.getString("email") + "  ");
        System.out.println(rs.getString("username"));
      }
    } catch (SQLException se) { 
      System.out.println(se.getMessage());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

