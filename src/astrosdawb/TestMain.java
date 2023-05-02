
package astrosdawb;

import java.util.Arrays;

/**
 *
 * @author natali
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
      Astro[] astros = new Astro[5];
      Planeta tierra = new Planeta("Tierra", true);
      Planeta marte = new Planeta("Marte", true);
      
      Satelite luna = new Satelite("Luna", "Tierra");
      tierra.addSatelite(luna);
      Satelite luna1 = new Satelite("Luna1", "Marte");
      marte.addSatelite(luna1);   
      Satelite luna2 = new Satelite("Luna2", "Marte");
      marte.addSatelite(luna2);
      
      astros[0]=tierra;
      astros[1]=marte;
      astros[2]=luna;
      astros[3]=luna1;
      astros[4]= luna2;
      
        System.out.println(Arrays.toString(astros));
      
      for(int i=0; i<astros.length; i++){
          // instanceOf
          Planeta planeta; 
          Satelite satelite; 
          if(astros[i] instanceof Planeta){
              planeta = (Planeta)astros[i];
              System.out.println("Nombre "+  planeta.getNombre());
              ;
          }
          else if(astros[i] instanceof Satelite){
              satelite = (Satelite)astros[i];
              System.out.println("Nombre: " +satelite.getNombre());
          }
      }
      
        
    }
    
}
