package exemploprofessor;
import javax.swing.JOptionPane;
public class Professor {
    String nome;
    String sexo;
    String pais;
    String formacao;
    
    void ministraAula(){
        JOptionPane.showMessageDialog(null, "ministra aula");
    }
    void estuda(){
        JOptionPane.showMessageDialog(null, "estuda");
    }
    void explicaMateria(){
        JOptionPane.showMessageDialog(null, "explica matéria");
    }
    void corrigeProva(){
        JOptionPane.showMessageDialog(null, "corrige prova");
    }
}
