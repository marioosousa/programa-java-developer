import java.util.Scanner;

public class Operadores {
    public static void main(String[] args){
        String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto);
        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        int numero = 5;
        numero = -numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);
        // incremento
        numero = numero + 1;
        System.out.print("Incremento: ");
        System.out.println(numero);
        // Decrementar
        numero = numero - 1;
        System.out.print("Decremento ( numero = numero - 1): ");
        System.out.println(numero);
        numero = --numero;
        System.out.print("Decremento ( numero = -- numero): ");
        System.out.println(numero);
        System.out.print("Decremento ( System.out.println(--numero)): ");
        System.out.println(--numero);

        //Boleanos
        boolean variavel = true;
        System.out.println("Valores Boleanos");
        System.out.println("Variável boleana recebe '!' muda o valor");
        System.out.println("booLean variavel = true");
        System.out.println("System.out.println(!variavel)");
        System.out.print("Variável: ");
        System.out.println(!variavel);

        // Implementando entrada por teclado
        Scanner teclado = new Scanner(System.in);

        //Ternário
        System.out.println("Operadores Ternários");
        System.out.println("Testando se 'a' é igua a 'b'");
        System.out.println("Digite um valor para 'a': ");
        int a = teclado.nextInt();
        System.out.println("Digite um valor para 'b': ");
        int b = teclado.nextInt();
        String resultado = "";
        if(a==b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";
        
        System.out.print("'a' é igual a 'b'? ");
        System.out.println(resultado);

        //Maneira resumida
        System.out.print("'a' é igual a 'b'? ");
        String resultado2 = a==b ?"verdadeiro" : "falso";
        System.out.println(resultado2);

    }
}
