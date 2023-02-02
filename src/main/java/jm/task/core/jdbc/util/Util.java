package jm.task.core.jdbc.util;
import java.sql.*;

public class Util {
    // реализуйте настройку соединения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/users";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public Connection getNewConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
