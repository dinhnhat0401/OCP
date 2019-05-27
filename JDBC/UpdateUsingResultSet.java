import java.sql.*;

public class UpdateUsingResultSet {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/employee";
    String user = "root";
    String password = "";
    String query = "Select ID, FIRSTNAME, LASTNAME, SALARY FROM EMPLOYEE WHERE SALARY > 14900 ORDER BY ID";
 
    try (Connection con = DriverManager.getConnection(url, user, password);
      Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
      ResultSet rs = stmt.executeQuery(query);) {
      while (rs.next()) {
        System.out.println(rs.getString("FIRSTNAME") + " " + rs.getString("LASTNAME"));
      }
      rs.absolute(2);
      //System.out.println(rs.getString("FIRSTNAME") + " " + rs.getString("LASTNAME"));
      rs.updateDouble("SALARY", 20000); // updating rs's salary value
      rs.updateRow(); // this line is needed if we want to write above change to the database
    } catch (SQLException ex) {
       System.out.println("Error: " + ex.getMessage());
    }
  }
}

