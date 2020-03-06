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
public class Grafica {

    private Color color;
    private float area;
    private float perimetro;
    private String tipoTriangulo;
    int coordenadasx[];
    int coordenadasy[];
    JPanel panel1;
    ArrayList<Figura> lista = new ArrayList<>();

    public void obtenerColor(int x, int y, int z) {
        color = new Color(x, y, z);
    }
/**
 * 
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

    public int[] ajusteEjex(int coordenadasx[]) {
 this.coordenadasx= new int[coordenadasx.length];
        for (int i = 0; i < coordenadasx.length; i++) {

            this.coordenadasx[i] = coordenadasx[i] + panel1.getWidth() / 2;
                     
        }
        return this.coordenadasx;
    }

    public int[] ajusteEjey(int coordenadasy[]) {
this.coordenadasy= new int[coordenadasy.length];
        for (int i = 0; i < coordenadasy.length; i++) {

            this.coordenadasy[i] = coordenadasy[i] * -1 + panel1.getHeight() / 2;

        }
        return this.coordenadasy;
    }

    public void llenarArray(Figura figura) {
        lista.add(figura);
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public String getTipoTriangulo() {
        return tipoTriangulo;
    }

    public void setTipoTriangulo(String tipoTriangulo) {
        this.tipoTriangulo = tipoTriangulo;
    }
    
    

}
