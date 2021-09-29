import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        String digiteIdade = entrada.nextLine();
        int idade = Integer.parseInt(digiteIdade);

        System.out.println("Digite o ano atual: ");
        String digiteAno = entrada.nextLine();
        int anoAtual = Integer.parseInt(digiteAno);

        int anoNasc = anoAtual - idade;
        System.out.println("Seu ano de nascimento é: " + anoNasc);

    }
    
}
