package com.naldana;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private static final String BD2_PREFIX = "jdbc:db2:";
    private static final String MARIADB_PREFIX = "jdbc:mariadb:";
    public static final String BD2_DRIVER = "com.ibm.db2.jcc.DB2Driver";
    public static final String MARIADB_DRIVER = "org.mariadb.jdbc.Driver";

    private static Connection instance;

    private String url;
    private String user;
    private String password;
    private static String driver;
    private java.sql.Connection connection;


    private Connection() throws ClassNotFoundException {
        Class.forName(driver);
    }

    public synchronized static Connection getInstance() throws ClassNotFoundException {
        if (instance == null) {

            instance = new Connection();

        }
        return instance;
    }

    public java.sql.Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static void setDriver(String driver) {
        Connection.driver = driver;
    }

    public void setUrl(String url) {

        String urlPrefix;

        switch (driver) {
            case BD2_DRIVER:
                urlPrefix = BD2_PREFIX;
                break;
            case MARIADB_DRIVER:
                urlPrefix = MARIADB_PREFIX;
                break;
            default:
                urlPrefix = "";
        }
        this.url = urlPrefix + url;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
