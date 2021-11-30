package mediaaluno;
import javax.swing.JOptionPane;
public class MediaAluno {
    
    public static float n1,n2,media;
    public static void main(String[] args) {
        lerNota();
        calcularMedia();
    }
    
    public static void lerNota (){
        n1 = Float.parseFloat (JOptionPane.showInputDialog("primeira nota: "));
        n2 = Float.parseFloat (JOptionPane.showInputDialog("segunda nota: "));
    }

    public static void calcularMedia (){
        media = (n1+n2)/2;
        
        JOptionPane.showMessageDialog (null, "MEDIA "+media);
        if (media>7){
            JOptionPane.showMessageDialog (null, "APROVADO");
        }else if(media<7){
            JOptionPane.showMessageDialog(null, "REPROVADO");
            }
    }
}