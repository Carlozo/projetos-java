package projetosistemavendas;
import java.sql.*;

public class ConexaoODBC {
    public Connection con;
    public Statement stm;
    static String driverJDBC = "org.sqlite.JDBC";
    static String url = "jdbc:sqlite:sistemaVendas.db";
    String pathAplicacao = "";
    Connection conn = null;
    
    public Statement conectar() throws Exception{
        try{
            Class.forName(driverJDBC);
            con = DriverManager.getConnection(url);
            stm = con.createStatement();
            System.out.println("Conexão com banco estabelecida com sucesso!");
            
        }catch(ClassNotFoundException e){
            throw new Exception("Erro ao conectar-se ao banco de dados "+e.getMessage());
        }catch(Exception sqle){
            throw new Exception("Erro ao conectar-se ao banco de dados "+sqle.getMessage());
        }
        
        return stm;
    }
    
    public void desconectar(){
        try{
            con.close();
        }catch(Exception sqle){  
        }
    }
    
    
}
