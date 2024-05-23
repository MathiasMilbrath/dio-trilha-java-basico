package estabelecimento;

import celular.Iphone;

public class Fabrica {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar(String.valueOf(53984270229L));
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina("https://linkedin/user/mathiasmilbrath");
        iphone.pausar();
        iphone.tocar();
        iphone.selecionarMusica("Amanheceu");
    }
}
