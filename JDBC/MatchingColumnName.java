import java.sql.*;

public class Test {
  public static void main(String[] args) throws SQLException {
     String url = "jdbc:mysql://localhost:3306/ocp";
        String user = "root";
        String password = "password";
        String query = "Select msg1 as msg, msg2 as msg FROM MESSAGES";
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery(query);)
        {
            rs.absolute(1);
            System.out.println(rs.getString("msg"));
            System.out.println(rs.getString("msg"));
        } 
  }
}

