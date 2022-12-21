import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.BlockElement;

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

        //Valores Bolenaos: os operadores relacionais
        System.out.println("Digite um valor para o Nnmero 1: ");
        int numero1 = teclado.nextInt();
        System.out.println("Digite um valor para o número 2: ");
        int numero2 = teclado.nextInt();

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("A nossa Condição é verdadeira!");
        }

        System.out.println("Número 1 é igual ao número 2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Número 1 é diferete do número 2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Número 1 é maior do que o número 2? " + simNao);

        System.out.print("Digite o nome 1: ");
        String nome1 = teclado.nextLine();
        teclado.nextLine();
        System.out.print("Digite o nome 2: ");
        String nome2 = teclado.nextLine();
        System.out.println(nome1 == nome2.intern());
        simNao = nome1.equals(nome2);
        System.out.println(simNao);

        //Valores Bolenaos: os operadores lógicos

        boolean condicao1 = true;

        boolean condicao2 = true;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        else
            System.out.println("As duas condições são diferentes");
        
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("Fim");
    }
}
