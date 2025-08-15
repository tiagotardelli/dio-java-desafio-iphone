import smartphone.aparelho.IPhone;;


public class IPhoneJoao {
    public static void main(String[] args) throws Exception {
        IPhone iPhone = new IPhone();

        iPhone.adicionarNovaAba();
        iPhone.exibirPagina("www.uol.com.br");
        iPhone.atualizarPagina();

        iPhone.ligar("14-997606304");
        iPhone.iniciarCorreioVoz();
        iPhone.atender();

        iPhone.selecionarMusica("Naquele Tempo");
        iPhone.tocar();
        iPhone.pausar();

    }
}
