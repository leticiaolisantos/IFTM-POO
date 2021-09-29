import java.util.Scanner; 

public class ExercicioOito {

    public static void main(String[] args) {

        System.out.println("Digite o valor do raio de um círculo: ");
        Scanner entrada = new Scanner(System.in);

        String digite = entrada.nextLine();
        double raio = Double.parseDouble(digite);

        double area = Math.PI * (raio * raio);

        System.out.println("A área do círculo é: " + area);      
    }    
}