
package astrosdawb;

/**
 *Radio

. Rotación del eje

• Masa del cuerpo. 

. Temperatura media:

. Gravedad
 * @author natali
 */
public class Astro {
    
    private double radio, rotacion, masa, temperatura, gravedad;

  
 

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRotacion() {
        return rotacion;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    @Override
    public String toString() {
        return "\nAstro{" + "radio=" + radio + ", rotacion=" + rotacion + ", masa=" + masa + ", temperatura=" + temperatura + ", gravedad=" + gravedad + '}'+ "\n";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.radio) ^ (Double.doubleToLongBits(this.radio) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.rotacion) ^ (Double.doubleToLongBits(this.rotacion) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.masa) ^ (Double.doubleToLongBits(this.masa) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.temperatura) ^ (Double.doubleToLongBits(this.temperatura) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.gravedad) ^ (Double.doubleToLongBits(this.gravedad) >>> 32));
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
        final Astro other = (Astro) obj;
        if (Double.doubleToLongBits(this.radio) != Double.doubleToLongBits(other.radio)) {
            return false;
        }
        if (Double.doubleToLongBits(this.rotacion) != Double.doubleToLongBits(other.rotacion)) {
            return false;
        }
        if (Double.doubleToLongBits(this.masa) != Double.doubleToLongBits(other.masa)) {
            return false;
        }
        if (Double.doubleToLongBits(this.temperatura) != Double.doubleToLongBits(other.temperatura)) {
            return false;
        }
        return Double.doubleToLongBits(this.gravedad) == Double.doubleToLongBits(other.gravedad);
    }
    
    
    
}
