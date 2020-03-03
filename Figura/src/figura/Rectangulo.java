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
public class Rectangulo extends Figura {
    float[] lados;

    public Rectangulo(int[] coordenadasx, int[] coordenadasy, int lado) {
        super(coordenadasx, coordenadasy, lado);
        lados =super.getLados();
    }

   
    
    
    @Override
    public float calcularArea(){
        
        
       
        if(lados[0]!=lados[1]){
            setArea(lados[0]*lados[1]);
        }
        else{
            setArea(lados[0]*lados[2]);
        }
        
        return getArea();
    }
    
     
}
    
