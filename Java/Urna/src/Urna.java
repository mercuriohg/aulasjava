public class Urna {
    private boolean aberta;
    private boolean fechada;
    private boolean emTeste;

    private int votosCand51;
    private int votosCand55;

    public Urna() {
        this.aberta = false;
        this.fechada = true;
        this.emTeste = false;
        this.votosCand51 = 0;
        this.votosCand55 = 0;
    }

    // Controla o estado da urna
    public boolean setAberta(boolean aberta) {
        this.aberta = aberta;
        this.fechada = !aberta;
        this.emTeste = true;
        System.out.println(aberta ? "✅ A sessão foi aberta." : "❌ A sessão foi fechada.");
        return this.aberta;
    }

    public boolean isAberta() { return aberta; }

    public void setCand1(int voto) {
        if (voto == 51 && aberta) {
            votosCand51++;
            System.out.println("🗳️ Voto registrado para o candidato 51.");
        }
    }

    public void setCand2(int voto) {
        if (voto == 55 && aberta) {
            votosCand55++;
            System.out.println("🗳️ Voto registrado para o candidato 55.");
        }
    }

    public void urna() {
        System.out.println("=========== Resultado da Urna ===========");
        System.out.println("Candidato 51: " + votosCand51 + " voto(s)");
        System.out.println("Candidato 55: " + votosCand55 + " voto(s)");
        System.out.println("=========================================");
    }
}
