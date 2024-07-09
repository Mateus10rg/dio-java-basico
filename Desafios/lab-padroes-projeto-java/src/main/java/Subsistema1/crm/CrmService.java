package Subsistema1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void migrarCliente(String nome, String cep, String cidade, String endereco) {
        System.out.println("Cliente salvo no sistema de CRM.");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(endereco);
    }
}
