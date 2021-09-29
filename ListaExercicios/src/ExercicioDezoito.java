import java.util.Scanner;

public class ExercicioDezoito {

    public static void main(String[] args) {

        System.out.println("Informe sua altura: ");
        Scanner entrada = new Scanner(System.in);

        String digiteAltura = entrada.nextLine();
        float altura = Float.parseFloat(digiteAltura);

        System.out.println("Informe seu peso: ");
        String digitePeso = entrada.nextLine();
        float peso = Float.parseFloat(digitePeso);

        if(altura < 1.2){
            if(peso < 60){
                System.out.println("Pessoa está na classificação A");
            } else {
                if((peso >= 60) && (peso <= 90)){
                    System.out.println("Pessoa está na classificação D");
                } else {
                    System.out.println("Pessoa está na classificação G");
                }
            }
        } else {
            if((altura >= 1.2) && (altura <= 1.7)){
                if(peso < 60){
                    System.out.println("Pessoa está na classificação B");
                } else {
                    if((peso >= 60) && (peso <= 90)){
                        System.out.println("Pessoa está na classificação E");
                    } else {
                        System.out.println("Pessoa está na classificação H");
                    }
                }
            } else {
                if(altura > 1.7){
                    if(peso < 60){
                        System.out.println("Pessoa está na classificação C");
                    } else {
                        if((peso >= 60) && (peso <= 90)){
                            System.out.println("Pessoa está na classificação F");
                        } else {
                            System.out.println("Pessoa está na classificação I");
                        }
                    }
                }
            }
        }        
    }    
}