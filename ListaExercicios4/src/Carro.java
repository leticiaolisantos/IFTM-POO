public class Carro {
    String marca;
    String modelo;
    int anoFabricacao;
    int idadeCarro;
    String cor;
    
    public Carro(String marca, String modelo, int anoFabricacao, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }

    public void ligarCarro() {
        System.out.println("O carro foi ligado");
    }

    public static int calculoIdadeCarro(int anoFabricacao) {
        int idadeCarro = (2021 - anoFabricacao);
        return idadeCarro;
    }
}