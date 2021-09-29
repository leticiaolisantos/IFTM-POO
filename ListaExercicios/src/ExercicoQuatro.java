import java.util.Scanner;

public class ExercicoQuatro {
    
    public static void main(String[] args) {

        System.out.println("Digite uma velocidade em km/h: ");
        Scanner entrada = new Scanner(System.in);

        String digite = entrada.nextLine();
        float kmPorHora = Float.parseFloat(digite);

        float MetrosPorSegundo = kmPorHora / 36;

        System.out.println("A velocidade em metros por segundo é: " + MetrosPorSegundo);        
    }
}
