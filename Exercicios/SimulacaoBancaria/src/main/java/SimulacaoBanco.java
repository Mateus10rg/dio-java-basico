import java.util.Scanner;

public class SimulacaoBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("O que deseja fazer hoje?");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar Sistema");
            System.out.println("Digite uma das opções: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Qual valor você deseja depositar?");
                    saldo += scanner.nextDouble();
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Qual valor do saque? ");
                    double saque = scanner.nextDouble();
                    if (saldo >= saque ){
                        System.out.println("Saque de R$" + saque + " realizado com sucesso!. ");
                        saldo -= saque;
                    }else
                        System.out.println("Saldo insuficiente");

                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: R$" + saldo);
                    break;
                case 0:
                    System.out.println("Encerrando programa... ");
                    System.out.println("Programa encerrado. ");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}