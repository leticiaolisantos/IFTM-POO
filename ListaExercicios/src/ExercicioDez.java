import java.util.Scanner;

public class ExercicioDez {

    public static void main(String[] args) {

        System.out.println("CALCULADORA\n1.Soma\n2.Subtrair\n3.Multiplicar\n4.Dividir");
        System.out.println("Digite a opção desejada (1, 2, 3 ou 4): ");
        Scanner entrada = new Scanner(System.in);

        String digiteOpcao = entrada.nextLine();
        int opcao = Integer.parseInt(digiteOpcao);

        System.out.println("Digite o primeiro valor: ");
        String digiteValor1 = entrada.nextLine();
        float valor1 = Float.parseFloat(digiteValor1);

        System.out.println("Digite o segundo valor: ");
        String digiteValor2 = entrada.nextLine();
        float valor2 = Float.parseFloat(digiteValor2);

        switch (opcao) {
            case 1: {
                float soma = valor1 + valor2;
                System.out.println("A soma dos dois valores é: " + soma);
                break;
            }
            case 2: {
                float subtrair = valor1 - valor2;
                System.out.println("A subtração dos dois valores é: " + subtrair);
                break;
            }
            case 3: {
                float multiplicar = valor1 * valor2;
                System.out.println("A multiplicação dos dois valores é: " + multiplicar);
                break;
            }
            case 4: {
                float dividir = valor1 * valor2;
                System.out.println("A divisão dos dois valores é: " + dividir);
                break;
            }
        }        
    }    
}