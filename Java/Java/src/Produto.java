import java.util.Random;

public class Produto {
    private String nomeProd;
    private float precoDeVenda;
    private float precoDeCompra;
    private int codDeBarra;

   public Produto(String nomeProd, float precoDeCompra, int codDeBarra){
       setNomeProd(nomeProd);
       setPrecoDeCompra(precoDeCompra);
       this.precoDeVenda = this.precoDeCompra*1.30f;
       setCodDeBarra(codDeBarra);
   }
   public String getNomeProd(){
       return this.nomeProd;
   }
   public void setNomeProd(String nomeProd){
       if (nomeProd.length() <= 5 || nomeProd == null) {
           this.nomeProd = "Valor Nulo";
           System.out.println("Produto não pôde ser Cadastrado");
       } else {
           this.nomeProd = nomeProd;
           System.out.println("O Produto a ser cadastrado foi o(a): " + this.getNomeProd());

       }
   }
   public float getPrecoDeCompra(){
       return this.precoDeCompra;
   }
   public void setPrecoDeCompra(float precoDeCompra){
       if (precoDeCompra <= 0) {
           System.out.println(this.nomeProd + " não pode ser vendido.");
       } else {
           this.precoDeCompra = precoDeCompra;

       }
   }
   public int getCodDeBarra(){
       return this.codDeBarra ;
   }
   public void setCodDeBarra(int codDeBarra){
       if(codDeBarra <= 0){
           System.out.println("Código de barra não pode ser validado");
       }else{
           this.codDeBarra = codDeBarra;
           /*
           Tentativa de Gerador de código em binário. Mas não está indo para o get final.
           Random escolha = new Random();
           int random = 0;
           int tamanho = codDeBarra-1;
           //Gerador de código de barra simples
           for (int i=0; i<=tamanho; i++) {
               random = escolha.nextInt(2);
           }
           this.codDeBarra = random;
           */
       }

   }
   public void mostrarProduto() {
       System.out.println("\n========= INFORMAÇÕES DO PRODUTO =========");
       System.out.println("Nome: " + this.nomeProd);
       System.out.printf("Preço de Compra: R$ %.2f%n", this.precoDeCompra);
       System.out.printf("Preço de Venda: R$ %.2f%n", this.precoDeVenda);
       System.out.println("Código de Barras: " + this.codDeBarra);
   }
}


