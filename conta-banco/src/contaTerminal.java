import java.util.Scanner;
import java.util.Locale;

public class contaTerminal  {
    public static void main(String[] args) throws Exception {
        
        int numero; 
        String nomeCliente, agencia;
        double saldo;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("qual é o seu nome? ");
        nomeCliente = scanner.nextLine();
        System.out.println("qual é numero da agencia? ");
        agencia = scanner.nextLine();
        System.out.println("qual é numero da conta? ");
        numero = scanner.nextInt();
        System.out.println("qual é o saldo na sua conta? ");
        saldo = scanner.nextDouble();

        System.out.println("ola " +nomeCliente+ ",obriado por criar uma conta em nosso banco, sua agência é " +agencia+ " , conta é " +numero+ " e seu saldo é de " +saldo+ " ja esta disponivel!");



    }
}
