package figura;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import static javafx.scene.paint.Color.color;
import javax.swing.JPanel;

/**
 * esta clase permite graficar las figuras geometricas
 * @author Yefer Patarroyo
 */
public class Grafica {

    private Color color;
    private float area;
    private float perimetro;
    private String tipoTriangulo;
    int coordenadasx[];
    int coordenadasy[];
    JPanel panel1;
    ArrayList<Figura> lista = new ArrayList<>();
/**
 *  metodo para capturar un color en formato RGB
 * @param x. guarda un entero entre 0 a 255
 * @param y.guarda un entero entre 0 a 255
 * @param z.guarda un entero entre 0 a 255 
 */
    public void obtenerColor(int x, int y, int z) {
        color = new Color(x, y, z);
    }
/**
 * metodo usado para dibujar el eje de coordenadas
 * @param g
 * @param panel1
 * @param figuraElegida 
 */
    public void Dibujar(Graphics g, JPanel panel1, int figuraElegida) {

        Figura x = lista.get(figuraElegida);
        this.panel1 = panel1;
        g.drawLine(panel1.getWidth() / 2, 0, panel1.getWidth() / 2, panel1.getHeight());
        g.drawLine(0, panel1.getHeight() / 2, panel1.getWidth(), panel1.getHeight() / 2);

        g.setColor(color);
        if (x instanceof Triangulo) {
            Triangulo triangulo = (Triangulo) x;
            triangulo.calcularArea();
            this.area = triangulo.getArea();
            this.perimetro = triangulo.getPerimetro();
            this.tipoTriangulo = triangulo.getTipoTriangulo();
            
           
            g.fillPolygon( ajusteEjex(triangulo.getCoordenadasx()), ajusteEjey(triangulo.getCoordenadasy()),triangulo.getCantidadLado());

        }
        if (x instanceof Cuadrado) {
            Cuadrado cuadrado = (Cuadrado) x;
            cuadrado.calcularArea();
            this.area =cuadrado.getArea();
            this.perimetro = cuadrado.getPerimetro();
            g.fillPolygon(ajusteEjex(cuadrado.getCoordenadasx()), ajusteEjey(cuadrado.getCoordenadasy()),  cuadrado.getCantidadLado());

        }
        if (x instanceof Rectangulo) {
            Rectangulo rectangulo = (Rectangulo) x;
            rectangulo.calcularArea();
            this.area = rectangulo.getArea();
            this.perimetro = rectangulo.getPerimetro();
            g.fillPolygon(ajusteEjex(rectangulo.getCoordenadasx()), ajusteEjey(rectangulo.getCoordenadasy()), rectangulo.getCantidadLado());

        }

    }
/**
 * metodo para ajustar el eje x de la figura geometrica
 * @param coordenadasx 
 * @return  retorna  un vector ajustado al eje de coordenadas
 */
    public int[] ajusteEjex(int coordenadasx[]) {
 this.coordenadasx= new int[coordenadasx.length];
        for (int i = 0; i < coordenadasx.length; i++) {

            this.coordenadasx[i] = coordenadasx[i] + panel1.getWidth() / 2;
                     
        }
        return this.coordenadasx;
    }
    /**
     * 
     * metodo para ajustar el eje x de la figura geometrica
     * @param coordenadasy
     * @return retorna  un vector ajustado al eje de coordenadas
     */

    public int[] ajusteEjey(int coordenadasy[]) {
this.coordenadasy= new int[coordenadasy.length];
        for (int i = 0; i < coordenadasy.length; i++) {

            this.coordenadasy[i] = coordenadasy[i] * -1 + panel1.getHeight() / 2;

        }
        return this.coordenadasy;
    }
/**
 * metodo que me agrega un objeto de tipo figura a un arraylist
 * @param figura  captira  un objeto tipo figura  
 */
    public void llenarArray(Figura figura) {
        lista.add(figura);
    }
/**
 * metodo para recuperar el area
 * @return  retorna el area 
 */
    
    
    public float getArea() {
        return area;
    }
/**
 * 
 * metodo usado para definir un area
 * @param area 
 */
    public void setArea(float area) {
        this.area = area;
    }
/**
 * 
 * metodo usado para recuperar un perimetro
 * @return 
 */
    public float getPerimetro() {
        return perimetro;
    }
/**
 * 
 * metodo usado para definir un  perimetro
 * @param perimetro 
 */
    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
/**
 * 
 * metodo usado para recuperar un String
 * @return  retona el tipo de triangulo
 */
    public String getTipoTriangulo() {
        return tipoTriangulo;
    }
/**
 * 
 * metodo usado para cambiarel tipo de triangulo
 * 
 */
    public void setTipoTriangulo(String tipoTriangulo) {
        this.tipoTriangulo = tipoTriangulo;
    }
    
    

}
