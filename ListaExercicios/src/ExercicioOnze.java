import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {

        System.out.println("Digite o primeiro valor: ");
        Scanner entrada = new Scanner(System.in);

        String digiteValor1 = entrada.nextLine();
        float valor1 = Float.parseFloat(digiteValor1);

        System.out.println("Digite o segundo valor: ");
        String digiteValor2 = entrada.nextLine();
        float valor2 = Float.parseFloat(digiteValor2);

        if (valor1 > valor2) {
            System.out.println("O primeiro valor é maior");
        } else {
            System.out.println("O segundo valor é maior");
        }        
    }    
}