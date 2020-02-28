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

    /**
     * Se crea el constructor
     */ 
    public Rectangulo(Coordenada[] coordenadas) {
        super(coordenadas);
    }
    
    /**
     * Se sobreescribe el método calcularArea el cual calcula el area de un rectangulo
     */
    @Override
    public float calcularArea(){
        
        
        if(getLado1()>getLado2()){
            setArea(getLado1()*getLado2());
        }
        else{
            setArea(getLado1()*getLado3());
        }
        //retorna el valor del area de rectangulo
        return getArea();
    }
     
}
    
