import java.util.Scanner;

public class ExercicioQuinze {
    public static void main(String[] args) {
        System.out.println("Informe sua altura: ");
        Scanner entrada = new Scanner(System.in);


        String digiteAltura = entrada.nextLine();
        double altura = Double.parseDouble(digiteAltura);

        System.out.println("Informe seu sexo digitando 1 para Feminino e 2 para Masculino: ");
        String digiteSexo = entrada.nextLine();
        double sexo = Double.parseDouble(digiteSexo);

        if (sexo == 1) {
            double pesoF = ((62.1 * altura) - 44.7);
            System.out.println("Seu peso ideal é " + pesoF);
        } else {
            if (sexo == 2) {
                double pesoM = ((72.2 * altura) - 58);
                System.out.println("Seu peso ideal é " + pesoM);
            } else {
                System.out.println("Sexo informado é inválido");
            }
        }        
    }    
}