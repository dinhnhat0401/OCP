import java.sql.*;

public class ResultSetCursor {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/employee";
    String user = "root";
    String password = "";
    String query = "Select ID, FIRSTNAME, LASTNAME, SALARY FROM EMPLOYEE ORDER BY ID";

    try (Connection con = DriverManager.getConnection(url, user, password);
      Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
      ResultSet rs = stmt.executeQuery(query);) {
      // rs.absolute(7); // this will return error, after end of resultset
      // rs.relative(-2); // This does nothing, just keep cursor before first record
      // rs.absolute(-7);  // -1 will move cursor to last record, -3 will more it 2 more steps backward, -7 makes error: before start of result set
      // rs.relative(3);
      System.out.println(rs.getString("firstname") + " " + rs.getString("lastname"));
    } catch (Exception ex) {  
      System.out.println("Error: " + ex.getMessage());
    }
  }
}

