package ex5calc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex5Calc extends JFrame{
    JLabel rot1,rot2,exibir;
    JTextField c1,c2;
    JButton somar,sub,dividir,multi,sair;
    
    public Ex5Calc(){
        super("calculadora");
        Container tela = getContentPane();
        setLayout(null);
        
        exibir = new JLabel("");
        rot1 = new JLabel("1° número: ");
        rot2 = new JLabel("2° número: ");
        c1 = new JTextField(5);
        c2 = new JTextField(5);
        somar = new JButton("somar");
        sub = new JButton("subtrair");
        dividir = new JButton("dividir");
        multi = new JButton("multiplicar");
        sair = new JButton("sair");
        
        exibir.setBounds(15,160,200,20);
        rot1.setBounds(40,20,100,20);
        rot2.setBounds(40,60,100,20);
        c1.setBounds(110,20,180,20);
        c2.setBounds(110,60,180,20);
        
        somar.setBounds(20,100,80,20);
        sub.setBounds(110,100,80,20);
        dividir.setBounds(200,100,80,20);
        multi.setBounds(290,100,100,20);
        sair.setBounds(155,140,100,20);
        
        somar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int num1,num2;
                        int res=0;
                        
                        num1 = Integer.parseInt(c1.getText());
                        num2 = Integer.parseInt(c2.getText());
                        res = num1+num2;
                        
                        exibir.setVisible(true);
                        exibir.setText("Resultado: "+res);
                    }
                }
        );
        exibir.setVisible(false);
        
        sub.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int num1,num2;
                        int res=0;
                        
                        num1 = Integer.parseInt(c1.getText());
                        num2 = Integer.parseInt(c2.getText());
                        res = num1-num2;
                        
                        exibir.setVisible(true);
                        exibir.setText("Resultado: "+res);
                    }
                }
        );
        exibir.setVisible(false);
        
        dividir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        float num1,num2;
                        float res=0;
                        
                        num1 = Integer.parseInt(c1.getText());
                        num2 = Integer.parseInt(c2.getText());
                        res = num1/num2;
                        
                        exibir.setVisible(true);
                        exibir.setText("Resultado: "+res);
                    }
                }
        );
        exibir.setVisible(false);
        
        multi.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int num1,num2;
                        int res=0;
                        
                        num1 = Integer.parseInt(c1.getText());
                        num2 = Integer.parseInt(c2.getText());
                        res = num1*num2;
                        
                        exibir.setVisible(true);
                        exibir.setText("Resultado: "+res);
                    }
                }
        );
        exibir.setVisible(false);
        
        sair.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.exit(0);
                    }
                }
        );
        
        tela.add(exibir);
        tela.add(rot1);
        tela.add(rot2);
        tela.add(c1);
        tela.add(c2);
        tela.add(somar);
        tela.add(sub);
        tela.add(dividir);
        tela.add(multi);
        tela.add(sair);
        
        setSize(425,250);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Ex5Calc app = new Ex5Calc();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
