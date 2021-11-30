package ex4muv;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex4muv extends JFrame{
    JLabel tit,subt,velInicial,aceleracao,tempo,campV,campA,campE;
    JTextField vo,a,t,cV,cA,cE;
    JButton enter;
    
    public Ex4muv(){
        super("MUV");
        Container tela = getContentPane();
        setLayout(null);
        
        tit = new JLabel("MUV");
        subt = new JLabel("v=Vo+a.t");
        velInicial = new JLabel("vel. inicial: ");
        aceleracao = new JLabel("aceleração: ");
        tempo = new JLabel("tempo: ");
        vo = new JTextField(5);
        a = new JTextField(5);
        t = new JTextField(5);
        enter = new JButton("calcular");
        
        campV = new JLabel("velocidade inicial: ");
        cV = new JTextField(5);
        campA = new JLabel("aceleração: ");
        cA = new JTextField(5);
        campE = new JLabel("momento exato: ");
        cE = new JTextField(5);
        
        tit.setFont(new Font("Arial",Font.BOLD,20));
        tit.setBounds(90,10,250,20);
        subt.setBounds(90,40,100,20);
        velInicial.setBounds(15,70,100,20);
        vo.setBounds(90,70,80,20);
        aceleracao.setBounds(15,100,100,20);
        a.setBounds(90,100,80,20);
        tempo.setBounds(15,130,100,20);
        t.setBounds(90,130,80,20);
        
        enter.setBounds(15,160,200,20);
        campV.setBounds(15,190,130,20);
        cV.setBounds(135,190,80,20);
        campA.setBounds(15,220,100,20);
        cA.setBounds(135,220,80,20);
        campE.setBounds(15,250,100,20);
        cE.setBounds(135,250,80,20);
        
        enter.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        float v,Vo,A,T;
                        
                         Vo = Integer.parseInt(vo.getText());
                         A = Integer.parseInt(a.getText());
                         T = Integer.parseInt(t.getText());
                         
                         cV.setVisible(true);
                         cV.setText(""+Vo);
                         
                         cA.setVisible(true);
                         cA.setText(A+" m/s2");
                         
                         v = Vo+(A*6);
                         
                         cE.setVisible(true);
                         cE.setText(""+v);
                    }
                }
        );
        
        tela.add(tit);
        tela.add(subt);
        tela.add(velInicial);
        tela.add(vo);
        tela.add(aceleracao);
        tela.add(a);
        tela.add(tempo);
        tela.add(t);
        tela.add(enter);
        tela.add(campV);
        tela.add(campE);
        tela.add(campA);
        tela.add(cV);
        tela.add(cE);
        tela.add(cA);
        
        setSize(250,320);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Ex4muv app = new Ex4muv();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
