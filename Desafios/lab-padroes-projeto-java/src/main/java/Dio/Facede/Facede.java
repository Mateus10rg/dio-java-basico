package Dio.Facede;

import Subsistema1.crm.CrmService;
import Subsistema2.cep.CepApi;

public class Facede {
    public void migrarCliente(String nome, String cep){

        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String endereco = CepApi.getInstance().recuperarEndereco(cep);

        CrmService.migrarCliente(nome, cep, cidade, endereco);
    }
}
