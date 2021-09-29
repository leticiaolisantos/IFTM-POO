import java.util.Scanner;

public class ExercicioVinteEdois {

    public static void main(String[] args) {

        System.out.println("Digite um número inteiro qualquer: ");
        Scanner entrada = new Scanner(System.in);

        String digite = entrada.nextLine();
        float numero = Float.parseFloat(digite);

        if((numero % 3 == 0) || (numero % 5 == 0)){
            if((numero % 3 == 0) && (numero % 5 == 0)){
                System.out.println("Número inválido. Esse número é divisível por 3 e 5 simultaneamente");
            } else {
                if (numero % 3 == 0){
                    System.out.println("Esse número é divisível por 3.");
                } else {
                    System.out.println("Esse número é divisível por 5.");
                }
            }
        }        
    }
}