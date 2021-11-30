package pooimc;

public class MenuIMC {
    private int opcao;
    private Imc imc;
    private Situacao sit;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    
    public MenuIMC(){
        this.opcao = -1;
        this.imc = new Imc();
        this.sit = new Situacao();
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
    }
    
    public void executarImc(){
        do {            
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        } while (this.opcao != 5);
    }
    
    public void executarMenuPrincipal(){
        String mensagemMenu = "Selecione uma opção"
        +"\n1 - Cadastrar dados"
        +"\n2 - Consultar dados"
        +"\n3 - Calcular IMC"
        +"\n4 - Verificar situação do IMC"
        +"\n0 - Sair";
        String entradaDados = io.entradaDados(mensagemMenu);
        this.opcao = conversor.stringToInt(entradaDados);
    }
    
    public void avaliarOpcaoEscolhida(){
        switch(this.opcao){
            case 1:
                String mensagemEntrada = "Digite o valor de altura, logo após o de peso";
                double altura = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
                double peso = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
                imc.cadastrarDados(altura,peso);
                break;
            case 2:
                String mensagemImcAtual = "Altura x Peso: \n"+" altura: "+imc.getAltura()+"\n peso: "+imc.getPeso();
                io.saidaDados(mensagemImcAtual);
                break;
            case 3:
                imc.calcularImc();
                String resultado = "Resultado IMC: \n"+imc.getImc();
                io.saidaDados(resultado);
                break;
            case 4:
                String situacao = "Situaçao IMC: \n"+sit.verificarSituacao(imc);
                io.saidaDados(situacao);
                sit.verificarSituacao(imc);
                break;
            case 0:
                System.exit(0);
                break;
        }
    }
}
