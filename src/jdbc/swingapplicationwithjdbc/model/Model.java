/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.swingapplicationwithjdbc.model;

import jdbc.swingapplicationwithjdbc.model.resources.UserInformation;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author aakash
 */
public class Model {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/school_information_system";

    //  Database credentials
    private static final String USER = "root";
    private static final String PASS = "password";

    private Connection conn = null;
    private Statement statement = null;

    private void createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_information_system", "root", "password");
        statement = conn.createStatement();
    }

    private void closeConnection() throws SQLException {
        conn.close();
    }


    public void saveUserInformation(String fullName, String address, String age, String contactNumber) throws Exception {
        validate(fullName, "Full Name");
        validate(address, "Address");
        validate(contactNumber, "Contact Number");
        validateAge(age);
        createConnection();
        String sql = "INSERT into employee (full_name, address, age, contact_number) VALUES ('" + fullName + "', '" +
                address + "', '" + age + "', '" + contactNumber + "')";
        statement.executeUpdate(sql);
        closeConnection();
    }

    private void validate(String field, String fieldName) throws Exception {
        if (field == null || field.equals("")) {
            throw new Exception(fieldName + " field cannot be null or empty.");
        }
    }

    private void validateAge(String age) throws Exception {
        validate(age, "Age");
        try {
            Integer.parseInt(age);
        } catch (Exception ex) {
            throw new Exception("Age is not of integer type.");
        }
    }

    public List<UserInformation> getAllInformation() throws SQLException, ClassNotFoundException {
        try {
            createConnection();
            String sql = "Select * from employee";
            ResultSet resultSet = statement.executeQuery(sql);
            List<UserInformation> userInformations = new ArrayList<>();
            while (resultSet.next()) {
                UserInformation userInformation = new UserInformation();
                userInformation.id = resultSet.getInt("id");
                userInformation.fullName = resultSet.getString("full_name");
                userInformation.age = resultSet.getInt("age");
                userInformation.address = resultSet.getString("address");
                userInformation.contactNumber = resultSet.getString("contact_number");
                userInformations.add(userInformation);
            }
            return userInformations;
        } finally {
            closeConnection();
        }
    }
}
