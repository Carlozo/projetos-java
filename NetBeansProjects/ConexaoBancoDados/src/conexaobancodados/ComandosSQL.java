package conexaobancodados;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ComandosSQL {
    String pathAplicacao = "";
    String nomeBanco = "professor.db";
    String stringConexao = "";
    Connection conn = null;
    
    public ComandosSQL(){
        
    }
    
    /*==========================================================================
    connect()
    ============================================================================*/
    
    public Connection connect(){
        try{
            pathAplicacao = new File(".").getCanonicalPath();
            System.out.println("Patch de aplicação encontrado: " + pathAplicacao);
        }catch(IOException e){
            System.out.println("Patch de aplicação não encontrado: " + e);
        }
        
        //SQLite connection string
        stringConexao = "jdbc:sqlite:" + "db/" + nomeBanco;
        
        try{
            conn = DriverManager.getConnection(stringConexao);
            DatabaseMetaData meta = conn.getMetaData();
            
            if (conn != null) {
                System.out.println("Conexão com banco de dados estabelecida!");
            }
        }catch(SQLException e){
            System.out.println("Erro na conexão com banco de dados! " + e.getMessage());
        }
        
        return conn;
    }
    
    /*==========================================================================
    createNewDatabase()
    ============================================================================*/
    
    public void createNewDatabase(String fileName) throws SQLException{
        stringConexao = "jdbc:sqlite:" + "db/" + fileName;
        
        try(Connection conn = DriverManager.getConnection(stringConexao)){
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("Um novo banco de dados foi criado!");
            }
        }catch(SQLException e){
            System.out.println("Não foi possivel criar um novo banco de dados! " + e.getMessage());
        }finally{
            conn.close();
        }
    }
    
    /*==========================================================================
    createNewTable()
    ============================================================================*/
    
    public void createNewTable() throws SQLException{
        //SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS professores ("
                + "id integer primary key,"
                + "nome varchar(80) not null,"
                + "idade integer not null"
                + ");";
        
        try(Connection conn = DriverManager.getConnection(stringConexao); Statement stmt = conn.createStatement()){
            //create a new table
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso!");
        }catch(SQLException e){
            System.out.println("Não foi possivel criar a tabela! " + e.getMessage());
        }finally{
            conn.close();
        }
    }
    
    /*==========================================================================
    insert()
    ============================================================================*/
    
    public void insert(String nome,int idade) throws SQLException{
        String sql = "INSERT INTO professores (nome, idade) VALUES (?,?)";
        
        try(Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, nome);
            pstmt.setInt(2, idade);
            pstmt.executeUpdate();
            System.out.println("Professor cadastrado com sucesso!");
        }catch(SQLException e){
            System.out.println("Não foi possivel cadastrar o professor! " + e.getMessage());
        }finally{
            conn.close();
        }
    }
    
    /*==========================================================================
     update()
    ============================================================================*/
    
    public void update(String nome,int idade, int id) throws SQLException{
        String sql = "UPDATE professores SET nome = ?, idade = ? WHERE id = ?";
        
        try(Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, nome);
            pstmt.setInt(2, idade);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
            
            System.out.println("Professor atualizado com sucesso!");
            pstmt.close();
        }catch(SQLException e){
            System.out.println("Não foi possivel alterar o professor! "+e.getMessage());
        }finally{
        conn.close();
    }
    }
    
    /*==========================================================================
     delete()
    ============================================================================*/
    
    public void delete(int id) throws SQLException{
        String sql = "DELETE FROM professores WHERE id = ?";
        
        try(Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Professor deletado com sucesso!");
            pstmt.close();
            
        }catch(SQLException e){
            System.out.println("Não foi possivel deletar o professor! "+e.getMessage());
        }finally{
            conn.close();
        }
    }
    /*==========================================================================
    selectAll()
    ============================================================================*/
    
    public void selectAll() throws SQLException{
        String sql = "SELECT * FROM professores";
        
        try(Connection conn = this.connect(); 
                Statement stmt = conn.createStatement(); 
                ResultSet rs = stmt.executeQuery(sql)){
            System.out.println("dados da tabela: ");
            while (rs.next()) {                
                System.out.println("======================================================");
                System.out.println(rs.getInt("id") + "\n" + 
                        rs.getString("nome") + "\n" + 
                        rs.getInt("idade"));
            }
        }catch(SQLException e){
            System.out.println("Não foi possivel buscar os dados da tabela! " + e.getMessage());
        }finally{
            conn.close();
        }
    }
}
