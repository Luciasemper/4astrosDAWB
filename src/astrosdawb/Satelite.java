
package astrosdawb;

import java.util.Objects;

/**
 *
 * @author natali
 */
public class Satelite extends Astro {
    
    private String nombre;
    private double distancia;
    private double orbita;
    private String planeta;
    
    public Satelite(String nombre, String planeta){     
        super();
        this.nombre = nombre;
        this.planeta =  planeta;
        this.distancia =0;
        this.orbita =0;
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

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return "\nSatelite{" + super.toString() + "nombre=" + nombre + ", distancia=" + distancia + ", orbita=" + orbita + ", planeta=" + planeta + "\n}";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nombre);
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
        final Satelite other = (Satelite) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    
    
}
