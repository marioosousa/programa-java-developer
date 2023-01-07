public class FormatadorCepExemplo{
    public static void main(String[] args) {
        try {
            String cepFormatado = formartarCep("53030060");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("o número CEP está invalido");
        }
    }
    static String formartarCep(String cep) throws CepInvalidoException{
        if(cep.length()!=8)
            throw new CepInvalidoException();

            //Simulando formatação
            return "23.765-064";
    }
}