package hipotenusa;
import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;
public class Hipotenusa {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ba,ca;
        
        ba = Integer.parseInt(JOptionPane.showInputDialog ("digite o valor maior: "));
        ca = Integer.parseInt(JOptionPane.showInputDialog ("agora o valor menor: "));
        JOptionPane.showMessageDialog (null,"a equivale a: "+hipotenusa(ba,ca));
    }
    
    public static double hipotenusa(double b, double c){
        double hip;
        
        hip = (c*c) + (b*b);
        hip = Math.sqrt(hip);
        return hip;
    }
}
