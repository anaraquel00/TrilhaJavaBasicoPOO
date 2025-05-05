public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("iPhone 15 Pro", 256);
        
        // Testando Reprodutor Musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Bohemian Rhapsody");
        
        // Testando Aparelho Telefônico
        meuIphone.ligar("11999999999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
        // Testando Navegador Internet
        meuIphone.exibirPagina("https://www.dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}