package RedesSociais;
import Verificacao.UnChecked;

public abstract class RedeSocial {

    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    public void verificarSenha(String senha) throws UnChecked {
        if (!this.senha.equals(senha)) {
            throw new UnChecked("Senha inválida");
        }
    }

    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();

    public void curtirPublicacao(){

        System.out.println("Curtiu uma publicação!");

    }

}