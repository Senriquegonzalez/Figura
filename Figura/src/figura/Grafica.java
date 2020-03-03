
package figura;

import java.awt.Color;
import java.awt.Graphics;
import static javafx.scene.paint.Color.color;
import javax.swing.JPanel;

/**
 *
 * @author Yefer Patarroyo
 */
public class Grafica  {
    private Color color;
    int coordenadasx[];
    int coordenadasy[];
    JPanel panel1;
    
    
    public void obtenerColor(int x,int y,int z){
           color = new Color(x,y,z);
    }
    public void Dibujar(Graphics g,int coordenadasx[], int coordenadasy[],int numeroLados,JPanel panel1) { 
        this.coordenadasx= coordenadasx;
        this.coordenadasy= coordenadasy;
        this.panel1=panel1;
        g.drawLine(panel1.getWidth()/2, 0, panel1.getWidth()/2, panel1.getHeight());
        g.drawLine(0, panel1.getHeight()/2, panel1.getWidth(), panel1.getHeight()/2);
        ajusteEjey();
        ajusteEjex();
        g.setColor(color);        
        g.fillPolygon( this.coordenadasx,  this.coordenadasy, numeroLados);       
    }
    
    public void ajusteEjex(){
        
        for (int i = 0; i <this.coordenadasx.length; i++) {
            
            this.coordenadasx[i]=this.coordenadasx[i]+panel1.getWidth()/2;
        }
        
           
    }
    public void ajusteEjey(){
        
        for (int i = 0; i <this.coordenadasy.length; i++) {
           
                
                 this.coordenadasy[i]=this.coordenadasy[i]*-1+panel1.getHeight()/2;
            
               
            
        }
        
           
    }
}
