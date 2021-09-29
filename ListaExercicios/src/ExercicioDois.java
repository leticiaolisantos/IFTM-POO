import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        String digiteUm = entrada.nextLine();
        int numeroUm = Integer.parseInt(digiteUm);

        System.out.println("Digite o segundo número: ");
        String digiteDois = entrada.nextLine();
        int numeroDois = Integer.parseInt(digiteDois);

        System.out.println("Digite o terceiro número: ");
        String digiteTres = entrada.nextLine();
        int numeroTres = Integer.parseInt(digiteTres);

        int soma = numeroUm + numeroDois + numeroTres;
        System.out.println("A soma dos três números é: " + soma);
    }
}
