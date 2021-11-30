package pooimc;
public class Imc {
    private double peso;
    private double altura;
    private double imc;
    
    public Imc(){
        this(0);
    }
    
    public Imc(double imc){
        this.imc = imc;
        this.altura = altura;
        this.peso = peso;
    }
    
    //--------------------------------------

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
    
    //--------------------------------------
    
    public void cadastrarDados(double altura,double peso){
        this.setAltura(altura);
        this.setPeso(peso);
    }
    
    public double calcularImc(){
        imc = peso/(altura * altura);
        return imc;
    }
}
