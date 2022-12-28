import javax.lang.model.util.ElementScanner6;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 25.0;

        if(valorSolicitado <= saldo){
            saldo = saldo -valorSolicitado;
            System.out.println(saldo);
        } 
        else if(valorSolicitado > saldo){
            System.out.println("Saldo insuficiente!");
        }
    }
}
