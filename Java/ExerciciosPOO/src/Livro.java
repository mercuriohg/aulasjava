
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPagina, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.pagAtual = 0;
        this.aberto = false;
        this.totPagina = totPagina;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPagina() {
        return this.totPagina;
    }

    public void setTotPagina(int totPagina) {
        this.totPagina = totPagina;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }


    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Título: " + this.titulo + " , Autor: " + this.autor + " , Total de Páginas: " + this.totPagina + " , Página Atual: " + this.pagAtual + " , Aberto: " + this.aberto + " , Leitor: " + this.leitor.getNome();
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        setAberto(true);
        if (p > this.totPagina){
            this.pagAtual = 0;
        }
        else{
            this.pagAtual = p;

        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
        System.out.println("Avancei para a página: " + this.pagAtual);
    }


    @Override
    public void voltarPag() {
        this.pagAtual--;
        System.out.println("Voltei para a página: " + this.pagAtual);
    }
}
