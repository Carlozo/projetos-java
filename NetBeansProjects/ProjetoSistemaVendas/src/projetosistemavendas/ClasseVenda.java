package projetosistemavendas;
import java.util.ArrayList;

public class ClasseVenda {
    private String data;
    private int numero;
    private ArrayList<ClasseItemVenda> itensDaVenda;
    private ClasseCliente cliente;
    
    public ClasseVenda(){
        this.itensDaVenda = new ArrayList<ClasseItemVenda>();
        this.cliente = new ClasseCliente();
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<ClasseItemVenda> getItensDaVenda() {
        return itensDaVenda;
    }
    public void setItensDaVenda(ArrayList<ClasseItemVenda> itensDaVenda) {
        this.itensDaVenda = itensDaVenda;
    }

    public ClasseCliente getCliente() {
        return cliente;
    }
    public void setCliente(ClasseCliente cliente) {
        this.cliente = cliente;
    }
    
    //----------------------------------------------------
    
    public float getValorTotal(){
        float retorno = 0;
        for (int i = 0; i < this.itensDaVenda.size(); i++){
            float valor = (float) (this.itensDaVenda.get(i).getQuantidade() * this.itensDaVenda.get(i).getPreco());
            retorno = retorno + valor;
        }
        
        return retorno;
    }
}
