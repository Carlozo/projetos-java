package banco;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //método construtor
    
    public ContaBanco(){
        this.setStatus(false);
        this.setSaldo(0);
    }
    
    //estado atual
    public void estadoAtual(){
        System.out.println("---------------------------------------------------------");
        System.out.println("conta: "+this.getNumConta());
        System.out.println("tipo de conta: "+this.getTipo());
        System.out.println("dono: "+this.getDono());
        System.out.println("saldo: "+this.getSaldo());
        System.out.println("status de conta: "+this.getStatus());
        System.out.println("---------------------------------------------------------");
    }
    
    //metodos especiais
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int nc){
        this.numConta = nc;     
    }
    
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tip){
        this.tipo = tip;
    }
    
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
    
    public Float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float sal){
        this.saldo = sal;
    }
    
    public Boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean stat){
        this.status = stat;
    }
    
    //métodos normais
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        
        if(t == "CC"){
            this.setSaldo(50);
        }else if(t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("conta aberta com sucesso");
    }
    
    public void fecharConta(){
        
        if(this.getSaldo()>0){
            System.out.println("existe capital na conta! impossivel realizar ação");
        }else if(this.getSaldo()<0){
            System.out.println("conta em débito! impossivel realizar ação");
        }else{
            this.setStatus(false);
        }
        System.out.println("conta fechada com sucesso");
    }
    
    public void depositar(float v){
        if(this.getStatus() == true){
            this.setSaldo(this.getSaldo()+v);
              System.out.println("depósito realizado com sucesso  na conta de "+this.getDono());
        }else{
            System.out.println("conta fechada, impossivel depositar!");
        }
    }
    
    public void sacar(float v){
         if(this.getStatus()==true){
             if(this.getSaldo()>=v){
                 this.setSaldo(this.getSaldo() - v);
                 System.out.println("saque realizado com sucesso");
             }else{
                 System.out.println("saldo insuficiente");
             }
         }else{
             System.out.println("impossivel sacar, conta fechada!");
         }
    }
    
    public void pagarMensal(){
        float v = 0;
        
        if(this.getTipo() == "CC"){
            v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        }
        
        if(this.getStatus() == true){
            if(this.getSaldo()>v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("mensalidade paga");
            }else{
                System.out.println("saldo insuficiente");
            }
        }else{
            System.out.println("impossivel pagar");
        }
    }
  
}
