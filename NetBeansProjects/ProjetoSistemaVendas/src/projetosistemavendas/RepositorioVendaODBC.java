package projetosistemavendas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RepositorioVendaODBC extends ConexaoODBC{
    private static RepositorioVendaODBC instancia;
    
    private RepositorioVendaODBC(){
        
    }
    
    public static RepositorioVendaODBC obterInstancia(){
        return null;
    }
    
    public void remover(Venda venda) throws Exception{
        //validação das informações do cliente
        if (venda == null) {
            throw new Exception("A venda não foi instanciado!");
        }
        if (venda.getNumero() == null) {
            throw new Exception ("Informar o número da venda!!");
        }
        if (venda.getNumero().trim().equals("")) {
            throw new Exception ("Informar o o número da venda!");
        }
        
        //abrindo conexão 
        Statement conex = conectar();
        //instrução SQL 
        String sql = "delete from venda where numero = '"+venda.getNumero()+"'";
        
        try{
            conex.execute(sql);
        }catch(SQLException e){
            throw new Exception("Erro ao executar a remoção: "+e.getMessage());
        }
        desconectar();
    }
    
    public void inserir(Venda venda) throws Exception{
        if (venda == null) {
            throw new Exception("A venda não foi instanciado!");
        }
        if (venda.getNumero() == null) {
            throw new Exception ("Informar o número da venda!!");
        }
        if (venda.getNumero().trim().equals("")) {
            throw new Exception ("Informar o o número da venda!");
        }
        if (venda.getData() == null) {
            throw new Exception ("Informar a data da venda!");
        }
        if (venda.getData().trim().equals("")) {
            throw new Exception ("Informar a data da venda!");
        }
        if (venda.getCliente() == null) {
            throw new Exception ("Informar o cpf do cliente!");
        }
        if (venda.getCliente().trim().equals("")) {
            throw new Exception ("Informar o cpf do cliente!!");
        }
        Statement conex = conectar();
        String sql = "INSERT INTO venda (numero,data,cpfCliente) ";
        sql += "VALUES ('" + venda.getNumero() + "' , '" + venda.getData() + "' , '" + venda.getCliente() + "')";
        
        try{
            conex.execute(sql);
        }catch(SQLException e){
            throw new Exception("Erro ao executar a inserção: "+e.getMessage());
        }
        desconectar();
    }
    
    public void atualizar(Venda venda) throws Exception{
        if (venda == null) {
            throw new Exception("A venda não foi instanciado!");
        }
        if (venda.getNumero() == null) {
            throw new Exception ("Informar o número da venda!!");
        }
        if (venda.getNumero().trim().equals("")) {
            throw new Exception ("Informar o o número da venda!");
        }
        if (venda.getData() == null) {
            throw new Exception ("Informar a data da venda!");
        }
        if (venda.getData().trim().equals("")) {
            throw new Exception ("Informar a data da venda!");
        }
        if (venda.getCliente() == null) {
            throw new Exception ("Informar o cpf do cliente!");
        }
        if (venda.getCliente().trim().equals("")) {
            throw new Exception ("Informar o cpf do cliente!!");
        }
        
        Statement conex = conectar();
        
        String sql = "update venda set " + "número = '" + venda.getNumero() 
                + "', " + " data = '" + venda.getData() + "', " + venda.getCliente() + "'"
                + "where numero = '" + venda.getNumero() + "'";
        
                try{
                    conex.execute(sql);
                }catch(SQLException e){
                    throw new Exception("Erro ao executar atualização: "+e.getMessage());
                }
        desconectar();
        
    }
    
    public ArrayList<Venda> listarTodos() throws Exception{
        Statement conex = conectar();
        ArrayList<Venda> retorno = new ArrayList<Venda>();
        String sql = "SELECT numero,data,cpfCliente FROM venda order by data";
        
        try{
            ResultSet rs = conex.executeQuery(sql);
            while(rs.next()){
                Venda venda = new Venda();
                venda.setNumero(rs.getInt("número"));
                venda.setData(rs.getString("data"));
                venda.setCliente(rs.getString("cpf do cliente"));
                retorno.add(venda);
            }
        }catch(SQLException e){
            throw new Exception("Erro ao executar a consulta: "+e.getMessage());
        }
        desconectar();
        return retorno;
    }
}
