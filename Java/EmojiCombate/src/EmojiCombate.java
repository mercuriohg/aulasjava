
public class EmojiCombate {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrota;
    private int empate;

    public EmojiCombate(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrota, int empate){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.setCategoria();
        this.vitorias = vitorias;
        this.derrota = derrota;
        this.empate = empate;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nome) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso<52.2){
            this.categoria = "Inválido";
        }else if (this.peso<=70.3){
            this.categoria = "Leve";
        }else if (this.peso <= 83.9){
             this.categoria="Médio";
        }else if(this.peso<=120.2){
            this.categoria="Pesado";
        }else{
            this.categoria = "Inválido";
        }
 }
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }
    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }


    public void apresentar() {
        System.out.println("=======Apresentação de Lutador=======");
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Origem: "+this.getNacionalidade());
        System.out.println("Idade: "+this.getIdade()+ " anos");
        System.out.println("Altura: "+this.getAltura());
        System.out.println("Pesando: "+this.getPeso()+ " KG");
        System.out.println("Categoria: "+ this.getCategoria());
        System.out.println("Ganhou: "+this.getVitorias());
        System.out.println("Perdeu: " +this.getDerrota());
        System.out.println("Empatou: "+this.getEmpate());
    }

    public void status() {
        System.out.println(getNome());
        System.out.println("Categoria: "+getCategoria());
        System.out.println(getVitorias() + " Vitórias");
        System.out.println(getDerrota()+ " Derrotas");
        System.out.println(getEmpate()+ " Empates");
    }

    public void ganharLuta() {
      setVitorias(getVitorias()+1);
    }

    public void perderLuta() {
      setDerrota(getDerrota()+1);
    }

    public void empatarLuta() {
        setEmpate(getEmpate()+1);
    }
}
