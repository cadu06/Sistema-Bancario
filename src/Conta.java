public class Conta {
    private int numero;
    private String agencia;
    private double saldo;
    public Conta(int numero, String agencia) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0.0; // Saldo inicial é zero
    }
    public String getAgencia() {
        return agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void debitar(double valor) {
        saldo -= valor;
    }
    public void creditar(double valor) {
        saldo += valor;
    }
}
