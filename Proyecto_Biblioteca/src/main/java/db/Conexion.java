
package db;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    private static Connection conexion;
    
    private static final String URL= "jdbc:mysql://localhost/ilib";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public Connection conectar() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
            if(conexion != null){
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            }
            return conexion;
            
        } catch (ClassNotFoundException e) {
            //JOptionPane.showMessageDialog(null, "Error : "+ e);
            //System.out.println("Error" + e);
        }
        return conexion;
    }
    public Connection getInstance() throws SQLException{
        if (conexion == null) {
            conexion = conectar();
        }
        return conexion;
    }
    
    public void cerrar() throws SQLException{
        try {
            conexion.close();
            //JOptionPane.showMessageDialog(null, "Cerro la conexion");
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "Error : "+ e);
            //System.out.println("Error " + e);
            conexion.close();
        }finally{
            conexion.close();
        }
    }
    
}
