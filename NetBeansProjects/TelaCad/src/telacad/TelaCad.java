package telacad;
import javax.swing.*;
import java.awt.*;

public class TelaCad extends JFrame{
    JLabel tit,nome,cpf,rg,end,cidade,estado,cep;
    JTextField c1,c2,c3,c4,c5,c6,c7;
    
    public TelaCad(){
        super ("tela de cadastro - slide 42");
        Container tela = getContentPane();
        setLayout (null);
        
        tit = new JLabel ("Cadastro de Cliente");
        nome = new JLabel ("Nome: ");
        cpf = new JLabel ("CPF: ");
        rg = new JLabel ("RG: ");
        end = new JLabel ("Endereço: ");
        cidade = new JLabel ("Cidade: ");
        estado = new JLabel ("Eestado: ");
        cep = new JLabel ("CEP: ");
        
        c1 = new JTextField (50);
        c2 = new JTextField (11);
        c3 = new JTextField (9);
        c4 = new JTextField (50);
        c5 = new JTextField (30);
        c6 = new JTextField (20);
        c7 = new JTextField (8);
        
        //----------------------------------------------
        
        tit.setBounds (170,5,300,20);
        
        nome.setBounds (20,30,120,20);
        c1.setBounds (20,50,200,20);
        
        cpf.setBounds (20,70,120,20);
        c2.setBounds (20,90,140,20);
        
        rg.setBounds (20,110,120,20);
        c3.setBounds (20,130,120,20);
        
        end.setBounds (20,150,120,20);
        c4.setBounds (20,170,200,20);
        
        cidade.setBounds (20,190,120,20);
        c5.setBounds (20,210,200,20);
        
        estado.setBounds (20,230,120,20);
        c6.setBounds (20,250,150,20);
        
        cep.setBounds (20,270,120,20);
        c7.setBounds (20,290,130,20);
        
        //------------------------------------------------------
        
        tit.setFont (new Font ("Arial",Font.BOLD,15));
        nome.setFont (new Font ("Arial",Font.PLAIN, 15));
        cpf.setFont (new Font ("Arial",Font.PLAIN, 15));
        rg.setFont (new Font ("Arial",Font.PLAIN, 15));
        end.setFont (new Font ("Arial",Font.PLAIN, 15));
        estado.setFont (new Font ("Arial",Font.PLAIN, 15));
        cidade.setFont (new Font ("Arial",Font.PLAIN, 15));
        cep.setFont (new Font ("Arial",Font.PLAIN, 15));
        
        //------------------------------------------------------
        
        tit.setForeground (Color.red);
        tela.setBackground (Color.lightGray);
        
        tela.add (tit);
        tela.add (nome);
        tela.add (c1);
        tela.add (cpf);
        tela.add (c2);
        tela.add (rg);
        tela.add (c3);
        tela.add (end);
        tela.add (c4);
        tela.add (cidade);
        tela.add (c5);
        tela.add (estado);
        tela.add (c6);
        tela.add (cep);
        tela.add (c7);
        
        setSize (500,500);
        setVisible (true);
        setLocationRelativeTo (null);
    }
    
    public static void main(String[] args) {
        TelaCad app = new TelaCad();
        app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }
    
}
