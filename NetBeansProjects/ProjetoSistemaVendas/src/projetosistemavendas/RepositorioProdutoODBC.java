package projetosistemavendas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RepositorioProdutoODBC extends ConexaoODBC{
    private static RepositorioProdutoODBC instancia;
    
    private RepositorioProdutoODBC(){
        
    }
    
    public static RepositorioProdutoODBC obterInstancia(){
        return null;
    }
    
    public void remover(Produto produto) throws Exception{
        //validação das informações do cliente
        if (produto == null) {
            throw new Exception("O produto não foi instanciado!");
        }
        if (produto.getCodigoBarras() == null) {
            throw new Exception ("Informar o código de barras!");
        }
        if (produto.getCodigoBarras().trim().equals("")) {
            throw new Exception ("Informar o código de barras!");
        }
        
        //abrindo conexão 
        Statement conex = conectar();
        //instrução SQL 
        String sql = "delete from produto where codigoBarras = '"+produto.getCodigoBarras()+"'";
        
        try{
            conex.execute(sql);
        }catch(SQLException e){
            throw new Exception("Erro ao executar a remoção: "+e.getMessage());
        }
        desconectar();
    }
    
    public void inserir(Produto produto) throws Exception{
        if (produto == null) {
            throw new Exception("O produto não foi instanciado!");
        }
        if (produto.getCodigoBarras() == null) {
            throw new Exception ("Informar o código de barras!");
        }
        if (produto.getCodigoBarras().trim().equals("")) {
            throw new Exception ("Informar o código de barras!");
        }
        if (produto.getPreco() == null) {
            throw new Exception ("Informar o preço do produto!");
        }
        if (produto.getPreco().trim().equals("")) {
            throw new Exception ("Informar o preço do produto!");
        }
        if (produto.getDescicao() == null) {
            throw new Exception ("Informar a descrição do produto!");
        }
        if (produto.getDescicao().trim().equals("")) {
            throw new Exception ("Informar a descrição do produto!");
        }
        Statement conex = conectar();
        String sql = "INSERT INTO produto (codigoBarras,descricao,preco) ";
        sql += "VALUES ('" + produto.getCodigoBarras() + "' , '" + produto.getDescricao() + "' , '" + produto.getPreco() + "')";
        
        try{
            conex.execute(sql);
        }catch(SQLException e){
            throw new Exception("Erro ao executar a inserção: "+e.getMessage());
        }
        desconectar();
    }
    
    public void atualizar(Produto produto) throws Exception{
        if (produto == null) {
            throw new Exception("O produto não foi instanciado!");
        }
        if (produto.getCodigoBarras() == null) {
            throw new Exception ("Informar o código de barras!");
        }
        if (produto.getCodigoBarras().trim().equals("")) {
            throw new Exception ("Informar o código de barras!");
        }
        if (produto.getPreco() == null) {
            throw new Exception ("Informar o preço do produto!");
        }
        if (produto.getPreco().trim().equals("")) {
            throw new Exception ("Informar o preço do produto!");
        }
        if (produto.getDescicao() == null) {
            throw new Exception ("Informar a descrição do produto!");
        }
        if (produto.getDescicao().trim().equals("")) {
            throw new Exception ("Informar a descrição do produto!");
        }
        
        Statement conex = conectar();
        
        String sql = "update produto set " + "codigoBarras = '" + produto.getCodigoBarras() 
                + "', " + " descricao = '" + produto.getDescricao() + "'," + "preco = '" + produto.getPreco + "'"
                + "where codigoBarras = '" + produto.getCodigoBarras() + "'";
        
                try{
                    conex.execute(sql);
                }catch(SQLException e){
                    throw new Exception("Erro ao executar atualização: "+e.getMessage());
                }
        desconectar();
    }
    
    public ArrayList<Produto> listarTodos() throws Exception{
        Statement conex = conectar();
        ArrayList<Produto> retorno = new ArrayList<Produto>();
        String sql = "SELECT codigoBarras,descricao,preco FROM produto order by preco";
        
        try{
            ResultSet rs = conex.executeQuery(sql);
            while(rs.next()){
                Produto produto = new Produto();
                produto.setCodigoBarras(rs.getString("código de barras"));
                produto.setDescricao(rs.getString("descrição"));
                produto.setPreco(rs.getFloat("preço"));
                retorno.add(produto);
            }
        }catch(SQLException e){
            throw new Exception("Erro ao executar a consulta: "+e.getMessage());
        }
        desconectar();
        return retorno;
    }
}
