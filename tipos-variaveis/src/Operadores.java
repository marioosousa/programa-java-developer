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
        numero = -- numero;
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

    }
}
