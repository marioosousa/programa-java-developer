import java.util.Scanner;
public class Thor {
    public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
        System.out.print("Quantas pessoas vão tentar levantar o Mjölnir: ");
		int C = leitor.nextInt();
		String nome;
		int N;

//complete os espaços em branco com sua solução para o problema

		for (int i = 1; i <=   C  ; i++) {
            System.out.print("Nome do "+i+"º participante: ");
			nome = leitor.next();
            System.out.print("Quanta força ira aplicar? ");
			N = leitor.nextInt();
            System.out.print(nome+" conseguiu levantar o Mjölnir? ");
			if (nome.equals("Thor")) System.out.println("Y");
			else System.out.println("N");
		}
    
    }
}
