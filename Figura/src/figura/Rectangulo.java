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
    
    
    @Override
    public float calcularArea(){
        
        
        if(getLado1()>getLado2()){
            setArea(getLado1()*getLado2());
        }
        else{
            setArea(getLado1()*getLado3());
        }
        
        return getArea();
    }
     
}
    
