package pootrinangulo;
public class MenuTriangulo {
    private Triangulo triangulo;
    private Verifica verifica;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    private int opcao;
    
    public MenuTriangulo(){
        this.opcao = -1;
        this.triangulo = new Triangulo();
        this.verifica = new Verifica();
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
    }
    
    public void executarTriangulo(){
        do {
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        } while (this.opcao != 5);
        
    }
    
    public void executarMenuPrincipal(){
        String mensagemMenu = "Selecione uma opção"
                +"\n1 - Cadastrar Lados"
                +"\n2 - Verificar Lados"
                +"\n3 - Verificar Tipo de Triângulo"
                +"\n4 - Calcular Perimetro"
                +"\n5 - Calcular Area"
                +"\n0 - Sair";
        String entradaDados = io.entradaDados(mensagemMenu);
        this.opcao = conversor.stringToInt(entradaDados);
    }
    
    public void avaliarOpcaoEscolhida(){
        switch(this.opcao){
            case 1:
                String mensagemEntrada = "cadastre os lados";
                double lado1 = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
                double lado2 = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
                double lado3 = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
                triangulo.cadastrarLados(lado1, lado2, lado3);
                break;
            case 2:
                String mensagemLados = "lados cadastrados: "
                +"\nlado 1: "+triangulo.getLado1()
                +"\nlado 2: "+triangulo.getLado2()
                +"\nlado 3: "+triangulo.getLado3();
                io.saidaDados(mensagemLados);
                break;
            case 3:
                verifica.verificarTipo(triangulo);
                String mensagemTipo = "tipo de triângulo: "+triangulo.getTipo();
                io.saidaDados(mensagemTipo);
                break;
            case 4:
                verifica.calcularPerimetro(triangulo);
                String mensagemPeri = "perímetro do triângulo: "+verifica.calcularPerimetro(triangulo);
                io.saidaDados(mensagemPeri);
                break;
            case 5:
                verifica.calcularArea(triangulo);
                String mensagemArea = "area do triângulo "+verifica.calcularArea(triangulo);
                io.saidaDados(mensagemArea);
                break;
            case 0:
                System.exit(0);
                break;
        }
    }
}
