package biologia;


public class Biologia {

    
    public static void main(String[] args) {
        serVivo app = new serVivo();
        Animal a1 = new Animal();
        Mamifero m1 = new Mamifero();
        Homem h1 = new Homem();
        
        h1.tamanho = (float) 1.62;
        h1.sexo = "Feminino";
        h1.numPatas = 2;
        
        m1.nascer();
        System.out.println("sexo: "+h1.sexo);
        System.out.println(h1.numPatas+" patas");
        System.out.println(h1.tamanho+" metros");
        h1.falar();
        m1.crescer();
        m1.morrer();
    }
    
}
