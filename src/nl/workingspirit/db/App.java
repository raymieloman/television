package nl.workingspirit.db;

import java.sql.*;

public class App {

    public static void main(String[] args) throws SQLException {
        String sqlSelectAllPersons = "SELECT * FROM person";
        String connectionUrl = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";

        try (Connection conn = DriverManager.getConnection(connectionUrl, "username", "password");
             PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                long id = rs.getLong("ID");
                String name = rs.getString("FIRST_NAME");
                String lastName = rs.getString("LAST_NAME");

                // do something with the extracted data...
            }
        } catch (SQLException e) {
            // handle the exception
        }
    }
}
