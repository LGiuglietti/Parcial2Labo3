package Modulos;

public class Location {
    private double longitud;
    private double lat;

    public Location(double longitud, double lat) {
        this.longitud = longitud;
        this.lat = lat;
    }

    public Location() {
    }

    public double getLongitud() {
        return longitud;
    }

    public double getLat() {
        return lat;
    }

    @Override
    public String toString() {
        return "Location{" +
                "longitud='" + longitud + '\'' +
                ", lat='" + lat + '\'' +
                '}';
    }
}
