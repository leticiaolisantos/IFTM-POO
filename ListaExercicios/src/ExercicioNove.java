import java.util.Scanner;

public class ExercicioNove {

    public static void main(String[] args) {

        System.out.println("Digite o cateto A: ");
        Scanner entrada = new Scanner(System.in);

        String digiteA = entrada.nextLine();
        double catetoA = Double.parseDouble(digiteA);

        System.out.println("Digite o cateto B: ");
        String digiteB = entrada.nextLine();
        double catetoB = Double.parseDouble(digiteB);

        double hipotenusa = (Math.sqrt((Math.pow(catetoA, 2)) + (Math.pow(catetoB, 2))));

        System.out.println("A hipotenusa do triângulo é: " + hipotenusa);        
    }    
}
