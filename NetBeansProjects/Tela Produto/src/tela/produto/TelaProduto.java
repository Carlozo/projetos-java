package tela.produto;
import javax.swing.*;
import java.awt.*;

public class TelaProduto extends JFrame{
    JLabel tit,prod,cod,unidade,Eatual,Eminimo,Cvalor,Vvalor,validade,data;
    JTextField c1,c2,c3,c4,c5,c6,c7,c8,c9;
    JButton salvar, fechar;
    
    public TelaProduto(){
        super ("tela cadastro de produto");
        Container tela = getContentPane();
        setLayout (null);
        
        tit = new JLabel ("Cadastro de Produto");
        prod = new JLabel ("Nome do Produto");
        cod = new JLabel ("Código");
        unidade = new JLabel ("Unidade");
        Eatual = new JLabel ("Estoque Atual");
        Eminimo = new JLabel ("Estoque Minímo");
        Cvalor = new JLabel ("Valor Custo");
        Vvalor = new JLabel ("Valor Venda");
        validade = new JLabel ("Validade");
        data = new JLabel ("Data Cadastro");
        c1 = new JTextField (4);
        c2 = new JTextField (3);
        c3 = new JTextField (4);
        c4 = new JTextField (4);
        c5 = new JTextField (2);
        c6 = new JTextField (11);
        c7 = new JTextField (11);
        c8 = new JTextField (10);
        c9 = new JTextField (10);
        
        salvar = new JButton ("Salvar");
        fechar = new JButton ("Fechar");
        
        //------------------------------------------------
        
        tit.setBounds(175,5,350,20);
        
        prod.setBounds(40,20,200,20); 
        c1.setBounds(40,40,100,20);
        
        unidade.setBounds(40,40,100,20);
        Cvalor.setBounds(40,60,200,20);
        data.setBounds(60,80,100,20);
        
        
        Eatual.setBounds(165,40,120,20);
        Vvalor.setBounds(165,60,100,20);
        
        
        cod.setBounds(300,20,100,20);
        Eminimo.setBounds(300,40,120,20);
        validade.setBounds(300,60,100,20);
        
        //-------------------------------------------------
        
        /*tit.setForeground(Color.yellow);
        prod.setForeground(Color.green);
        cod.setForeground(Color.green);
        unidade.setForeground(Color.green);
        Eatual.setForeground(Color.green);
        Eminimo.setForeground(Color.green);
        Cvalor.setForeground(Color.green);
        Vvalor.setForeground(Color.green);
        validade.setForeground(Color.green);
        data.setForeground(Color.green);
        
        tela.setBackground(Color.lightGray);*/
        
        tela.add(tit);
        tela.add(prod);
        tela.add(cod);
        tela.add(unidade);
        tela.add(Eatual);
        tela.add(Eminimo);
        tela.add(Cvalor);
        tela.add(Vvalor);
        tela.add(validade);
        tela.add(data);
        tela.add(c1);
        /*tela.add(c2);
        tela.add(c3);
        tela.add(c4);
        tela.add(c5);
        tela.add(c6);
        tela.add(c7);
        tela.add(c8);
        tela.add(c9);*/
        
        setSize(500,500);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        TelaProduto app = new TelaProduto();
        app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }
    
}
