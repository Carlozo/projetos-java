package pgcliente;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PgCliente extends JFrame{
    JLabel tit,nome,email,senha,sexo,estilo,time;
    JTextField labN,labE;
    JPasswordField labS;
    JRadioButton masc,fem;
    ButtonGroup grupo;
    JCheckBox esport,educ,culinaria;
    JButton envia;
    String times[] = {"Flamengo","São Paulo","Corinthians","Santos","Palmeiras","Bahia"};
    JComboBox lista;
    
    public PgCliente(){
        super("tela funcionário");
        Container tela = getContentPane();
        setLayout(null);
        
        tit = new JLabel("Cadastro de Clientes");
        nome = new JLabel("Nome:");
        email = new JLabel("Email:");
        senha = new JLabel("Senha:");
        sexo = new JLabel("Sexo");
        estilo = new JLabel("Estilo de Leitura:");
        time = new JLabel("Time de Futebol:");
        labN = new JTextField(10);
        labE = new JTextField(10);
        labS = new JPasswordField(10);
        masc = new JRadioButton("Masculino");
        fem = new JRadioButton("Feminino");
        grupo = new ButtonGroup();
        esport = new JCheckBox("Esportes");
        educ = new JCheckBox("Educação");
        culinaria = new JCheckBox("Culinária");
        lista = new JComboBox(times);
        lista.setMaximumRowCount(7);
        envia = new JButton("Envia");
        
        
        grupo.add(masc);
        grupo.add(fem);
        
        tit.setBounds(130,20,200,20);
        nome.setBounds(105,50,100,20);
        labN.setBounds(155,50,126,20);
        email.setBounds(105,80,100,20);
        labE.setBounds(155,80,126,20);
        senha.setBounds(105,110,100,20);
        labS.setBounds(155,110,126,20);
        sexo.setBounds(109,150,100,20);
        masc.setBounds(155,140,100,20);
        fem.setBounds(155,165,100,20);
        estilo.setBounds(50,200,100,20);
        esport.setBounds(155,200,100,20);
        educ.setBounds(155,225,100,20);
        culinaria.setBounds(155,250,100,20);
        time.setBounds(53,290,100,20);
        lista.setBounds(155,290,100,20);
        
        envia.setBounds(270,320,80,30);
        
        tit.setFont(new Font("",Font.BOLD,15));
        
        envia.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String nom,email,sexo,leiS,leiE,leiC;
                        nom = (labN.getText());
                        email = (labE.getText());
                        sexo = (masc.getText());
                        sexo = (fem.getText());
                        leiS = (esport.getText());
                        leiE = (educ.getText());
                        leiC = (culinaria.getText());
                        
                        JOptionPane.showMessageDialog(null,"nome: "+nom+"\nemail: "+email+"\nsexo: "+sexo
                        +"\nestilo: "+leiS,"confirmação de dados",JOptionPane.PLAIN_MESSAGE,null);
                    }
                }
        );
        
        tela.add(tit);
        tela.add(nome);
        tela.add(email);
        tela.add(senha);
        tela.add(sexo);
        tela.add(estilo);
        tela.add(time);
        tela.add(labN);
        tela.add(labE);
        tela.add(labS);
        tela.add(envia);
        tela.add(masc);
        tela.add(fem);
        tela.add(esport);
        tela.add(educ);
        tela.add(culinaria);
        tela.add(lista);
        
        setSize(430,410);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        PgCliente app = new PgCliente();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
