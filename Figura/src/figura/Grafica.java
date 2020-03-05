
package figura;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import static javafx.scene.paint.Color.color;
import javax.swing.JPanel;

/**
 *
 * @author Yefer Patarroyo
 */
public class Grafica  {
    private Color color;
    private float area;
    private float perimetro;
    private String tipoTriangulo;
    int coordenadasx[];
    int coordenadasy[];
    JPanel panel1;
    ArrayList<Figura>lista = new ArrayList<>();
    
    public void obtenerColor(int x,int y,int z){
           color = new Color(x,y,z);
    }
    public void Dibujar(Graphics g,JPanel panel1,int figuraElegida) { 

        Figura x=lista.get(figuraElegida);
        this.coordenadasx = x.getCoordenadasx();
        this.coordenadasy = x.getCoordenadasy();
        this.panel1=panel1;
        g.drawLine(panel1.getWidth()/2, 0, panel1.getWidth()/2, panel1.getHeight());
        g.drawLine(0, panel1.getHeight()/2, panel1.getWidth(), panel1.getHeight()/2);
        ajusteEjey();
        ajusteEjex();
        g.setColor(color);
        if(lista.get(figuraElegida) instanceof Triangulo){
        Triangulo triangulo = (Triangulo)x;
        this.area = triangulo.calcularArea();
        this.perimetro = triangulo.calcularPerimetro();
        this.tipoTriangulo = triangulo.definirTriangulo();
        g.fillPolygon( this.coordenadasx,  this.coordenadasy, triangulo.getCantidadLado());           
        
        }
        if(lista.get(figuraElegida) instanceof Cuadrado){
        Cuadrado cuadrado = (Cuadrado)x;
        this.area = cuadrado.calcularArea();
        this.perimetro = cuadrado.calcularPerimetro();
        g.fillPolygon( this.coordenadasx,  this.coordenadasy, cuadrado.getCantidadLado());           
        
        }
        if(lista.get(figuraElegida) instanceof Rectangulo){
        Rectangulo rectangulo = (Rectangulo)x;
        this.area = rectangulo.calcularArea();
        this.perimetro = rectangulo.calcularPerimetro();
        g.fillPolygon( this.coordenadasx,  this.coordenadasy, rectangulo.getCantidadLado());           
        
    }
        
               
     
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
    
    public void llenarArray(Figura figura){
        lista.add(figura);
    }
    
}
