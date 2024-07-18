public class Teste {

    public static void main(String[] args) {
        Celular meuCelular = new Celular();

        meuCelular.tocar();
        meuCelular.pausar();
        meuCelular.selecionarMusica(null);

        meuCelular.ligar(null);
        meuCelular.atender();
        meuCelular.iniciarCorreioVoz();

        meuCelular.exibirPagina(null);
        meuCelular.adicionarNovaAba();
        meuCelular.atualizarPagina();
    }
}
