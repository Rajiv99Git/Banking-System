package st;
import java.sql.*;
public class StudentDatabase {
      public static void main(String args[]) throws Exception {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/jdb1";
        String username = "jdb1";
        String password = "jdb1";
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement st = conn.createStatement();	
        int result = st.executeUpdate("insert into STUDENT.STUDENTDB values(166,'Bob',23,'MCSS          college')");
        System.out.println(result + "  :records affected");
        conn.close();	

    }
}
