import java.util.Scanner;
public class Frequencia {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe o seu nome: \n");
		
		String nome_pessoa = sc.nextLine();
		
		System.out.printf("Informe a sua frequência cardiaca: \n");
		
	    int frq_bpm = sc.nextInt();

		if (frq_bpm < 60){
			System.out.printf("%s, sua frequência cardiaca está muito baixa. Ela é de %d bpm.", nome_pessoa, frq_bpm);
		}else if (frq_bpm >= 60 && frq_bpm <= 100){
            System.out.printf("%s, sua frequência cardiaca está normal. Ela é de %d bpm.", nome_pessoa, frq_bpm);
		}else{
			System.out.printf("%s, sua frequência cardiaca está muito alta, você está sofrendo uma taquicardia. Ela é de %d bpm.",  nome_pessoa, frq_bpm);
		}
		
 }
}

