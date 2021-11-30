package projetosistemavendas;
public class ClasseItemVenda {
    private float quantidade;
    private float preco;
    private ClasseProduto produto;
    
    public ClasseItemVenda(){
        this.produto = new ClasseProduto();
    }

    public double getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public ClasseProduto getProduto() {
        return produto;
    }
    public void setProduto(ClasseProduto produto) {
        this.produto = produto;
    }
    
    
    
}
