public class Celular implements ReprodutorMusical, AparelhoTelefonico, NavegadorIntenet {

    @Override
    public void pausar() {
        System.out.println("Pausaando musica");     
    }

    @Override
    public void selecionarMusica(String musica) {      
        System.out.println("selecionando musica");
    }

    @Override
    public void tocar() {
        System.out.println("tocando musica");
    }

    @Override
    public void atender() { 
        System.out.println("atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz");
    }

    @Override
    public void ligar(String numero) { 
        System.out.println("ligando");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando Pagina");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("exibindo Pagina");
    }

   
}