package Fabrica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

    public static Connection getConnection() {

        try {
            String url = "jdbc:mysql://localhost:3306/oficina"; //Nome da base de dados
            String user = "root"; //nome do usuário do MySQL
            String password = ""; //senha do MySQL
            System.out.println("Deu certo");
            return DriverManager.getConnection(url, user, password);
            
        } catch (Exception ex) {
            return (Connection) ex;
        }

    }
}