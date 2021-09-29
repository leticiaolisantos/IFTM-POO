import java.util.Scanner;

public class ExercicioTreze {

    public static void main(String[] args) {
        System.out.println("Informe seu salário: ");
        Scanner entrada = new Scanner(System.in);
 
        String digiteSalario = entrada.nextLine();
        float salario = Float.parseFloat(digiteSalario);

        System.out.println("Informe o valor da prestação do Empréstimo: ");
        String digiteEmprestimo = entrada.nextLine();
        float emprestimo = Float.parseFloat(digiteEmprestimo);

        if (emprestimo > ((salario*20)/100)) {
            System.out.println("Empréstimo não concedido");
        } else {
            System.out.println("Empréstimo concedido");
        }        
    }    
}