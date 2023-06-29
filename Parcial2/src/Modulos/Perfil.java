package Modulos;

import java.util.Objects;

public class Perfil {
  private String dob;
  private String name;
  private String about;
  private String address;
  private String company;
  private Location location;

    public Perfil(String dob, String name, String about, String address, String company, Location location) {
        this.dob = dob;
        this.name = name;
        this.about = about;
        this.address = address;
        this.company = company;
        this.location = location;
    }

    public String getSob() {
        return dob;
    }

    public String getName() {
        return name;
    }

    public String getAbout() {
        return about;
    }

    public String getAddress() {
        return address;
    }

    public String getCompany() {
        return company;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perfil perfil = (Perfil) o;
        return Objects.equals(dob, perfil.dob) && Objects.equals(name, perfil.name) && Objects.equals(about, perfil.about) && Objects.equals(address, perfil.address) && Objects.equals(company, perfil.company) && Objects.equals(location, perfil.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dob, name, about, address, company, location);
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "dob='" + dob + '\'' +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                ", address='" + address + '\'' +
                ", company='" + company + '\'' +
                ", location=" + location +
                '}';
    }
    public String getAnio()
    {
        String [] partes=dob.split("/");
        return partes[2];
    }

}
