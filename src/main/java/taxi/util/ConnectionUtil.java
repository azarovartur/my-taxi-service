package taxi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    private static final String URL = "jdbc:mysql://"
            + "db-mysql-azarov-do-user-12510028-0.b.db.ondigitalocean.com:25060/taxi";
    private static final String USERNAME = "doadmin";
    private static final String PASSWORD = "AVNS_pYb_UZHPb24K8xOTb1F";
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Can't find SQL Driver", e);
        }
    }

    public static Connection getConnection() {
        Properties dbProperties = new Properties();
        dbProperties.setProperty("user", USERNAME);
        dbProperties.setProperty("password", PASSWORD);
        try {
            return DriverManager.getConnection(URL, dbProperties);
        } catch (SQLException e) {
            throw new RuntimeException("Can't create connection to DB ", e);
        }
    }
}
