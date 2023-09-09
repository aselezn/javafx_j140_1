package DataBase.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataBaseConnection {
    private static final String URL = DataBaseProperties.get().getProperty("db.url");
    private static final String USER = DataBaseProperties.get().getProperty("db.user");
    private static final String PASSWORD = DataBaseProperties.get().getProperty("db.password");
    private static Connection connection;

    public void connect() throws SQLException {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
        System.out.println("Connected to the database.");
    }

    public static Connection getConnection() { return connection; }
}
