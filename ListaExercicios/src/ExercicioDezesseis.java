import java.util.Scanner;

public class ExercicioDezesseis {
    public static void main(String[] args) {

        System.out.println("Digite o valor do produto: ");
        Scanner entrada = new Scanner(System.in);

        String digiteValor = entrada.nextLine();
        double valorProduto = Double.parseDouble(digiteValor);

        System.out.println("Digite o Estado de destino do produto, MG, SP, RJ ou MS: ");
        String digiteEstado = entrada.nextLine();
        String estadoDestino = digiteEstado;

        switch (estadoDestino) {
            case "MG":
                double calculoMg = valorProduto + ((valorProduto * 7)/100);
                System.out.println("O preço final do produto acrescido do imposto do estado MG é " + calculoMg);
                break;
            case "SP":
                double calculoSp = valorProduto + ((valorProduto * 12)/100);
                System.out.println("O preço final do produto acrescido do imposto do estado SP é " + calculoSp);
                break;
            case "RJ":
                double calculoRj = valorProduto + ((valorProduto * 15)/100);
                System.out.println("O preço final do produto acrescido do imposto do estado RJ é " + calculoRj);
                break;
            case "MS":
                double calculoMs = valorProduto + ((valorProduto * 8)/100);
                System.out.println("O preço final do produto acrescido do imposto do estado MS é " + calculoMs);
                break;
            default:
                System.out.println("Estado digitado é inválido");
        }        
    }
}
