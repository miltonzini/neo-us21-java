
package Main;

import java.sql.*;
import javax.swing.JOptionPane;


public class Main {
    // Atributos de Conexión
    private Connection conectar = null;
    private final String usuario = "root";
    private final String contrasena = "db951hfji";
    private final String db = "neocohorteuno";
    private final String ip = "localhost";
    private final String puerto = "3306";
    private final String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" +  db;
    
    // nota: las credencials son distintas a las usadas en clase
    // porque yo ya tenía configurado mysql previamente
    
    public Connection establecerConexion() {
        try {
            conectar = DriverManager.getConnection(cadena, usuario, contrasena);
            JOptionPane.showMessageDialog(null, "Se generó la conexión");
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se generó la conexión" + e);
        }
        return conectar;
    }
    
    
    
    public static void main(String[] args) {
        Main app = new Main();
        app.establecerConexion();
        
    }
}
