public class Caneta {
    String cor;
    String marca;
    float preco;
    float quantidade;

    public Caneta(String cor, String marca, float preco, float quantidade) {
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public void pegarCaneta(){
        System.out.format("Você pegou a caneta de cor %s", cor);
    }

    public static float precoFinal(float preco, float quantidade) {
        float precoTotal = preco * quantidade;
        return precoTotal;
    }
}