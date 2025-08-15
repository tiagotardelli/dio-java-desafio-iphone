package smartphone.aparelho;

import smartphone.musica.ReprodutorMusical;
import smartphone.navegador.NavegadorInternet;
import smartphone.telefone.AparelhoTelefonico;

public class IPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{
    public void tocar() {
        System.out.println("Música começou a tocar");
    }

    public void pausar() {
        System.out.println("A música está parada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música " + musica + " selecionada");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    public void atender() {
        System.out.println("Atendendo telefone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Você está no correio de voz");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a página da url " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
    }
}
