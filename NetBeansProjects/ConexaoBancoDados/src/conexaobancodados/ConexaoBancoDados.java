package conexaobancodados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public class ConexaoBancoDados {

    static String driverJDBC = "org.sqlite.JDBC";
    static String url = "jdbc:sqlite:manutencaoaluno.db";
    static String user = "root";
    static String senha = "";

    public static void main(String[] args) throws SQLException{
        /*Connection conexao = null;
        Connection conn = conexao;
        Statement st = null;
        ResultSet result = null;
        String query = "INSERT INTO aluno VALUES ('2','marcelo','marcelin@hotmail.com','24')";
        String querySelect = "SELECT * from aluno";

        try{
            System.out.println("Carregando Driver JDBC...");
            Class.forName(driverJDBC);
            System.out.println("Driver carregado com sucesso!");
        }catch(Exception e){
            System.out.println("Falha no carregamento! "+e.getMessage());
        }

        System.out.println("-----------------------------------------------------------");

        try{
            System.out.println("Carregando Banco de Dados...");
            Connection con = DriverManager.getConnection(url,user,senha);
            System.out.println("Conexão efetuada com sucesso!");
        }catch(Exception e){
            System.out.println("Falha na conexão! "+e.getMessage());
        }
        
        System.out.println("-----------------------------------------------------------");
        
       try{
            Class.forName(driverJDBC);
            conexao = DriverManager.getConnection(url,user,senha);
            System.out.println("Executando query...");
            st = conexao.createStatement();
            st.executeUpdate(query);
            System.out.println("Query executada com sucesso!");
            st.close();
            conexao.close();
        }catch(Exception e){
            System.out.println("Erro!"+e.getMessage());
        }
        
        System.out.println("-----------------------------------------------------------");
        
        try{
            Class.forName(driverJDBC);
            conexao = DriverManager.getConnection(url,user,senha);
            System.out.println("Consultando dados da tabela...");
            st = conexao.createStatement();
            result = st.executeQuery(querySelect);
            while (result.next()){
                System.out.println("============================================");
                System.out.println("Matricula... " + result.getInt(1));
                System.out.println("Nome........ " + result.getString(2));
                System.out.println("Email....... " + result.getString(3));
                System.out.println("Idade....... " + result.getInt(4));
                
            }
            result.close();
            st.close();
            conexao.close();
        }catch(Exception e){
            System.out.println("Erro!"+e.getMessage());
        }*/
        
        ComandosSQL app = new ComandosSQL();
        app.connect();
        //app.createNewDatabase("professor.db");
        //app.createNewTable();
        app.insert("Souza Paula",48);
        app.update("Paula Souza", 45, 6);
        app.delete(8);
        app.selectAll();
        
        
        /*inserir ("nome",idade)
          alterar ("nome",idade,id)
          deletar (id)*/
    }
}
