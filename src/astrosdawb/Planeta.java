package astrosdawb;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author natali
 */
public class Planeta extends Astro {

    private String nombre;
    private double distancia, orbita;
    private Satelite[] listaSatelites;
    private boolean tieneSatelites;
    private final int MAX = 10;

    private int contadorSatelites;

    public Planeta(String nombre, boolean tieneSatelites) {
        super();  // no es necesario escribirlo
        this.nombre = nombre;
        this.tieneSatelites = tieneSatelites;
        this.distancia = 0;
        this.orbita = 0;
        if (tieneSatelites) {
            this.listaSatelites = new Satelite[MAX];
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getOrbita() {
        return orbita;
    }

    public void setOrbita(double orbita) {
        this.orbita = orbita;
    }

    public Satelite[] getListaSatelites() {

        Satelite[] copia = Arrays.copyOf(listaSatelites, MAX);

        return copia;
    }

    public void setListaSatelites(Satelite[] listaSatelites) {

        this.listaSatelites = listaSatelites;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    @Override
    public String toString() {
        return "Planeta{" + super.toString() + "nombre=" + nombre + ", distancia="
                + distancia + ", orbita=" + orbita + ", listaSatelites="
                + Arrays.toString(listaSatelites) + ", tieneSatelites=" + tieneSatelites + ", MAX=" + MAX + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Planeta other = (Planeta) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    public boolean addSatelite(Satelite satelite) {
        boolean resultado = false;
        if (tieneSatelites) {
            if (contadorSatelites < MAX) {
                listaSatelites[contadorSatelites]= satelite;
                contadorSatelites++;
                resultado=true;
            }
        }
        return resultado;
    }

}
