package exemploprofessor;
import javax.swing.JOptionPane;
public class ExemploProfessor {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog (null, "a seguir serão mostrados os dados dos metodos da classe Professor");
        
        Professor novoProfessor = new Professor();
        novoProfessor.nome = "James Mc.Govern";
        novoProfessor.sexo = "masculino";
        novoProfessor.pais = "Irlanda";
        novoProfessor.formacao = "música";
        
        novoProfessor.estuda();
        novoProfessor.ministraAula();
        novoProfessor.explicaMateria();
        novoProfessor.corrigeProva();
        novoProfessor = null;
    }
    
}
