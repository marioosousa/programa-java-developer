import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception{
        //Know and import the scanner class
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Display messages to user
        //Get the values ​​typed in the terminal using the scanner class
        System.out.println("Por favor, digite o número da Agência: ");
        String Agencia = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        int Conta =  scanner.nextInt();
        
        System.out.println("Digite seu nome: ");
        String NomeCliente = scanner.next();
        
        double Saldo = 237.48;

        //Display the created account message

        System.out.println("Óla " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Conta + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
}
