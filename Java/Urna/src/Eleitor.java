public class Eleitor extends Pessoa{
    private boolean podeVotar;
    private Urna voto;

    public Eleitor(){
        this.podeVotar = podeVotar;
        this.voto = new Urna();
    }

    public boolean getPodeVotar(){
        return this.podeVotar;
    }

    public void setPodeVotar(int idade, boolean voto){
        if (voto == true && idade > 16 ){
            System.out.println("O eleitor " + getNome() + " pode votar!");
            this.podeVotar = true;
        }
        else{
            System.out.println("O eleitor não pôde votar!");
        }
    }


    @Override
    public void votante() {
        System.out.println("===========Detalhes do Eleitor===========");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        if (podeVotar){
            System.out.println("O eleitor " + getNome() + " pode votar");
        }
        else{
            System.out.println("O eleitor " + getNome() + " não pode votar");
        }
    }
}

