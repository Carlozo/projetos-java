package pgfuncionario;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PgFuncionario extends JFrame{
    JLabel nome,depend,sexo;
    JTextField lab;
    JRadioButton sim,nao;
    ButtonGroup grupo;
    JComboBox lista;
    String escolhaSexo[] = {"Masculino","Feminino","Não definido"};
    JButton mostrar;
    
    
    public PgFuncionario(){
        super("tela funcionário");
        Container tela = getContentPane();
        tela.setLayout(null);
        
        nome = new JLabel("Nome:");
        lab = new JTextField(10);
        depend = new JLabel("Dependentes:");
        sexo = new JLabel("Sexo:");
        mostrar = new JButton("Mostrar");
        sim = new JRadioButton("Sim");
        nao = new JRadioButton("Não");
        lista = new JComboBox(escolhaSexo);
        grupo = new ButtonGroup(); //junta num grupo as opções do radio
        
        grupo.add(sim);
        grupo.add(nao);
        
        nome.setBounds(10,10,100,20);
        lab.setBounds(100,10,190,20);
        depend.setBounds(10,50,100,20);
        sim.setBounds(100,50,50,20);
        nao.setBounds(160,50,50,20);
        sexo.setBounds(10,90,100,20);
        lista.setBounds(100,90,100,20);
        mostrar.setBounds(100,150,80,20);
        
        mostrar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String nom,depend,sexo;
                        nom = (lab.getText());
                        depend = (sim.getText());
                        depend = (nao.getText());
                        
                        JOptionPane.showMessageDialog(null,"nome: "+nom+"\ndependentes: "+depend,"confirmação de dados",JOptionPane.PLAIN_MESSAGE,null);
                        
                    }
                }
        );
        
        tela.add(nome);
        tela.add(depend);
        tela.add(lab);
        tela.add(sexo);
        tela.add(mostrar);
        tela.add(sim);
        tela.add(nao);
        tela.add(lista);
        
        setSize(320,300);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        PgFuncionario app = new PgFuncionario();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
