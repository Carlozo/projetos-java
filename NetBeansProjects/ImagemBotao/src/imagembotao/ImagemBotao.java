package imagembotao;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImagemBotao extends JFrame{
    JButton botao;
    ImageIcon icone;
    
    public ImagemBotao(){
        super("botão com imagem");
        Container tela = getContentPane();
        setLayout(null);
        
        icone = new ImageIcon("abrir.gif");
        botao = new JButton("Abrir",icone);
        
        botao.setBounds(50,20,100,20);
        tela.add(botao);
        
        setSize(300,150);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        ImagemBotao app = new ImagemBotao();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
