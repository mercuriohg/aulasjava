public abstract class Pessoa {
    //Classe abstraida ao máximo de uma pessoa real
    private String nome;
    private int idade;

    public Pessoa(){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade= idade;
    }

    public abstract void votante();
}
