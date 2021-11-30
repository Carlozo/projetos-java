package pgcombocheckradio;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PgComboCheckRadio extends JFrame{
    JLabel rot1,rot2,rot3,texto;
    JCheckBox negrito,italico,normal,negritoitalico;
    JRadioButton tam1,tam2,tam3,tam4;
    ButtonGroup grupo;
    String cor[] = {"sem cor","vermelho","azul","verde","amarelo","branco","preto"};
    JComboBox lista;
    Integer estilo,tamfonte;
    
    public PgComboCheckRadio(){
        super("exemplo combobox,chek box,radio box");
        Container tela = getContentPane();
        setLayout(null);
        
        rot1 = new JLabel("cor");
        rot2 = new JLabel("estilo");
        rot3 = new JLabel("tamanho");
        texto = new JLabel("programa feito em java");
        lista = new JComboBox(cor);
        lista.setMaximumRowCount(7);
        negrito = new JCheckBox("negrito");
        italico = new JCheckBox("itálico");
        normal = new JCheckBox("normal");
        negritoitalico = new JCheckBox("negrito itálico");
        tam1 = new JRadioButton("12");
        tam2 = new JRadioButton("14");
        tam3 = new JRadioButton("16");
        tam4 = new JRadioButton("18");
        grupo = new ButtonGroup();
        
        grupo.add(tam1);
        grupo.add(tam2);
        grupo.add(tam3);
        grupo.add(tam4);
        rot1.setBounds(40,20,70,20);
        rot2.setBounds(200,20,70,20);
        rot3.setBounds(300,20,70,20);
        texto.setBounds(100,200,300,20);
        lista.setBounds(40,50,150,20);
        negrito.setBounds(200,50,100,20);
        italico.setBounds(200,70,100,20);
        normal.setBounds(200,90,100,20);
        negritoitalico.setBounds(200,110,150,20);
        tam1.setBounds(350,50,100,20);
        tam2.setBounds(350,70,100,20);
        tam3.setBounds(350,90,100,20);
        tam4.setBounds(350,110,100,20);
        
        tamfonte=12;
        estilo=Font.PLAIN;
        
        lista.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        if (lista.getSelectedItem().toString() == "sem cor") {
                            texto.setForeground(Color.black);
                        }
                        if (lista.getSelectedItem().toString() == "vermelho") {
                            texto.setForeground(Color.red);
                        }
                        if (lista.getSelectedItem().toString() == "azul") {
                            texto.setForeground(Color.blue);
                        }
                        if (lista.getSelectedItem().toString() == "verde") {
                            texto.setForeground(Color.green);
                        }
                        if (lista.getSelectedItem().toString() == "amarelo") {
                            texto.setForeground(Color.yellow);
                        }
                        if (lista.getSelectedItem().toString() == "branco") {
                            texto.setForeground(Color.white);
                        }
                        if (lista.getSelectedItem().toString() == "preto") {
                            texto.setForeground(Color.black);
                        }
                    }});
        
        tam1.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        tamfonte = 12;
                        texto.setFont(new Font("",estilo,tamfonte));
                    }});
        tam2.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        tamfonte = 14;
                        texto.setFont(new Font("",estilo,tamfonte));
                    }});
        tam3.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        tamfonte = 16;
                        texto.setFont(new Font("",estilo,tamfonte));
                    }});
        tam4.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        tamfonte = 18;
                        texto.setFont(new Font("",estilo,tamfonte));
                    }});
        
        negrito.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        estilo=Font.BOLD;
                        normal.setSelected(false);
                        italico.setSelected(false);
                        negritoitalico.setSelected(false);
                        texto.setFont(new Font("",estilo,tamfonte));
                    }});
        italico.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        estilo=Font.ITALIC;
                        normal.setSelected(false);
                        negrito.setSelected(false);
                        negritoitalico.setSelected(false);
                        texto.setFont(new Font("",estilo,tamfonte));
                    }});
        normal.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        estilo=Font.PLAIN;
                        negrito.setSelected(false);
                        italico.setSelected(false);
                        negritoitalico.setSelected(false);
                        texto.setFont(new Font("",estilo,tamfonte));
                    }});
        negritoitalico.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        estilo=Font.BOLD+Font.ITALIC;
                        normal.setSelected(false);
                        italico.setSelected(false);
                        negrito.setSelected(false);
                        texto.setFont(new Font("",estilo,tamfonte));
                    }});
        
        tela.add(rot1);
        tela.add(rot2);
        tela.add(rot3);
        tela.add(texto);
        tela.add(negrito);
        tela.add(italico);
        tela.add(normal);
        tela.add(negritoitalico);
        tela.add(tam1);
        tela.add(tam2);
        tela.add(tam3);
        tela.add(tam4);
        tela.add(lista);
        
        setSize(500,300);
        setLocationRelativeTo(null);
        setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
        PgComboCheckRadio app = new PgComboCheckRadio();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
