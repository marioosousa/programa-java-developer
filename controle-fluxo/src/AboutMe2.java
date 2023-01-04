import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;
public class AboutMe2{
    public static void main(String[] args) {
        try{
        //Creating scanner object
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Getting user data
        System.out.println("Digite seu nome:");
        String userName = scanner.nextLine();

        System.out.println("Digite seu sobrenome:");
        String lastName = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int age = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double height = scanner.nextDouble();

        //Print the data entered by the user
        System.out.println("Olá, me chamo "+userName.toUpperCase()+" "+lastName.toUpperCase());
        System.out.println("Tenho "+age+" anos");
        System.out.println("Minha altura é "+height+"cm");
        scanner.close();
        }
        catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}