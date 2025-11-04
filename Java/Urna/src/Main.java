import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Chama as classes para criação
      Urna urna = new Urna();
      Eleitor eleitor = new Eleitor();
      //-------------------
        System.out.println("Você foi à urna, a sessão estava aberta? ");
        boolean aberta = scan.nextBoolean();
        scan.nextLine();
        if (urna.setAberta(aberta)){
            System.out.println("====Dados Cadastrais====");
            System.out.println("Insira seu nome: ");
            String nome = scan.nextLine();
            System.out.println("Insira sua idade: ");
            int idade = scan.nextInt();
            eleitor.setNome(nome);
            eleitor.setIdade(idade);
            eleitor.setPodeVotar(idade,true);
            eleitor.votante();
            //Verificação de tudo, vamos ao voto.
            if (idade < 16){
                System.out.println(eleitor.getNome() + " não pôde votar por ter menos de 16 anos segundo a lei brasileira.");
            }
            else{
                System.out.println("Você deseja votar em qual candidato (55 ou 51): ");
                int voto = scan.nextInt();
                urna.setCand1(voto);
                urna.setCand2(voto);
                urna.urna();
            }
        }
        else{
            System.out.println("o eleitor não pôde votar porque sua sessão estava fechada.");
        }


    }
}