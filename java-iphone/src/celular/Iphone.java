package celular;

import programas.AparelhoTelefonico;
import programas.NavegadorInternet;
import programas.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void ligar(String numero) {
        System.out.println("Ligando: " + numero);
    }


    public void atender(){
        System.out.println("Atendendo pelo iphone");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }


    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }


    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }


    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }



    public void pausar() {
        System.out.println("Pausando música");
    }


    public void tocar() {
        System.out.println("Tocando música");
    }


    public void selecionarMusica(String musica) {
    System.out.println("Tocando a musica "+ musica);
    }
}
