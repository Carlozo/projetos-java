package pootrinangulo;
public class Triangulo {
   private double lado1;
   private double lado2;
   private double lado3;
   private String tipo;
   
   public Triangulo(){
       this.lado1 = lado1;
       this.lado1 = lado2;
       this.lado1 = lado3;
       this.tipo = tipo;
   }
   
   //-----------------------------------------------------------------

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
   //-----------------------------------------------------------------
    
    public void cadastrarLados(double lado1,double lado2,double lado3){
       this.setLado1(lado1);
       this.setLado2(lado2);
       this.setLado3(lado3);
   }
}
