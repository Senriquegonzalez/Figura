
package figura;

import java.awt.Color;
import java.awt.Graphics;
import static javafx.scene.paint.Color.color;

/**
 *
 * @author Yefer Patarroyo
 */
public class Grafica  {
    private Color color;
    
    
    public void obtenerColor(int x,int y,int z){
           color = new Color(x,y,z);
    }
    public void Dibujar(Graphics g,int coordenadasx[], int coordenadasy[],int numeroLados) { 
        
        g.setColor(color);        
        g.fillPolygon(coordenadasx, coordenadasy, numeroLados);       
    }
}
