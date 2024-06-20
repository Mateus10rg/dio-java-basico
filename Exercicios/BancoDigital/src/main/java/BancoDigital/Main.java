package BancoDigital;

public class Main {

    public static void main(String[] args) {
        Cliente mateus = new Cliente();
        mateus.setNome("Mateus");

        Conta cCorrente = new ContaCorrente(mateus);
        Conta cPoupanca = new ContaPoupanca(mateus);

        cCorrente.depositar(100);
        cCorrente.transferir(100, cPoupanca);

        cPoupanca.transferir(50, cCorrente);

        cCorrente.imprimirExtrato();
        cPoupanca.imprimirExtrato();
    }

}
