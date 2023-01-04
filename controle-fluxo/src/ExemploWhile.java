import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile{
    public static void main(String[] args) {
        double mesada = 50.0;
        int conteDoce = 0;
        while(mesada>0){
            double valorDoce = valorAleatorio();
            if(valorDoce>mesada)
                valorDoce = mesada;
            System.out.println("Doce do valor "+valorDoce+" adicionado ao carrinho!");
            mesada = mesada - valorDoce;
            conteDoce = conteDoce + 1;
        }
        System.out.println("Mesada: "+mesada);
        System.out.println("Joãozinho comprou "+(conteDoce)+" doces");
        System.out.println("Joãozinho gastou toda sua mesada em doces");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2 , 8);
    }
}