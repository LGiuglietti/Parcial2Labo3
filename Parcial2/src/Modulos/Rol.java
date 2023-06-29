package Modulos;

import java.util.Objects;

public class Rol {
    private String rol;
    public Rol(String rol) {
        this.rol = rol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rol rol1 = (Rol) o;
        return Objects.equals(rol, rol1.rol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rol);
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "rol='" + rol + '\'' +
                '}';
    }
}
