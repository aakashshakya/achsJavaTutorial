package jdbc;

import java.sql.*;

public class JdbcGetRecordExample {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement statement;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_information_system",
                    "root", "password");
            statement = conn.createStatement();
            String sql = "Select * from employee";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println("The name of the user is " + resultSet.getString("full_name"));
                System.out.println("The age of the user is " + resultSet.getInt("age"));
                System.out.println("The address of the user is " + resultSet.getString("address"));
                System.out.println("The contact number of the user is " + resultSet.getString("contact_number"));
                System.out.println("=================================================");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("The given Driver class could not be loaded.");
        } catch (SQLException se) {
            System.out.println("Exception occurred when carrying out SQL operation. " + se.getMessage());
        } finally {
            if(conn != null) {
                conn.close();
            }
        }
    }
}
