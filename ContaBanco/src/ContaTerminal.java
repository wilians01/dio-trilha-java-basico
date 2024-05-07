import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
       
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero da Agencia ! ");
        int numero = scanner.nextInt() ;
        System.out.println("Por favor, digite o nome da Agencia ! ");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o seu nome !");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, digite o saldo da sua conta Bancaria !");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco ! ");
        System.out.println("Sua agencia é " + agencia+", conta " + numero);
        System.out.println("E seu saldo é de " + saldo +", já está disponível para saque123.");
    }

}