package poopessoa;
public class PooPessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Marcos Marcolino dos Santos");
        p1.setTelefone("+55 11 97023-6589");
        p1.setEndereco("Rua Francisco Viana");
        p1.setBairro("Jd.Maria das Dores");
        p1.setCidade("São Paulo");
        p1.setEstado("SP");
        
        p1.status();
    }
    
}
