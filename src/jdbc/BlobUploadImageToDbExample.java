package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class BlobUploadImageToDbExample {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_information_system",
                    "root", "password");
            String sql = "INSERT into employee (full_name, address, age, contact_number, image) VALUES (?, ?, ?, ?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, "Vagwan Koirala");
            statement.setString(2, "Budanilkantha");
            statement.setInt(3, 58);
            statement.setString(4, "9851225478");
            FileInputStream fin = new FileInputStream("Your Path to file");
            statement.setBinaryStream(5, fin);
            int isInserted = statement.executeUpdate();
            if (isInserted == 1) {
                System.out.println("Record added successfully.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("The given Driver class could not be loaded.");
        } catch (SQLException se) {
            System.out.println("Exception occurred when carrying out SQL operation. " + se.getMessage());
        }  catch (FileNotFoundException fne) {
            System.out.println("File not found exception. " + fne.getMessage());
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
}
