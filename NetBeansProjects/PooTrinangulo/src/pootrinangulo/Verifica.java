package pootrinangulo;
public class Verifica {
    private String tipo;
    private double area;
    private double perimetro;

    public void verificarTipo(Triangulo t){
        String tipo = t.getTipo();
        
        if ((t.getLado1()< t.getLado2() + t.getLado3()) && (t.getLado2() < t.getLado1() + t.getLado3()) && (t.getLado3() < t.getLado1() + t.getLado2())) {
            if (t.getLado1() == t.getLado2() && t.getLado3() == t.getLado3()) {
                t.setTipo("Triangulo Equilatero");
            } else if ((t.getLado1() == t.getLado2()) || (t.getLado1() == t.getLado3())) {
                t.setTipo("Triangulo Isosceles");
            } else
                t.setTipo("Triângulo Escaleno");
        } else {
            t.setTipo("Não é um triangulo!");
        }
    }

    public double calcularArea(Triangulo t){
        double lado1 = t.getLado1();
        double lado2 = t.getLado2();
        area = (lado1*lado2)/2;
        
        return this.area;
    }

    public double calcularPerimetro(Triangulo t){
        double lado1 = t.getLado1();
        double lado2 = t.getLado2();
        double lado3 = t.getLado3();
        
        perimetro = lado1 + lado2 + lado3;
        
        return perimetro;
    }
}
