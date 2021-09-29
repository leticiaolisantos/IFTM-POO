import java.util.Scanner;

public class ExercicioSeis {

    public static void main(String[] args) {

        System.out.println("Digite uma temperatura em graus Celsius: ");
        Scanner entrada = new Scanner(System.in);

        String digite = entrada.nextLine();
        float celsius = Float.parseFloat(digite);

        float fahrenheit = celsius * (9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);        
    }
    
}
