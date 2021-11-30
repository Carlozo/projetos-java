package mostrarsenha;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MostrarSenha extends JFrame {
    JPasswordField caixa;
    JLabel rotulo,exibir;
    JButton mostrar,ocultar;
    
    public MostrarSenha(){
        super ("Mostrar senha");
        Container tela = getContentPane();
        setLayout (null);
        
        //istanciando
        rotulo = new JLabel("senha");
        caixa = new JPasswordField(10);
        exibir = new JLabel("Senha: ");
        ocultar = new JButton("Ocultar");
        mostrar = new JButton("Mostrar");
        exibir.setVisible(false);
        
        rotulo.setBounds(50,20,100,20);
        exibir.setBounds(260,60,200,20);
        caixa.setBounds(50,60,200,20);
        mostrar.setBounds(51,100,80,20);
        ocultar.setBounds(165,100,80,20);
        
        mostrar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String senha = new String(caixa.getPassword());
                        exibir.setVisible(true);
                        exibir.setText(senha);
                }
            }
        );
        
        ocultar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        exibir.setVisible(false);
                    }
                }
        );
        
        tela.add(rotulo);
        tela.add(caixa);
        tela.add(exibir);
        tela.add(mostrar);
        tela.add(ocultar);

        setSize(400,250);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        MostrarSenha app = new MostrarSenha();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
