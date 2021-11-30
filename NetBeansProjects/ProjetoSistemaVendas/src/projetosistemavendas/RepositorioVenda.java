package projetosistemavendas;
import java.util.ArrayList;

public class RepositorioVenda {
    private ArrayList<ClasseVenda> lista;
    private static RepositorioVenda instanciaRep;
    
    public RepositorioVenda(){
        this.lista = new ArrayList<ClasseVenda>();
    }
    
    public static RepositorioVenda obterInstancia(){
        if (instanciaRep == null) {
            instanciaRep = new RepositorioVenda();
        }
        return instanciaRep;
    }
    
    public ArrayList<ClasseVenda> listarTodos(){
        return this.lista;
    }
    
    public void inserir(ClasseVenda venda) throws Exception{
        if (venda == null) {
            throw new Exception("A venda não foi instanciada");
        }
        if (venda.getNumero() <= 0) {
            throw new Exception("Informar o número de venda");
        } 
        if (venda.getData() == null) {
            throw new Exception("Informar a data da venda");
        }
        if (venda.getData().trim().equals("")) {
            throw new Exception("Informar a data da venda");
        }
        if (venda.getItensDaVenda().size() <=0) {
            throw new Exception("Informar pelo menos um item por venda");
        }
        if (this.verificarExistencia(venda) >= 0) {
            throw new Exception("A referida venda ja se encontra cadastrado");
        }
       this.lista.add(venda);
   }
   
   public void remover(ClasseVenda venda) throws Exception{
       if (venda == null) {
            throw new Exception("A venda não foi instanciada");
        }
        if (venda.getNumero() <= 0) {
            throw new Exception("Informar o número de venda");
        } 
        if (this.verificarExistencia(venda) < 0) {
           throw new Exception("A referido venda não se encontra cadastrada");
        }
        this.lista.remove(this.verificarExistencia(venda));
   }
   
   public void atualizar(ClasseVenda venda) throws Exception{
        if (venda == null) {
            throw new Exception("A venda não foi instanciada");
        }
        if (venda.getNumero() <= 0) {
            throw new Exception("Informar o número de venda");
        } 
        if (venda.getData() == null) {
            throw new Exception("Informar a data da venda");
        }
        if (venda.getData().trim().equals("")) {
            throw new Exception("Informar a data da venda");
        }
        if (venda.getItensDaVenda().size() <=0) {
            throw new Exception("Informar pelo menos um item por venda");
        }
        if (this.verificarExistencia(venda) >= 0) {
           throw new Exception("A referido venda já se encontra cadastrada");
        }
        this.lista.set(this.verificarExistencia(venda), venda);
   }
   
   public int verificarExistencia(ClasseVenda venda){
       int retorno = -1;
       for (int i = 0; i < this.lista.size(); i++) {
           if (venda.getNumero() == this.lista.get(i).getNumero()) {
               retorno = i;
               break;
           }
       }
       return retorno;
   }
}
