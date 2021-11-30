package pgtelalogin;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PgTelaLogin extends JFrame{
    JLabel tit,txtlogin,txtsenha;
    JTextField login;
    JPasswordField senha;
    JButton ok,cancel;
    
    public PgTelaLogin(){
        super("tela login");
        Container tela = getContentPane();
        setLayout(null);
        
        tit = new JLabel("Entre com seus dados:");
        txtlogin = new JLabel("Login: ");
        txtsenha = new JLabel("Password: ");
        login = new JTextField(10);
        senha = new JPasswordField(10);
        ok = new JButton ("OK");
        cancel= new JButton ("Cancelar");
        
        tit.setBounds(125,30,300,20);
        txtlogin.setBounds(40,70,100,20);
        txtsenha.setBounds(30,100,100,20);
        login.setBounds(105,70,220,20);
        senha.setBounds(105,100,220,20);
        ok.setBounds(120,150,60,30);
        cancel.setBounds(200,150,100,30);
        
        tit.setForeground(Color.red);
        tit.setFont(new Font("",Font.BOLD,13));
        
        ok.setToolTipText("Confirma os dados");
        cancel.setToolTipText("Sai do programa");
        UIManager.put("ToolTip.background",SystemColor.info);
        
        cancel.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.exit(0);
                    }
                }
        );
        
        tela.add(tit);
        tela.add(txtlogin);
        tela.add(txtsenha);
        tela.add(login);
        tela.add(senha);
        tela.add(ok);
        tela.add(cancel);
        
        setSize(400,300);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        PgTelaLogin app = new PgTelaLogin();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
