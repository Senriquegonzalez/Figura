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
/**
 * 
 * costructor de la clase Rectangulo
 * @param coordenadasx parametro que recibe un vector de cordenadas eje x
 * @param coordenadasy parametro que recibe un vector de cordenadas eje y
 * @param lado    parametro que recibe la cantidad de lados de la fugura
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
    
