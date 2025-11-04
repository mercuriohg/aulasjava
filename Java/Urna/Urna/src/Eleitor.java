import java.util.Scanner;

public class Eleitor extends Pessoa {
    private boolean podeVotar;

    public Eleitor() {
        this.podeVotar = false;
    }

    public boolean getPodeVotar() {
        return podeVotar;
    }

    public void setPodeVotar(int idade, boolean urnaAberta) {
        Scanner voto = new Scanner(System.in);
        if (urnaAberta && idade >= 16) {
            this.podeVotar = true;
            if (idade >= 60){
                System.out.println("O eleitor " + getNome() + " pôde votar!");
                System.out.println("O eleitor " + getNome() +" tem escolha de voto.");
                System.out.print("Você quer votar? [Sim - Não] ");
                String vote = voto.nextLine();
                if (vote.equalsIgnoreCase("Sim")){
                    System.out.println("O eleitor tem como escolher o candidato.");
                }
                else{
                    this.podeVotar = false;
                    System.out.println("O eleitor escolheu por não votar.");
                }
            }
        } else {
            this.podeVotar = false;
        }
    }

    @Override
    public void votante() {
        System.out.println("=========== Detalhes do Eleitor ===========");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println(podeVotar ? "✅ Pode votar" : "🚫 Não pode votar");
        System.out.println("===========================================");
    }
}
