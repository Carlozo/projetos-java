package poocanetametodosespeciais;
public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
    //método construtor
    
    public Caneta(String mod){
        this.tampar();
        this.setModelo(mod);
    }
    
    //métodos especiais abaixo☻
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    
    public Boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(boolean t){
        this.tampada = t;
    }
    
    //métodos abaixo♥
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void usar(){
        if(this.tampada == true){
              System.out.println("estado: ERRO! A caneta está tampada e não pode ser utilizada");    
        }else{
            System.out.println("estado: escrevendo");
        }
    }
    
    public void status(){
        System.out.println("modelo: "+this.getModelo());
        System.out.println("ponta: "+this.getPonta());
        System.out.println("cor: "+this.getCor());
        System.out.println("tampada: "+this.getTampada());
        usar();
        System.out.println("---------------------------------------");
    }
    
}
