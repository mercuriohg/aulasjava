public class Mamifero extends Animal{
    private String corPelo;

    public Mamifero() {
        super();
        this.corPelo = corPelo;
    }


    //Getters e Setters

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //Polimorfismo de Sobreposição
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("AAAAAAAAAA");
    }
}
