public class ExercicioSete {

    public static void main(String[] args) {

        float valorTotal = 780000;

        float primeiro = (valorTotal * 46) / 100;
        float segundo = (valorTotal * 32) / 100;
        float terceiro = (valorTotal - primeiro - segundo);

        System.out.println("O primeiro ganhador receberá 46% de R$780.000, totatlizando R$ " + primeiro);
        System.out.println("O segundo ganhador receberá 32% de R$780.000, totatlizando R$ " + segundo);
        System.out.println("O terceiro ganhador receberá o restante, totatlizando R$ " + terceiro);        
    }    
}
