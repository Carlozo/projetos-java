package projetosistemavendas;
import java.util.ArrayList;

public class RepositorioCliente {
   private ArrayList<ClasseCliente> lista;
   private static RepositorioCliente instanciaRep;
   
   public RepositorioCliente(){
       this.lista = new ArrayList<ClasseCliente>();
   }
   
   public static RepositorioCliente obterInstancia(){
       if(instanciaRep == null){
           instanciaRep = new RepositorioCliente();
       }
       return instanciaRep;
   }
   
   public ArrayList<ClasseCliente> listarTodos(){
       return this.lista;
   }
   
   public void inserir(ClasseCliente cliente) throws Exception{
       if (cliente == null) {
           throw new Exception("O cliente não foi instanciado");
       }
       if (cliente.getCpf() == null) {
           throw new Exception("Informar o CPF do cliente");
       }
       if (cliente.getCpf().trim().equals("")) {
           throw new Exception("Informar o CPF do cliente");
       }
       if (cliente.getNome() == null) {
           throw new Exception("Informar o nome do cliente");
       }
       if (cliente.getNome().trim().equals("")) {
           throw new Exception("Informar o nome do cliente");
       }
       if (this.verificarExistencia(cliente) >= 0) {
           throw new Exception("O referido cliente já se encontra cadastrado");
       }
       this.lista.add(cliente);
   }
   
   public void remover(ClasseCliente cliente) throws Exception{
       if (cliente == null) {
           throw new Exception("o cliente não foi instanciado");
       }
       if (cliente.getCpf() == null) {
           throw new Exception("Informar o CPF do cliente");
       }
       if (cliente.getCpf().trim().equals("")) {
           throw new Exception("Informar o CPF do cliente");
       }
       if (cliente.getNome() == null) {
           throw new Exception("Informar o nome do cliente");
       }
       if (cliente.getNome().trim().equals("")) {
           throw new Exception("Informar o nome do cliente");
       }
       if (this.verificarExistencia(cliente) >= 0) {
           throw new Exception("O referido cliente não se encontra cadastrado");
       }
       this.lista.remove(this.verificarExistencia(cliente));
   }
   
   public void atualizar(ClasseCliente cliente) throws Exception{
       if (cliente == null) {
           throw new Exception("o cliente não foi instanciado");
       }
       if (cliente.getCpf() == null) {
           throw new Exception("Informar o CPF do cliente");
       }
       if (cliente.getCpf().trim().equals("")) {
           throw new Exception("Informar o CPF do cliente");
       }
       if (cliente.getNome() == null) {
           throw new Exception("Informar o nome do cliente");
       }
       if (cliente.getNome().trim().equals("")) {
           throw new Exception("Informar o nome do cliente");
       }
       if (this.verificarExistencia(cliente) >= 0) {
           throw new Exception("O referido cliente não se encontra cadastrado");
       }
       this.lista.set(this.verificarExistencia(cliente),cliente);
   }
   
   public int verificarExistencia(ClasseCliente cliente){
       int retorno = -1;
       for (int i = 0; i < this.lista.size(); i++) {
           if (cliente.getCpf().trim().equals(this.lista.get(i).getCpf().trim())) {
               retorno = i;
               break;
           }
       }
       return retorno;
   }
   
   
}
