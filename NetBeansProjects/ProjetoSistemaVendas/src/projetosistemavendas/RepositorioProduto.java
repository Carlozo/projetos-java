package projetosistemavendas;
import java.util.ArrayList;

public class RepositorioProduto {
    private ArrayList<ClasseProduto> lista;
    private static RepositorioProduto instanciaRep;
    
    public RepositorioProduto(){
        this.lista = new ArrayList<ClasseProduto>();
    }
    
    public static RepositorioProduto obterInstancia(){
       if(instanciaRep == null){
           instanciaRep = new RepositorioProduto();
       }
       return instanciaRep;
   }
    
    public ArrayList<ClasseProduto> listarTodos(){
        return this.lista;
    }
    
    public void inserir(ClasseProduto produto) throws Exception{
        if (produto == null) {
            throw new Exception("O cliente não foi instanciado");
        }
        if (produto.getCodigoBarras() == null) {
            throw new Exception("Informar o código de barras do produto");
        }
        if (produto.getCodigoBarras().trim().equals("")) {
            throw new Exception("Informar o código de barras do produto");
        }
        if (produto.getDescricao() == null) {
            throw new Exception("Informar a descrição do produto");
        }
        if (produto.getDescricao().trim().equals("")) {
            throw new Exception("Informar a descrição do produto");
        }
        if (produto.getPreco() <=0) {
            throw new Exception("O preço do produto deve ser superior a 0");
        }
        if (this.verificarExistencia(produto) >= 0) {
            throw new Exception("O produto referido ja se encontra cadastrado");
        }
       this.lista.add(produto);
   }
   
   public void remover(ClasseProduto produto) throws Exception{
       if (produto == null) {
           throw new Exception("O cliente não foi instanciado");
       }
       if (produto.getCodigoBarras().trim().equals("")) {
            throw new Exception("Informar o código de barras do produto");
        }
        if (produto.getDescricao() == null) {
            throw new Exception("Informar a descrição do produto");
        }
        if (this.verificarExistencia(produto) == -1) {
           throw new Exception("O referido produto não se encontra cadastrado");
        }
        this.lista.remove(this.verificarExistencia(produto));
   }
   
   public void atualizar(ClasseProduto produto) throws Exception{
       if (produto == null) {
            throw new Exception("O cliente não foi instanciado");
        }
        if (produto.getCodigoBarras() == null) {
            throw new Exception("Informar o código de barras do produto");
        }
        if (produto.getCodigoBarras().trim().equals("")) {
            throw new Exception("Informar o código de barras do produto");
        }
        if (produto.getDescricao() == null) {
            throw new Exception("Informar a descrição do produto");
        }
        if (produto.getDescricao().trim().equals("")) {
            throw new Exception("Informar a descrição do produto");
        }
        if (produto.getPreco() <=0) {
            throw new Exception("O preço do produto deve ser superior a 0");
        }
        if (this.verificarExistencia(produto) < 0) {
           throw new Exception("O referido produto não se encontra cadastrado");
        }
        this.lista.set(this.verificarExistencia(produto), produto);
   }
   
   public int verificarExistencia(ClasseProduto produto){
       int retorno = -1;
       for (int i = 0; i < this.lista.size(); i++) {
           if (produto.getCodigoBarras().trim().equals(this.lista.get(i).getCodigoBarras().trim())) {
               retorno = i;
               break;
           }
       }
       return retorno;
   }
}
