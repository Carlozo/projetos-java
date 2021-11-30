package pgjlist;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PgJList extends JFrame{
    JList lista;
    String cidades[] = {"Rio de Janeiro","São Paulo","Minas Gerais","Espirito Santo","Bahia","Pernambuco","Rio Grande do Sul","Acre"};
    JButton exibir;
    
    public PgJList(){
        super ("exemplo JList");
        Container tela = getContentPane();
        setLayout(null);
        
        exibir = new JButton("Exibir");
        lista = new JList(cidades);
        lista.setVisibleRowCount(5); //setando quantas cidades vão aparecer primeiramente
        
        JScrollPane painelRolagem = new JScrollPane(lista); //instanciando a barra de rolagem 
        
        lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//setando pra poder selecionar mais de uma opção
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//setando pra poder selecionar só um
        
        painelRolagem.setBounds(40,50,150,100);
        exibir.setBounds(270,50,100,30);
                
        exibir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        Object selecionados[] = lista.getSelectedValues();
                        String resultados = "Valores selecionados \n";
                        for (int i = 0; i < selecionados.length; i++) {
                            resultados += selecionados[i].toString()+"\n";
                            JOptionPane.showMessageDialog(null,resultados);
                        }
                    }
                }
        );
        
        tela.add(painelRolagem);
        tela.add(exibir);
        setSize(400,250);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        PgJList app = new PgJList();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
