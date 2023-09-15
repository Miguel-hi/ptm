package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Database {
    
    protected Connection conexion;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost/ilib";
    private final String USER = "root";
    private final String CLAVE = "";
    
   public void Conectar() throws ClassNotFoundException{
        try {
            conexion = DriverManager.getConnection(URL, USER, CLAVE);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        Class.forName(JDBC_DRIVER);
    }
    public void Cerrar() throws SQLException{
        if(conexion != null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
    }
public Connection getConexion() {
        return conexion;
    }
}