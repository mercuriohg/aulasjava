public class Professor extends Pessoa{
    private String formacao;
    private float salario;

    public Professor(String formacao, int salario){
        this.formacao = formacao;
        this.salario = salario;
    }
    //Getters
    public String getFormacao(){
        return this.formacao;
    }
    public float getSalario(){
        return this.salario;
    }
    //Setters
    public void setFormacao(String formacao){
        this.formacao = formacao;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }

    //Métodos
    public void ganharAumento(float aumento){
        if (aumento >= 0){
            this.salario = this.salario*aumento;
        }
        else{
            System.out.println("O(a) Professor(a) " + getNome() + " não recebeu aumento.");
        }
    }
    public void mostrarProf(){
        System.out.println("===========Registro de Professor============");
        System.out.println("Nome: " + getNome());
        System.out.println("Formação: " + getFormacao());
        System.out.println("Salário: " + getSalario());
        System.out.println("Idade: " + getIdade() + " anos");

    }
}
