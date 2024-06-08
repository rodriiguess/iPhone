public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Métodos do ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Métodos do AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Métodos do NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando funcionalidades de ReprodutorMusical
        meuIphone.tocar();
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.pausar();

        // Testando funcionalidades de AparelhoTelefonico
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando funcionalidades de NavegadorInternet
        meuIphone.exibirPagina("http://www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}