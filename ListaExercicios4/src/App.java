public class App {
    public static void main(String[] args) throws Exception {
        Gato gatoPersa = new Gato("Bob", "persa", 'm', 9, 5);
        Carro carroNovo = new Carro("Chevrolet", "Onix", 2019, "branco");
        Caneta canetaAzul = new Caneta("Azul", "Bic", 2, 5);
        ContaCorrentes contaCorrentesUm = new ContaCorrentes("Nubank", 10);

        float idadeHumana = Gato.calculoIdadeHumana(9);
        float idadeCarro = Carro.calculoIdadeCarro(2019);
        float precoCanetas = Caneta.precoFinal(2, 5);
        float saldoFinal = ContaCorrentes.depositar(50, 25);

        System.out.format("O nome do gato é %s, a raça é %s e tem idade humana %s\n", gatoPersa.nome, gatoPersa.raca, idadeHumana);
        System.out.format("A cor do carro é %s e ele tem %s anos de uso\n", carroNovo.cor, idadeCarro);
        System.out.format("A cor da caneta é %s comprando %s canetas a %s reais totalizam %s\n", canetaAzul.cor, canetaAzul.quantidade, canetaAzul.preco, precoCanetas);
        System.out.format("O saldo inicial da conta corrente é %s reais, após o depósito o saldo final é %s\n", contaCorrentesUm.saldoInicial, saldoFinal);

    }
}
