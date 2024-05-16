import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual nome do titular da conta? Ex: Fulano_da_Silva");
        String nome = scanner.next();

        System.out.println("Qual é o número da sua conta " + nome + " ?");
        int numero = scanner.nextInt();

        System.out.println("Qual e o número da sua Agência " + nome + " ?");
        String agencia = scanner.next();

        System.out.println("Qual saldo você tem em conta " + nome + " ?");
        double saldo = scanner.nextDouble();

        System.out.println(" ");
        System.out.println("Olá " + nome + ", Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", sua conta é " + numero + " é seu saldo " + saldo + ", seu saldo já está disponivel você já pode efetuar seu saque." );
        System.out.println(" ");

        
    }
}
