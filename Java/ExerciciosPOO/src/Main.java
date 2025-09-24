//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Pessoa[] pessoa = new Pessoa[2];
    Livro[] livro = new Livro[2];
    pessoa[0] = new Pessoa("João", 22, "M");
    pessoa[1] = new Pessoa("Mariana", 28, "F");

    livro[0] = new Livro("1984", "Pedro Pinto", 200, pessoa[0]);
    livro[1] = new Livro("IT: A coisa", "Stephen King", 440, pessoa[1]);
    livro[0].abrir();
    livro[0].folhear(10);
    System.out.println(livro[0].detalhes());

 }
}