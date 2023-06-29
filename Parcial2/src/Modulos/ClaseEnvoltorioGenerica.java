package Modulos;

import Excepciones.UserNameRepetido;

import java.net.UnknownServiceException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ClaseEnvoltorioGenerica <T,S>{
    private HashMap<T,S> usuarios;

    public ClaseEnvoltorioGenerica() {
        this.usuarios = new HashMap<>();
    }

    public HashMap<T, S> getUsuarios() {
        return usuarios;
    }

    @Override
    public String toString() {
        return "ClaseEnvoltorioGenerica{" +
                "usuarios=" + usuarios +
                '}'+"\n";
    }
    public void agregar(S usuario, T nombre) throws UserNameRepetido
    {
        if(!usuarios.containsKey(nombre)) {
            usuarios.put(nombre, usuario);
        }
        else
        {
            throw new UserNameRepetido("username repetido");
        }

    }
    public boolean compararNombre(String nombreYapellido) {
        boolean res=false;
        Iterator it=usuarios.entrySet().iterator();
        while(it.hasNext())
        {
            Usuario<Rol> u=(Usuario<Rol>) it.next();
            if (u.returnNombre().equals(nombreYapellido))
            {
                res=true;
            }
        }
        return res;
    }
    public int contadorRoles(Rol rol)
    {
        int res=0;
        Collection<Usuario<Rol>>usuarios1 = (Collection<Usuario<Rol>>) usuarios.values();
        for (Usuario<Rol> aux:usuarios1)
        {
            res+=aux.compararRoles(rol);
        }
        return res;
    }

}

