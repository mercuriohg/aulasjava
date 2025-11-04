public class Urna {
    private boolean aberta;
    private int cand1;
    private int cand2;

    public Urna() {
        this.aberta = aberta;
        this.cand1 = 6;
        this.cand2 = 5;
    }

    public boolean getAberta() {
        return this.aberta;
    }

    public int getCand1() {
        return this.cand1;
    }

    public int getCand2() {
        return this.cand2;
    }

    public boolean setAberta(boolean aberta) {
        if (aberta) {
            System.out.println("O voto poderá ser debitado ao seu candidato.");
        } else {
            System.out.println("Infelizmente você não pôde votar.");
        }
        return aberta;
    }

    public void setCand1(int voto) {
        if (voto == 51) {
            System.out.println("O voto foi para o Candidato 1: ");
            this.cand1++;
        }


    }

    public void setCand2(int voto) {
        if (voto == 55) {
            System.out.println("O voto foi para o Candidato 2:");
            this.cand2++;
        }
    }

    public void urna(){
        System.out.println("=================Urna=================");
        System.out.println("O Candidato 1 tem: " + getCand1() + " voto(s)");
        System.out.println("O Candidato 2 tem: " + getCand2() + " voto(s)");
    }
}
