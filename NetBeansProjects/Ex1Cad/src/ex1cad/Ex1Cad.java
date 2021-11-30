package ex1cad;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class Ex1Cad extends JFrame{
    JLabel tit,nome,end,cidade,bairro,ctel,ccep,estado;
    JTextField Fnome,Fend,Fcidade,Fbairro,Festado;
    JFormattedTextField cep,tel;
    MaskFormatter mascaracep, mascaratel;
    JButton cadastrar,sair;
    
    public Ex1Cad(){
        super ("tela cadastro");
        Container tela = getContentPane();
        setLayout(null);
        
        tit = new JLabel ("Cadastro de Cliente");
        nome = new JLabel ("Nome");
        end = new JLabel ("Endereço");
        cidade = new JLabel ("Cidade");
        bairro = new JLabel ("Bairro");
        ctel = new JLabel ("Telefone");
        ccep = new JLabel ("CEP");
        estado = new JLabel ("Estado");
        
        Fnome = new JTextField(10);
        Fend = new JTextField(10);
        Fcidade = new JTextField(8);
        Fbairro = new JTextField(8);
        Festado = new JTextField(5);
        
        cadastrar = new JButton ("Cadastrar");
        sair = new JButton ("Sair");
        
        tit.setBounds(160,5,150,20);       
        nome.setBounds(50,40,100,20);
        end.setBounds(50,80,100,20);
        cidade.setBounds(50,120,100,20);
        bairro.setBounds(50,160,100,20);
        ctel.setBounds(50,200,100,20);
        ccep.setBounds(50,240,100,20);
        estado.setBounds(50,280,100,20);
        
        Fnome.setBounds(160,40,200,20);     
        Fend.setBounds(160,80,200,20);     
        Fcidade.setBounds(160,120,200,20);     
        Fbairro.setBounds(160,160,180,20);     
        Festado.setBounds(160,280,150,20);    
        
        cadastrar.setBounds(120,320,140,20);
        sair.setBounds(300,320,100,20);
        
        try{
            mascaracep = new MaskFormatter("#####-###");
            mascaratel = new MaskFormatter("(##)#####-####");
            mascaracep.setPlaceholderCharacter('_');
            mascaratel.setPlaceholderCharacter('_');
        }catch(ParseException excp){}
        
        cep = new JFormattedTextField(mascaracep);
        tel = new JFormattedTextField(mascaratel);
        
        cep.setBounds(160,240,100,20);
        tel.setBounds(160,200,100,20);
        
        nome.setFont(new Font("Arial",Font.ITALIC,12));
        
        tit.setForeground(new Color(0,204,255));
        nome.setForeground(Color.red);
        end.setForeground(Color.blue);
        estado.setForeground(Color.blue);
        ccep.setForeground(Color.blue);
        bairro.setForeground(new Color(190,152,142));
        cidade.setForeground(new Color(190,152,142));
        ctel.setForeground(new Color(190,152,142));
        tela.setBackground(new Color(248,252,230));
        
        sair.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.exit(0);
                }
            }
        );
        
        tela.add(tit);
        tela.add(nome);
        tela.add(end);
        tela.add(cidade);
        tela.add(bairro);
        tela.add(ctel);
        tela.add(ccep);
        tela.add(estado);
        tela.add(Fnome);
        tela.add(Fend);
        tela.add(Fcidade);
        tela.add(Fbairro);
        tela.add(Festado);
        tela.add(cep);
        tela.add(tel);
        tela.add(cadastrar);
        tela.add(sair);
        
        setSize(500,500);
        setVisible(true);
    }
            
    public static void main(String[] args) {
        Ex1Cad app = new Ex1Cad();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
