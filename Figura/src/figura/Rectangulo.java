/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author Yefer Patarroyo
 */
public class Rectangulo extends CuadradoRectangulo{

    public Rectangulo(Coordenada[] coordenadas) {
        super(coordenadas);
    }
    
    /*private int lado2;

    public Rectangulo(Coordenada[] coordenadas,lado1) {
        super(coordenadas);
    }
    
    public Rectangulo(int lado1, int lado2) {
        super(lado1);
        this.lado2 = lado2;
    }
    
    @Override
    public void calcularArea(){
        setArea(getLado1() * lado2);
    }
    
    @Override
    public void calcularPerimetro(){
        setPerimetro((getLado1() * 2) + (this.lado2 * 2) );
    }*/   
}
    
