import java.util.Scanner;

public class ExercicioQuatorze {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner entrada = new Scanner(System.in);

        String digite = entrada.nextLine();
        double valor = Double.parseDouble(digite);

        if (valor >=  0) {
            double quadrado = Math.pow(valor, 2);
            System.out.println("O número digitado ao quadrado é: " + quadrado);
            double raizQuadrada = Math.sqrt(valor);
            System.out.println("A raiz quadrada do número digitado é: " + raizQuadrada);
        } else {
            System.out.println("Valor digitado é negativo");
        }        
    }    
}