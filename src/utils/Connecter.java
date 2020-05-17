package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecter {

    //TODO: Add logger
    private static final String protocol ="jdbc";
    private static final String vendorName =":mysql:";
    private static final String ipAddress ="//3.227.166.251/U05z2x";

    private static final String jdbcUrl = protocol + vendorName + ipAddress;
    private static final String MySQLJDBCDriver ="com.mysql.jdbc.Driver";
    private static final String username ="U05z2x";
    private static final String password ="53688651961";
    private static Connection conn = null;

    // Create DB connection
    public static Connection connect(){
        try{
            Class.forName(MySQLJDBCDriver);
            conn = DriverManager.getConnection(jdbcUrl, username,password);
            System.out.println("Connected to MySQL DB");
        }catch (ClassNotFoundException e){
            System.out.println("Class not found: " + e.getMessage());
        }catch (SQLException e){
            System.out.println("SQL Exception: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Error" + e.getErrorCode());
        }

        return conn;
    }

    // Close DB connection
    public static void disconnect(){
        try{
            if(!conn.isClosed()) {
                conn.close();
            }
            System.out.println("Disconnected from MySQL DB");
        }catch (SQLException e){
            System.out.println("SQL Exception: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Error" + e.getErrorCode());
        }
    }

    // Test DB Connection(s)
    public static void main(String args[]){
        Connecter conn = new Connecter();
        conn.connect();
        conn.disconnect();

    }
}
