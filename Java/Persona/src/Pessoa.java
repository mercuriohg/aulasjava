public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    //Getters
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getSexo(){
        return this.sexo;
    }
    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    // Métodos
    public int fazerAniver(){
        return this.idade++;
    }
}
