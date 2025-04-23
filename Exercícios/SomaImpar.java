public class SomaImpar {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 99; i += 2) {
            soma += i;
        }

        System.out.println("A soma dos números ímpares de 1 a 99 é: " + soma);
    }
}
