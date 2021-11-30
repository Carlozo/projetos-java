package pooimc;

public class Situacao {
    private String situacao;
    
    public String verificarSituacao(Imc p){
        double valor = p.getImc();
        
        if(valor<18.5){
            situacao = "magreza";
        }else if(valor>=18.5 && valor<=24.9){
            situacao = "peso ideal";
        }else if(valor>=25.0 && valor<=29.9){
            situacao = "acima do peso";
        }else if(valor>=30.0 && valor<=39.9){
            situacao = "obesidade grau 2";
        }else if(valor>=40.0){
            situacao = "obesidade grau 3";
        }
        
        return situacao;
    }
}
