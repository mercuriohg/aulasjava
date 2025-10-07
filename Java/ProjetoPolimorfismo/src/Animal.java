public abstract class Animal {
    protected float peso;
    protected String nome;
    protected String idade;

    //Construtor

    public Animal() {
        this.peso = peso;
        this.nome = nome;
        this.idade = idade;
    }


    //Getters e Setters


    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}

