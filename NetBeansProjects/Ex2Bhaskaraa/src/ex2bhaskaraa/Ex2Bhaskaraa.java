package ex2bhaskaraa;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ex2Bhaskaraa extends JFrame{
    JLabel tit,subt,a,b,c,x1,x2;
    JTextField campA,campB,campC,campX1,campX2;
    JButton calc;
    
    public Ex2Bhaskaraa(){
        super("calculadora de bhaskara");
        Container tela = getContentPane();
        setLayout(null);
        
        tit = new JLabel("Fórmula de Bhaskara");
        subt = new JLabel("ax2 + bx + c = 0");
        a = new JLabel("Valor de A: ");
        b = new JLabel("Valor de - B: ");
        c = new JLabel("Valor de C: ");
        campA = new JTextField(5);
        campB = new JTextField(5);
        campC = new JTextField(5);
        
        calc = new JButton("calcular");
        x1 = new JLabel("X1: ");
        x2 = new JLabel("X2: ");
        campX1 = new JTextField(5);
        campX2 = new JTextField(5);
        
        tit.setFont(new Font("Arial",Font.BOLD,20));
        tit.setBounds(15,10,250,20);
        subt.setBounds(60,40,100,20);
        a.setBounds(15,70,100,20);
        campA.setBounds(90,70,80,20);
        b.setBounds(15,100,100,20);
        campB.setBounds(90,100,80,20);
        c.setBounds(15,130,100,20);
        campC.setBounds(90,130,80,20);
        calc.setBounds(15,160,200,20);
        x1.setBounds(80,190,100,20);
        campX1.setBounds(120,190,80,20);
        x2.setBounds(80,220,100,20);
        campX2.setBounds(120,220,80,20);
        
        tela.setBackground(new Color(248,252,230));
        
        calc.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int A,B,C;
                        double delta, X1=0,X2=0;
                        
                        A = Integer.parseInt(campA.getText());
                        B = Integer.parseInt(campB.getText());
                        C = Integer.parseInt(campC.getText());
                        
                        delta = (B * B) + (-4 * (A * C));
                        X1 = (double) ((-(B) + Math.sqrt(delta)) / 2 * A);
                        X2 = (double) ((-(B) - Math.sqrt(delta)) / 2 * A);
                        
                        campX1.setVisible(true);
                        campX1.setText(""+X1);
                        
                        campX2.setVisible(true);
                        campX2.setText(""+X2);
                    }
                }
        );
        
        
        tela.add(tit);
        tela.add(subt);
        tela.add(a);
        tela.add(b);
        tela.add(c);
        tela.add(x1);
        tela.add(x2);
        tela.add(campA);
        tela.add(campB);
        tela.add(campC);
        tela.add(campX1);
        tela.add(campX2);
        tela.add(calc);
        
        setSize(250,320);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Ex2Bhaskaraa app = new Ex2Bhaskaraa();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
