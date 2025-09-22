import java.lang.classfile.instruction.SwitchCase;
import java.util.Random;

public class Luta{
    private EmojiCombate desafiado;
    private EmojiCombate desafiante;
    private int round;
    private boolean aprovada;

    public Luta(){
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.round = round;
        this.aprovada = aprovada;
    }

    private EmojiCombate getDesafiado(){

        return this.desafiado;
    }
    private void setDesafiado(EmojiCombate desafiado){

        this.desafiado = desafiado;
    }
    private EmojiCombate getDesafiante(){

        return this.desafiante;
    }
    private void setDesafiante(EmojiCombate desafiante){

        this.desafiante = desafiante;
    }
    private int getRound(){

        return this.round;
    }
    private void setRound(int round){
        this.round = round;
    }
    private boolean getAprovada(){

        return this.aprovada;
    }
    private void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }

    public void marcarLuta(EmojiCombate lut1, EmojiCombate lut2) {
        if (lut1.getCategoria() == lut2.getCategoria() && lut1 != lut2) {
            this.aprovada = true;
            this.desafiado = lut1;
            this.desafiante = lut2;
            System.out.println("É HOJE!!! A luta entre os dos maiores lutadores de Peso " + lut1.getCategoria() + " ELE " + lut1.getNome() + " ENFRENTARÁ " + lut2.getNome());

        }else{
            System.out.println("A luta não pode ser marcada");
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            desafiado.apresentar();
            desafiante.apresentar();
            Random random = new Random();
            int vencedor = random.nextInt(3);
            switch(vencedor){
                case 0:
                    System.out.println("========LUTA========");
                    System.out.println("Empate");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("========LUTA========");
                    System.out.println(this.desafiado.getNome() + " Venceu");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("========LUTA========");
                    System.out.println(this.desafiante.getNome() + " Venceu");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                default:
                    System.out.println("...");
                    break;
            }


        }
    }
}
