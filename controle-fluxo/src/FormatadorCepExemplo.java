public class FormatadorCepExemplo{
    public static void main(String[] args) {
    }
    static String formartarCep(String cep) throws CepInvalidoException{
        if(cep.length()!8)
            throw new CepInvalidoException();

            //Simulando formatação
            return "23.765-064"
    }
}