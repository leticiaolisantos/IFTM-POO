import java.util.Scanner;

public class ExercicioVinteEtres {

    public static void main(String[] args) {

        System.out.println("Para uma equação do 2º grau, digite o valor de A: ");
        Scanner entrada = new Scanner(System.in);

        String digiteA = entrada.nextLine();
        double valorA = Double.parseDouble(digiteA);

        System.out.println("Digite o valor de B: ");
        String digiteB = entrada.nextLine();
        double valorB = Double.parseDouble(digiteB);

        System.out.println("Digite o valor de C: ");
        String digiteC = entrada.nextLine();
        double valorC = Double.parseDouble(digiteC);

        double delta = (Math.pow(valorB, 2)) - 4 * valorA * valorC;
        double valorX1 = ((valorB * (-1)) + (Math.sqrt(delta))) / (2 * valorA);
        double valorX2 = ((valorB * (-1)) - (Math.sqrt(delta))) / (2 * valorA);

        if(valorA == 0){
            System.out.println("Valor de A não pode ser zero. Não é equação de segundo grau");
        } else {
            if(delta < 0){
                System.out.println("Não existe raiz");
            } else {
                if(delta == 0) {
                    System.out.println("Raiz única, no valor de " + valorX1);
                } else {
                    System.out.println("Existem duas raízes reais, x1 = " + valorX1 + ", x2 = " + valorX2);
                }
            }
        }        
    }    
}