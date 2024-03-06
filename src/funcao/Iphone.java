package funcao;
public class Iphone implements ReprodutorMusical, Navegador, Telefone {

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exbir página");
    }

    @Override
    public void addNovaAba() {
        System.out.println("Adicionar nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizar a página");
    }

    
}