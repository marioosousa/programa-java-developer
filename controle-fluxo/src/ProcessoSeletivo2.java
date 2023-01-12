import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
public class ProcessoSeletivo2 {
    public static void main(String[] args){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String cadidato:candidatos){
            entrandoEmContato(cadidato);
        }
    }    
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas=1;
        boolean continuarTentando=true;
        boolean atendeu=false;
        do{
            atendeu=atender();
            continuarTentando=!atendeu;

            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso");

        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM "+candidato+" NA "+tentativasRealizadas+ "ª TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM "+candidato+", NÚMERO MÁXIMO DE TENTATIVAS "+tentativasRealizadas+" REALIZADA");
    }
    //Método atender
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Impriminsdo a lista de candidatos informando o indice do e elemento");
        for(int indice=0; indice<candidatos.length;indice++){
            System.out.println("O candidato de nº "+(indice+1)+" é o "+candidatos[indice]);
        }
        System.out.println("Forma abreviada da interação com each");

        for(String cadidato:candidatos){
            System.out.println("O candidato selecionado foi "+cadidato);
        }
    }
    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual=0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+candidato+" Solicitou este valor de salário "+salarioPretendido);
            if(salarioBase>=salarioPretendido){
                System.out.println("O candidato "+candidato+" foi selecinado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato( double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase>salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase==salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
