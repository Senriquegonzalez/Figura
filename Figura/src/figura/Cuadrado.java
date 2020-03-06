/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *Se crea la clase hija Cuadrado que hereda de la clase padre Figura.
 * @author Yefer Patarroyo
 */
public class Cuadrado extends Figura {
 /**
  * Se crea el arreglo lados el cual el cual almacena los lados del cuadrado 
  */   
 float[] lados;
    /**
     * Se crea el constructor de la clase Cuadrado
     * @param coordenadasx
     * @param coordenadasy
     * @param lado 
     */
    public Cuadrado(int[] coordenadasx, int[] coordenadasy, int lado) {
        super(coordenadasx, coordenadasy, lado);
        lados =super.getLados();
    }
    
 /**
 *se sobre escribe el metodo calcular area para la clase cuadro
 * @return  retorna el area 
 */
 @Override
    public float calcularArea(){
        
        super.setArea(lados[0]*lados[0]);
        return super.getArea();
        
    }

    
    
    
}
