package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcAddRecordExample {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_information_system",
                    "root", "password");
            statement = conn.createStatement();
            String sql = "INSERT into employee (full_name, address, age, contact_number) " +
                    "VALUES ('Manisha Koirala', 'Baluwatar', '50', '9851112252')";
            int isInserted = statement.executeUpdate(sql);
            if (isInserted == 1) {
                System.out.println("Record added successfully.");
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("The given Driver class could not be loaded.");
        } catch (SQLException se) {
            System.out.println("Exception occurred when carrying out SQL operation. " + se.getMessage());
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
}
