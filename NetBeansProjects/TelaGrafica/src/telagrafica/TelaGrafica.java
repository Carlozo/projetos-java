package telagrafica;
import javax.swing.*;
import java.awt.*;

public class TelaGrafica extends JFrame{            //PRA UTILIZAR A TELA GRÁFICA O EXTEND É OBRIGATÓRIO
    
    JLabel rotulo1 , rotulo2, rotulo3, rotulo4; 
    public TelaGrafica (){                          //METODO CONSTRUTOR (DEVE TER O MESMO NOME DA CLASSE)
        super ("iniciação em tela gráfica");        //NOME DA TELA GRÁFICA
        Container tela = getContentPane ();         //JUNTANDO OS ITENS 
        setLayout(null);
        
        rotulo1 = new JLabel ("Nome");              //INSTANCIANDO PRA VIRAR OBJETO
        rotulo2 = new JLabel ("Idade");
        rotulo3 = new JLabel ("Telefone");
        rotulo4 = new JLabel ("Celular");
        
        rotulo1.setBounds (50,20,80,20);            //DEFININDO LARGURA, COMPRIMENTO, TAMANHO E ETC
        rotulo2.setBounds (50,60,80,20);
        rotulo3.setBounds (50,100,100,20);
        rotulo4.setBounds (50,140,80,20);
                
        rotulo1.setForeground(Color.red);           //DEFININDO COR DA FONTE
        rotulo2.setForeground(Color.blue);
        rotulo3.setForeground(new Color(190,152,142));
        rotulo4.setForeground(new Color (201,200,100));
        tela.setBackground(Color.green);
        
        rotulo1.setFont(new Font ("Arial",Font.BOLD,14));   //DEFININDO FONTE
        rotulo2.setFont(new Font ("Comic Sans MS",Font.BOLD,16));
        rotulo3.setFont(new Font ("Courier New",Font.BOLD,18));
        rotulo4.setFont(new Font ("Times New Roman",Font.BOLD,20));
        
        tela.add(rotulo1);                                  //ADICIONANDO VARIAVEL AO CONTAINER 
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        
        setSize (250,400);                                  //CONFIGURANDO A TELA
        setVisible(true);
        setLocationRelativeTo(null);  
    }
            
    public static void main(String[] args) {
        TelaGrafica app = new TelaGrafica();                //INSTANCIANDO 
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
