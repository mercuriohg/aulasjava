//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     //Classe Pessoa com Herança
        Professor c1 = new Professor("História", 6000);
        c1.setNome("Rodrigo");
        c1.setIdade(56);
        c1.ganharAumento(1.40f);
        c1.mostrarProf();
    }
}