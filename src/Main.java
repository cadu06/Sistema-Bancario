public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente conta1 = new ContaCorrente(12345, "001");
        Cliente cliente1 = new Cliente("João", "123.456.789-00", conta1);
        banco.adicionarCliente(cliente1);

        ContaCorrente conta2 = new ContaCorrente(54321, "002");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00", conta2);
        banco.adicionarCliente(cliente2);

        cliente1.getContaCorrente().creditar(1000.0);
        cliente2.getContaCorrente().debitar(500.0);

        for (Cliente cliente : banco.getClientes()) {
            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Número da Conta: " + cliente.getContaCorrente().getNumero());
            System.out.println("Agência: " + cliente.getContaCorrente().getAgencia());
            System.out.println("Saldo: " + cliente.getContaCorrente().getSaldo());
            System.out.println();
        }
    }
}