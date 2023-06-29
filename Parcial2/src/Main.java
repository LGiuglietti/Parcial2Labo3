import JSON.JSONtoJAVA;
import Modulos.ClaseEnvoltorioGenerica;
import Modulos.Rol;
import Modulos.Usuario;

public class Main {
    public static void main(String[] args) {
        JSONtoJAVA jsoNtoJAVA = new JSONtoJAVA();
        ClaseEnvoltorioGenerica<String, Usuario<Rol>> CEG=new ClaseEnvoltorioGenerica<>();
        jsoNtoJAVA.J2J(CEG);
        System.out.println(CEG);
        Usuario<Rol> aux=new Usuario<>();
        CEG.agregar(aux,);
    }
}