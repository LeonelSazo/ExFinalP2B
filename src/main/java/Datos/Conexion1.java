package Datos;

import java.sql.*;

public class Conexion1 {


    private static final String JDBC_URL = "jdbc:sqlite:C:\\Users\\alumno\\Desktop\\FinalPrograII\\FinalPrograII.db";
    private static final String JDBC_USER = "";
    private static final String JDBC_PASS = "";



    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL);
    }

    public static void close(ResultSet cls){
        try {
            cls.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
