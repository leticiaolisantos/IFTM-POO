import java.util.Scanner;

public class ExercicioVinte {

    public static void main(String[] args) {

        System.out.println("Digite algum mês do ano em valor numérico, de 1 a 12: ");
        Scanner entrada = new Scanner(System.in);

        String digite = entrada.nextLine();
        int mes = Integer.parseInt(digite);

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        int indice = mes - 1;
        System.out.println(meses[indice]);
      
    }    
}