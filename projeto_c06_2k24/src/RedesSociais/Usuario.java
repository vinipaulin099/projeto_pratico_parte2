package RedesSociais;
import Verificacao.UnChecked;
import java.util.Set;

public class Usuario {

    private String nome;
    private String email;
    private Set<RedeSocial> redesSociais;

    public Usuario(String nome, String email, Set<RedeSocial> redesSociais) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = redesSociais;
    }

    public void navegando() throws UnChecked {

        for(RedeSocial redes : redesSociais) {

            try {
                if (redes instanceof Instagram) {

                    Instagram instagram = (Instagram) redes;

                    instagram.verificarSenha("jfu8R3cBy");
                    instagram.postarVideo();
                    instagram.postarComentario();
                    instagram.curtirPublicacao();

                }
                if (redes instanceof Facebook) {

                    Facebook facebook = (Facebook) redes;

                    facebook.verificarSenha("pct8Rh39kLrY");
                    facebook.postarFoto();
                    facebook.fazStreaming();
                    facebook.compartilhar();

                }
                if (redes instanceof GooglePlus) {

                    GooglePlus googlePlus = (GooglePlus) redes;

                    googlePlus.verificarSenha("fspt7b4Xw3");
                    googlePlus.postarFoto();
                    googlePlus.compartilhar();
                    googlePlus.curtirPublicacao();
                }
                if (redes instanceof Twitter) {

                    Twitter twitter = (Twitter) redes;

                    twitter.verificarSenha("6Hi3Fjsr0U7");
                    twitter.postarFoto();
                    twitter.postarComentario();

                }

            }catch(UnChecked senhaVerificada) {

                System.out.println(senhaVerificada.getMessage());
            }
        }
    }
}