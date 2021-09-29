import java.util.Scanner;

public class ExercicioVinteEum {

    public static void main(String[] args) {

        System.out.println("Digite um número inteiro entre 1 e 7 para saber o dia da semana: ");
        Scanner entrada = new Scanner(System.in);

        String digite = entrada.nextLine();
        int dia = Integer.parseInt(digite);

        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número digitado é inválido");
                break;
        }        
    }    
}