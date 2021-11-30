package pgcaixamensagem;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PgCaixaMensagem extends JFrame{
    JButton botao1,botao2;
    
    public PgCaixaMensagem(){
        super("mensagem no botão");
        Container tela = getContentPane();
        setLayout(null);
        
        botao1 = new JButton("entrar");
        botao2 = new JButton("sair");
        
        botao1.setBounds(100,50,100,20);
        botao2.setBounds(100,100,100,20);
        
        botao1.setToolTipText("esse botão te encaminha pra próxima tela");
        botao2.setToolTipText("esse botão finalizará a tarefa");
        
        botao2.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.exit(0);
                }
            }
        );
        
        tela.add(botao1);
        tela.add(botao2);
        
        setSize(300,200);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        PgCaixaMensagem app = new PgCaixaMensagem();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
