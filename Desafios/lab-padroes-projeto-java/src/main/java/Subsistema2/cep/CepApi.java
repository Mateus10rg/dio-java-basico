package Subsistema2.cep;

public class CepApi {

    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String recuperarEndereco(String cep) {
        return "Rua das Laranjeiras";
    }

    public String recuperarCidade(String cep) {
        return "Rio de Janeiro";
    }

}
