import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome e sobrenome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldoConta = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$" + saldoConta + " já está disponível para saque.");

        scanner.close();

    }

}