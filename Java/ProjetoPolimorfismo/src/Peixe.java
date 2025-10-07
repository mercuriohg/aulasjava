public class Peixe extends Animal{
    private String corEscama;

    public Peixe() {
        super();
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Cereal");
    }

    @Override
    public void emitirSom() {
        System.out.println("BBUBUBUBUBU");
    }
    public void fazerBolha(){
        System.out.println("Fez bolha");
    }
}
