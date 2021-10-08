public class ContaCorrentes {
    String nomeBanco;
    float saldoInicial;
    float deposito;

    public ContaCorrentes(String nomeBanco, float saldoInicial){
        this.nomeBanco = nomeBanco;
        this.saldoInicial = saldoInicial;
    }
    
    public static float depositar(float saldo, float deposito) {
        float saldoFinal = deposito + saldo;
        return saldoFinal;
    }
}