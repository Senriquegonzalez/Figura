package figura;

import java.awt.Graphics;

/**
 *
 * @author Yefer Patarroyo
 */
public class CuadradoRectangulo extends Figura{

    private float lado4;

    public float getLado4() {
        return lado4;
    }

    public void setLado4(float lado4) {
        this.lado4 = lado4;
    }
    
    
    
    public CuadradoRectangulo(Coordenada[] coordenadas) {
        super(coordenadas);
    }
    
    @Override
    public void Dibujar(Graphics g){
        g.drawLine(coordenadas[0].getEjeX(), coordenadas[0].getEjeY(), coordenadas[1].getEjeX(), coordenadas[1].getEjeY());
        g.drawLine(coordenadas[1].getEjeX(), coordenadas[1].getEjeY(), coordenadas[2].getEjeX(), coordenadas[2].getEjeY());
        g.drawLine(coordenadas[2].getEjeX(), coordenadas[2].getEjeY(), coordenadas[3].getEjeX(), coordenadas[3].getEjeY());
        g.drawLine(coordenadas[3].getEjeX(), coordenadas[3].getEjeY(), coordenadas[0].getEjeX(), coordenadas[0].getEjeY());
    }
    
    @Override
    public float calcularPerimetro(){
       super.setLado1((float) Math.sqrt(Math.pow((coordenadas[1].getEjeX() - coordenadas[0].getEjeX()), 2) + Math.pow((coordenadas[1].getEjeY() - coordenadas[0].getEjeY()), 2)));
       super.setLado2((float) Math.sqrt(Math.pow((coordenadas[2].getEjeX() - coordenadas[1].getEjeX()), 2) + Math.pow((coordenadas[2].getEjeY() - coordenadas[1].getEjeY()), 2)));
       super.setLado3((float) Math.sqrt(Math.pow((coordenadas[3].getEjeX() - coordenadas[2].getEjeX()), 2) + Math.pow((coordenadas[3].getEjeY() - coordenadas[2].getEjeY()), 2)));
       lado4=((float) Math.sqrt(Math.pow((coordenadas[0].getEjeX() - coordenadas[3].getEjeX()), 2) + Math.pow((coordenadas[0].getEjeY() - coordenadas[3].getEjeY()), 2)));
       
       setPerimetro(getLado1()+getLado2()+getLado3()+lado4);
       return super.getPerimetro();
    }
    
    @Override
    public float calcularArea(){
        setArea(getLado1()*lado4);
        return getArea();
    }
    
    
}
