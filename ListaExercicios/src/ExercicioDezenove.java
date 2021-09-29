import java.util.Scanner;

public class ExercicioDezenove {

    public static void main(String[] args) {

        System.out.println("Digite o primeiro número: ");
        Scanner entrada = new Scanner(System.in);

        String digitePrimeiro = entrada.nextLine();
        float valorUm = Float.parseFloat(digitePrimeiro);

        System.out.println("Digite o segundo número: ");
        String digiteSegundo = entrada.nextLine();
        float valorDois = Float.parseFloat(digiteSegundo);

        System.out.println("Digite o terceiro número: ");
        String digiteTerceiro = entrada.nextLine();
        float valorTres = Float.parseFloat(digiteTerceiro);

        System.out.println("Escolha uma das opções para calcular a Média: 1-Geométrica, 2-Ponderada ou 3-Aritmética: ");
        String digite = entrada.nextLine();
        int opcao = Integer.parseInt(digite);

        float calculo;

        if((valorUm > 0) && (valorDois > 0) && (valorTres > 0)){
            switch(opcao){
                case 1: 
                    calculo = valorUm*valorDois*valorTres;
                    System.out.println("A média Geométrica dos três valores é " + calculo);
                    break;
                case 2:
                    calculo = ((valorUm+(2*valorDois)+(3*valorTres))/6);
                    System.out.println("A média Ponderada dos três valores é " + calculo);
                    break;
                case 3:
                    calculo = ((valorUm+valorDois+valorTres)/3);
                    System.out.println("A média Aritmética dos três valores é " + calculo);
                    break;
            }
        } else {
            System.out.println("Algum valor digitado é menor que zero");
        }        
    }    
}