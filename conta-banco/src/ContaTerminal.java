import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {
        double saldo = 100.00;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao Banco Liso S.A. ");

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite sua Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua Conta sem o dígito: ");
        int conta = scanner.nextInt();

        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu Saldo "+ saldo + " já está disponivel para saque.");

    }
}
