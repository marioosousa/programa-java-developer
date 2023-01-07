import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		int C = leitor.nextInt();
		String nome;
		int N;

//complete os espaços em branco com sua solução para o problema

		for (int i = 0; i <   C  ; i++) {
			nome = leitor.next();
			N = leitor.nextInt();
			if (nome.equals("Thor")) System.out.println("Y");
			else System.out.println("N");
		}
    }
	
}
