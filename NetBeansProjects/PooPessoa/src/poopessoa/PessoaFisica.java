package poopessoa;

public class PessoaFisica extends Pessoa{
    private long cpf;
    private String rg;
    
    public long getCpf(){
        return this.cpf;
    }
    public void setCpf(long c){
        this.cpf = cpf;
    }
    
    public String getRg(){
        return this.rg;
    }
    public void setRg(String r){
        this.rg = rg;
    }
}
