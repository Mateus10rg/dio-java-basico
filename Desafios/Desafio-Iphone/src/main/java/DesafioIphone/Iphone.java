package DesafioIphone;

public class Iphone {
    public static void main(String[] args) {
        Celular meuIphone = new Celular();

        // Testando ReprodutorMusical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Engenheiros do Hawaii - O Preço");

        //Testando Telefone
        meuIphone.ligar(987654321);
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando NavergadoInternet
        meuIphone.exibirPagina("https://www.google.com.br");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

    }
}
