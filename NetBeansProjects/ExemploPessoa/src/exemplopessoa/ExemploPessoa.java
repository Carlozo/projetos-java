package exemplopessoa;
import javax.swing.JOptionPane;
public class ExemploPessoa {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog (null,"a seguir serão mostrados os metodos da classe Pessoa:");
        Pessoa novaPessoa = new Pessoa();
        //atribuindo os valores do atributos
        novaPessoa.nome = "Carlos";
        novaPessoa.sexo = "masculino";
        novaPessoa.pais = "Brasil";
        
        //executando os métodos
        novaPessoa.pessoaAnda();
        novaPessoa.pessoaCorre();
        novaPessoa.pessoaFala();
        novaPessoa.pessoaEstuda();
        novaPessoa.pessoaBrinca();
        novaPessoa = null;
    }
}
