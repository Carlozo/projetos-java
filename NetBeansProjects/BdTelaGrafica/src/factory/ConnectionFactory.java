package factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection(){
        try{
           return DriverManager.getConnection("jdbc:sqlite:projetojava.db"); 
        }catch(SQLException excao){
            throw new RuntimeException(excao);
        } 
    }
}
