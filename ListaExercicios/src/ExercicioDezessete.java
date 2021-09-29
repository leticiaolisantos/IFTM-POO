import java.util.Scanner;

public class ExercicioDezessete {

    public static void main(String[] args) {

        System.out.println("Informe sua idade: ");
        Scanner entrada = new Scanner(System.in);

        String digite = entrada.nextLine();
        int idade = Integer.parseInt(digite);

        if((idade >= 5) && (idade <= 7)){
            System.out.println("Categoria Infantil A");
        } else {
            if ((idade >= 8) && (idade <= 10)){
                System.out.println("Categoria Infantil B");
            } else {
                if((idade >= 11) && (idade <= 13)){
                    System.out.println("Categoria Juvenil A");
                } else {
                    if((idade >= 14) && (idade <= 17)){
                        System.out.println("Categoria Juvenil B");
                    } else {
                        if(idade >= 18){
                            System.out.println("Categoria Sênior");
                        } else {
                            System.out.println("idade menor que 5 anos");
                        }
                    }
                }
            }
        }        
    }    
}