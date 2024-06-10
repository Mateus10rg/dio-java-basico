package DesafioIphone;

public class Celular implements ReprodutorMusical, NavegadorInternet, Telefone{


    public void tocar() {
        System.out.println("Tocando um Iphone");
    }
    public void pausar() {
        System.out.println("Pausando...");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " + musica);
    }
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo pagina Web " + pagina);
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando novo Aba");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    public void ligar(int numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz");
    }
}
