import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um número: ");

        Scanner entrada = new Scanner(System.in);

        String digite = entrada.nextLine();
        int numero = Integer.parseInt(digite);

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);
    }
}
