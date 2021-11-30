package DAO;
import factory.ConnectionFactory;
import modelo.User;
import java.sql.*;
import java.sql.PreparedStatement;
        
public class UserDAO {
    private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    
    public UserDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona (User user){
        String sql = "INSERT INTO user (nome,cpf,email,telefone) VALUES (?,?,?,?)";
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getCpf());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getTelefone());
            stmt.execute();
            stmt.close();
            
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
}
