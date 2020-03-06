/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *Se crea la clase hija Rectangulo que hereda de la clase Padre Figura.
 * @author Yefer Patarroyo
 */
public class Rectangulo extends Figura {
    //Se declara un array de flotantes.
    float[] lados;
/**
 * 
 * costructor de la clase Rectangulo.
 */
    
    /**
     * Se crea el constructor de la clase Rectangulo.
     */
    public Rectangulo(int[] coordenadasx, int[] coordenadasy, int lado) {
        super(coordenadasx, coordenadasy, lado);
        lados =super.getLados();
    }
  
    /**
     * 
     * metodo sobre escrito para calcular el area
     * @return  retorna el area de un rectangulo
     */
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
    
