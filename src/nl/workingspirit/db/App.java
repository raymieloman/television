package nl.workingspirit.db;

import java.io.FileReader;
import java.sql.*;

public class App {

    public static void main(String[] args) throws SQLException {

        String connectionUrl = "jdbc:mysql://localhost:3306/people?serverTimezone=UTC";
        String sqlSelectAllPersons = "SELECT * FROM person";
        try (Connection conn = DriverManager.getConnection(connectionUrl, "root", "people");

             PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                long id = rs.getLong("ID");
                String firstName = rs.getString("FIRST_NAME");
                String lastName = rs.getString("LAST_NAME");

                System.out.println("firstName:"+ firstName);

                // do something with the extracted data...
            }
        } catch (SQLException e) {
            // handle the exception
            e.printStackTrace();
        }
    }
}
