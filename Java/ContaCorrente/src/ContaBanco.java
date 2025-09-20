public class ContaBanco {
    public int idConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.idConta = idConta;
        this.tipoConta = tipoConta;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
        this.saldo = 0;
        this.status = false;
    }

    // Get e Set
    public void setIdConta(int idConta){
           this.idConta = idConta;
    }

    public int getIdConta(){
        return this.idConta;
    }
    //
    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }
    public String getTipoConta(){
        return this.tipoConta;
    }
    //
    public void setDono(String dono){
        this.dono = dono;
    }
    public String getDono(){
        return this.dono;
    }
    //
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public float getSaldo(){
        return this.saldo;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean getStatus(){

        return this.status;
    }
    // Métodos void
    public void estadoAtual(){
        System.out.println("ID: " + this.getIdConta());
        System.out.println("Nome: " + this.getDono());
        System.out.println("Tipo da Conta: " + this.getTipoConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status da Conta: " + this.getStatus());
    }
    public void abrirConta(String t){
        this.setTipoConta(t);
        this.setStatus(true);
        if (this.status == true) {
            if (t == "cc") {
                this.setSaldo(50);
                System.out.println("Seu nome é " + this.dono + ", sua conta é uma Conta Corrente!");
                System.out.printf("Seu saldo é: " + this.saldo+"\n");
            } else if (t == "cp") {
                this.setSaldo(150);
                System.out.println("Seu nome é " + this.dono + ", sua conta é uma Conta Poupança");
                System.out.printf("Seu saldo é: " + this.saldo + "\n");
            }
        }else {
            System.out.println("Não foi possível abrir a conta");
        }

    }
    public void fecharConta(){
            if (this.saldo > 0){
                System.out.println("Essa conta tem dinheiro, não é possível fecha-la.");
            } else if (this.saldo < 0) {
                System.out.println("Essa conta está em dívida, não é possivel fecha-la");
            } else{
                setStatus(false);
                System.out.println("Conta Fechada com Sucesso!");
            }
    }
    public void depositar(float valor){
         if (this.status == true){
             this.saldo = saldo + valor;
             System.out.println("Seu valor novo é: " + this.saldo);
         }else{
             System.out.println("Impossível depositar");
         }
    }
    public void sacar(float valor){
       if (this.status == true){
           if (this.saldo >= valor){
               this.saldo = this.saldo - valor;
               System.out.println("Foi sacado: " + this.saldo);
           } else{
               System.out.println("Saldo insuficiente");
           }
       }else{
           System.out.println("Impossível sacar");

       }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipoConta() == "cc"){
            v = 12;
        }else if (getTipoConta() == "cp"){
            v = 20;
        } if (getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por: " + this.getDono());
            System.out.println("Seu saldo é de: " + this.getSaldo());
        }else {
            System.out.println("Impossivel pagar uma conta fechada");
        }
    }

}
