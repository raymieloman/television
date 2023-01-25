package nl.workingspirit.db;

import java.io.FileReader;
import java.sql.*;

public class App {

    // Very first JDBC example (Java DataBase Connectivity)
    public static void main(String[] args) throws SQLException {

        String connectionUrl = "jdbc:mysql://localhost:3306/people?serverTimezone=UTC";
        String sqlSelectAllPersons = "SELECT id, first_name, last_name FROM person";
        try (Connection conn = DriverManager.getConnection(connectionUrl, "root", "people");

             PreparedStatement preparedStatement = conn.prepareStatement(sqlSelectAllPersons);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                long id = resultSet.getLong("ID");
                String firstName = resultSet.getString("FIRST_NAME");
                String lastName = resultSet.getString("LAST_NAME");

                System.out.println("id: "+id+", firstName: "+ firstName+", lastName: "+lastName);

                // met printf
                System.out.printf("id: %d, firstName: %s, lastname: %s%n", id, firstName, lastName);

                // do something with the extracted data...
            }
        } catch (SQLException e) {
            // handle the exception
            e.printStackTrace();
        }
    }
}
