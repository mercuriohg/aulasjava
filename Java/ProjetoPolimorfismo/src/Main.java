//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Mamifero m = new Mamifero();
       Peixe p = new Peixe();

       m.alimentar();
       m.emitirSom();

       p.alimentar();
       p.emitirSom();


    }
}