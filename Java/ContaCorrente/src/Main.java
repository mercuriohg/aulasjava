//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Criando Usuário 1
        ContaBanco user = new ContaBanco();
        user.setIdConta(1);
        user.setDono("Arthur Gomes Severo");
        user.abrirConta("cp");


        user.depositar(50);
        user.estadoAtual();
    }
}