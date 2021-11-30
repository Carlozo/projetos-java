package poopessoa;

public class Pessoa {
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected String bairro;
    protected long cep;
    protected String cidade;
    protected String estado;
    
    public int conPes(){
        return 0;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public long getCep() {
        return cep;
    }
    public void setCep(long cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void status(){
        System.out.println("nome:"+this.getNome());
        System.out.println("telefone:"+this.getTelefone());
        System.out.println("endereço:"+this.getEndereco());
        System.out.println("bairro:"+this.getBairro());
        System.out.println("cep:"+this.getCep());
        System.out.println("cidade:"+this.getCidade());
        System.out.println("estado:"+this.getEstado());
        System.out.println("--------------------------------------------");
    }
}
