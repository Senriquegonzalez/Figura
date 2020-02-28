package figura;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Yefer Patarroyo
 */
public class CuadradoRectangulo extends Figura{
    
    //Se declara la variable lado4 ya que solo se reciben tres lados de la clase Padre
    private float lado4;
    //Se crea su método get y set
    public float getLado4() {
        return lado4;
    }

    public void setLado4(float lado4) {
        this.lado4 = lado4;
    }
    
    
    /**
     * Se crea el constructor
     */ 
    public CuadradoRectangulo(Coordenada[] coordenadas) {
        super(coordenadas);
    }
    /**
     * Se sobreescribe el método dibujar el cual grafica las coordenadas trazo por trazo según las coordenadas recibidas
     */ 
    @Override
    public void Dibujar(Graphics g){
        //Se envia el color a la clase Ventana
        g.setColor(getColor());
        //Se obtienen las coordenadas
        g.drawLine(coordenadas[0].getEjeX(), coordenadas[0].getEjeY(), coordenadas[1].getEjeX(), coordenadas[1].getEjeY());
        g.drawLine(coordenadas[1].getEjeX(), coordenadas[1].getEjeY(), coordenadas[2].getEjeX(), coordenadas[2].getEjeY());
        g.drawLine(coordenadas[2].getEjeX(), coordenadas[2].getEjeY(), coordenadas[3].getEjeX(), coordenadas[3].getEjeY());
        g.drawLine(coordenadas[3].getEjeX(), coordenadas[3].getEjeY(), coordenadas[0].getEjeX(), coordenadas[0].getEjeY());
    }
    /**
     * Se sobreescribe el método calcularPerimetro el cual calcula el perimetro de una figura de cuatro lados
     */ 
    @Override
    public float calcularPerimetro(){
       super.setLado1((float) Math.sqrt(Math.pow((coordenadas[1].getEjeX() - coordenadas[0].getEjeX()), 2) + Math.pow((coordenadas[1].getEjeY() - coordenadas[0].getEjeY()), 2)));
       super.setLado2((float) Math.sqrt(Math.pow((coordenadas[2].getEjeX() - coordenadas[1].getEjeX()), 2) + Math.pow((coordenadas[2].getEjeY() - coordenadas[1].getEjeY()), 2)));
       super.setLado3((float) Math.sqrt(Math.pow((coordenadas[3].getEjeX() - coordenadas[2].getEjeX()), 2) + Math.pow((coordenadas[3].getEjeY() - coordenadas[2].getEjeY()), 2)));
       lado4=((float) Math.sqrt(Math.pow((coordenadas[0].getEjeX() - coordenadas[3].getEjeX()), 2) + Math.pow((coordenadas[0].getEjeY() - coordenadas[3].getEjeY()), 2)));
       
       setPerimetro(getLado1()+getLado2()+getLado3()+lado4);
       return super.getPerimetro();
    }
    /**
     * Se sobreescribe el método calcularArea el cual calcula el area de un cuadrado
     */ 
    @Override
    public float calcularArea(){
        setArea(getLado1()*lado4);
        //retorna el valor del area del cuadrado
        return getArea();
    }
    
    
}
