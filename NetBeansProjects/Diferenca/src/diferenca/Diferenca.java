package diferenca;
import javax.swing.JOptionPane;
public class Diferenca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2;
        JOptionPane.showMessageDialog (null, "digite dois números e saiba a diferença entre eles");
        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo número: "));
        diferenc(n1,n2);
    }
    public static void diferenc(int nUm, int nD){
        int sobra;
        
        if (nD<nUm){
            sobra = nUm - nD;
            JOptionPane.showMessageDialog (null,"a diferença entre "+nUm+" e "+nD+" é de "+sobra);
        }else if(nD>nUm){
            sobra = nD - nUm;
            JOptionPane.showMessageDialog (null,"a diferença entre "+nD+" e "+nUm+" é de "+sobra);
        }
    }
}
