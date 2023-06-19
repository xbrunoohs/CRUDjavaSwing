
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private static String urlstring = "jdbc:mysql://localhost:3306/matriculaDB";
    private static String driverName = "com.mysql.cj.jdbc.Driver";
    private static String username = "root";
    private static String password = "";
    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(urlstring, username, password);
            } catch (SQLException ex) {
                System.out.println("Falha em criar a database.");
            }
        } catch (ClassNotFoundException ex) {

            System.out.println("Driver nao encontrado." + ex);
        }
        return con;
    }
}