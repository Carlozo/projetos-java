package ex3pitagoras;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ex3Pitagoras extends JFrame{
    JLabel tit,subt,catA,catB,hip;
    JTextField a,b,hipotenusa;
    JButton calc;
    
    public Ex3Pitagoras(){
        super("teorema de pitágoras");
        Container tela = getContentPane();
        setLayout(null);
        
        tit = new JLabel("Teorema de Pitágoras");
        subt = new JLabel("c2 = a2 + b2");
        catA = new JLabel("cateto A: ");
        a = new JTextField(5);
        catB = new JLabel("cateto B");
        b = new JTextField(5);
        calc = new JButton("calcular");
        hip = new JLabel("hipotenusa: ");
        hipotenusa = new JTextField(5);
        
        tit.setFont(new Font("Arial",Font.BOLD,20));
        tit.setBounds(15,10,250,20);
        subt.setBounds(60,40,100,20);
        catA.setBounds(15,70,100,20);
        a.setBounds(90,70,80,20);
        catB.setBounds(15,100,100,20);
        b.setBounds(90,100,80,20);
        calc.setBounds(15,130,200,20);
        hip.setBounds(50,190,100,20);
        hipotenusa.setBounds(120,190,80,20);
        
        calc.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int catetoA,catetoB;
                        double hip=0;
                        
                         catetoA = Integer.parseInt(a.getText());
                         catetoB = Integer.parseInt(b.getText());
                         hip = Math.sqrt(Math.pow(catetoA, 2)+Math.pow(catetoB, 2));
                         
                         hipotenusa.setVisible(true);
                         hipotenusa.setText(""+hip);
                    }
                }
        );
        
        tela.add(tit);
        tela.add(subt);
        tela.add(catA);
        tela.add(a);
        tela.add(catB);
        tela.add(b);
        tela.add(calc);
        tela.add(hip);
        tela.add(hipotenusa);
        
        setSize(250,320);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Ex3Pitagoras app = new Ex3Pitagoras();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
