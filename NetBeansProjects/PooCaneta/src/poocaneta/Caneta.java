package poocaneta;
public class Caneta {
    String marca;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
    
    void usar(){
        if(this.tampada == true){
              System.out.println("estado: ERRO! A caneta está tampada e não pode ser utilizada");    
        }else{
            System.out.println("estado: escrevendo");
        }
    }
    
    void status(){
        System.out.println("marca: "+this.marca);
        System.out.println("cor: "+this.cor);
        System.out.println("ponta: "+this.ponta);
        System.out.println("carga: "+this.carga+"%");
        System.out.println("tampada: "+this.tampada);
        usar();
        System.out.println("---------------------------------------------------------");
    }
}
