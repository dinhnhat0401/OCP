import java.sql.*;

class ResultSetMetaDataSample {
  public static void main(String [] args) {
    try {
      ResultSet rs = stmt.executeQuery(query);
      ResultSetMetaData rsmd = rs.getMetaData();
      int cols = rsmd.getColumnCount();
      String col, colData;
      for (int i = 1; i < cols; i++) {
        col = leftJustify(rsmd.getColumnName(i), rsmd.getColumnDisplaySize(i));
        System.out.print(col);
      }
      System.out.println();
      while (rs.next()) {
        for (int i = 1; i < cols; i++) {
          if (rs.getObject(i) != null) {
            colData = rs.getObject(i).toString();
          } else {
            colData = "NULL";
          }
          col = leftJustify(colData, rsmd.getColumnDisplaySize(i));
          System.out.print(col);
        }
        System.out.println();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } catch (Exception e) {
      System.out.println("ERROR! " + e.getMessage());
    }
  }

  public static String leftJustify(String s, int n) {
    if (s.length() <= n) n++;
    return String.format("%1$-" + n + "s", s);
  }
}

