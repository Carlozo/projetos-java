package limparcaixa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LimparCaixa extends JFrame{
    JLabel rot1,rot2;
    JTextField text1,text2;
    JButton limpar;
    
    public LimparCaixa(){
        super("Limpar area de texto");
        Container tela = getContentPane();
        setLayout(null);
        
        rot1 = new JLabel ("1° campo");
        rot2 = new JLabel ("2° campo");
        text1 = new JTextField (5);
        text2 = new JTextField (5);
        limpar = new JButton ("Limpar");
        
        rot1.setBounds(50,20,100,20);
        rot2.setBounds(50,60,100,20);
        text1.setBounds(120,20,200,20);
        text2.setBounds(120,60,200,20);
        limpar.setBounds(150,100,80,20);
        
        tela.add(rot1);
        tela.add(rot2);
        tela.add(text1);
        tela.add(text2);
        tela.add(limpar);
        
        limpar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        text1.setText(null);
                        text2.setText(null);
                        text1.requestFocus();
                    }
            }
        );
        
        setSize(400,250);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        LimparCaixa app = new LimparCaixa();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
