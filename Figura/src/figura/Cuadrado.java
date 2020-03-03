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
public class Cuadrado extends CuadradoRectangulo{
 float[] lados;
 
    public Cuadrado(int[] coordenadasx, int[] coordenadasy, int lado) {
        super(coordenadasx, coordenadasy, lado);
        lados =super.getLados();
    }
    
 @Override
    public float calcularArea(){
        
        super.setArea(lados[0]*lados[0]);
        return super.getArea();
        
    }

    
    
    
}
