package RedesSociais;
import Interface.VideoConferencia;
import Interface.Compartilhamento;

public class GooglePlus extends RedeSocial implements Compartilhamento, VideoConferencia {

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {

        System.out.println("Postou uma foto no GooglePlus!");
    }

    @Override
    public void postarVideo() {

        System.out.println("Postou um video no GooglePlus!");
    }

    @Override
    public void postarComentario() {

        System.out.println("Postou um comentario no GooglePlus!");
    }

    @Override
    public void curtirPublicacao(){

        System.out.println("Curtiu uma publicacao no GooglePlus!");
    }

    @Override
    public void compartilhar() {

        System.out.println("Compartilhou um post no GooglePlus!");
    }

    @Override
    public void fazStreaming() {

        System.out.println("Fazendo streaming no GooglePlus!");
    }
}