package Modulos;

import Excepciones.RolRepetido;

import java.util.HashSet;

public class Usuario<T> {
    private HashSet<T> roles;
    private Perfil perfil; //contiene location
    private String id;
    private String email;
    private String apiKey;
    private String userName;
    private String createdAt;
    private String updatedAt;

    public Usuario(HashSet<T> roles, Perfil perfil, String id, String email, String apiKey, String userName, String createdAt, String updatedAt) {
        this.roles = roles;
        this.perfil = perfil;
        this.id = id;
        this.email = email;
        this.apiKey = apiKey;
        this.userName = userName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "roles=" + roles +
                ", perfil=" + perfil +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", apiKey='" + apiKey + '\'' +
                ", userName='" + userName + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}'+"\n";
    }
    public void agregarRol(T rol) throws RolRepetido
    {
        if (roles.contains(rol))
        {
            throw new RolRepetido("rol ya en existencia");
        }
        else {
            roles.add(rol);
        }
    }
    public String returnNombre()
    {
        return perfil.getName();
    }
    public int compararRoles(T rol)
    {
        int res=0;
        if (roles.contains(rol))
        {
            res=1;
        }
        return res;
    }
}
