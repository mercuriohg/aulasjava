import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Urna urna = new Urna();
        Eleitor eleitor = new Eleitor();

        System.out.println("Você foi à urna. A sessão está aberta? (true/false)");
        boolean aberta = scan.nextBoolean();
        scan.nextLine(); // limpa buffer
        urna.urna();
        urna.setAberta(aberta);

        if (urna.isAberta()) {
            System.out.println("==== Dados Cadastrais ====");
            System.out.print("Insira seu nome: ");
            String nome = scan.nextLine();
            System.out.print("Insira sua idade: ");
            int idade = scan.nextInt();

            eleitor.setNome(nome);
            eleitor.setIdade(idade);
            eleitor.setPodeVotar(idade, true);
            eleitor.votante();

            if (eleitor.getPodeVotar()) {
                System.out.print("Escolha seu candidato (51 ou 55): ");
                int voto = scan.nextInt();
                urna.setCand1(voto);
                urna.setCand2(voto);
            }

            urna.urna();
        } else {
            System.out.println("🚫 O eleitor não pôde votar porque a sessão estava fechada.");
        }
    }
}
