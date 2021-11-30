package poocaneta;
public class PooCaneta {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.marca = "bic";
        c1.cor = "verde";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.carga = 50;
        c1.status();
        
        Caneta c2 = new Caneta();
        c2.marca = "bic";
        c2.cor = "vermelha";
        c2.ponta = 0.9f;
        c2.tampada = true;
        c2.carga = 80;
        c2.status();
    }
    
}
