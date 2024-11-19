package RedesSociais;
import Verificacao.UnChecked;
import java.util.HashSet;
import java.util.Set;

        public class Main {
            public static void main(String[] args) {

                Set<RedeSocial> conta0 = new HashSet<RedeSocial>();
                Set<RedeSocial> conta1 = new HashSet<RedeSocial>();

                try{

                    conta0.add(new Facebook("pct8Rh39kLrY", 2408));
                    conta0.add(new Instagram("jfu8R3cBy", 1853));
                    Usuario usuario = new Usuario("vinicius_paulin099", "viniciusvpaulino@inatel.com.br", conta0);
                    usuario.navegando();

                }catch (UnChecked senhaVerificada) {

                    System.out.println("Erro de senha: " + senhaVerificada.getMessage());
                }

                try{

                    conta1.add(new Twitter("fspt7b4Xw3" ,1853));
                    Usuario usuario = new Usuario("vinicius_paulin099", "viniciusvpaulino@inatel.com.br", conta1);
                    usuario.navegando();

                }catch (UnChecked senhaVerificada) {

                    System.out.println("Erro de senha: " + senhaVerificada.getMessage());
                }

            }
        }