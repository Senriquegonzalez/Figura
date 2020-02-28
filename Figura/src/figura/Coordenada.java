  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author sergio
 */
public class Coordenada {
    //Se declaran dos variables para almacenar pares ordenados 
    private int ejeX;
    private int ejeY;

    /**
     * Se crea el constructor
     */ 
    public Coordenada(int ejeX,int ejeY) {
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }
    
    /**
    *Se crean los métodos getters y setters
    */
    public int getEjeX() {
        return ejeX;
    }

    public void setEjeX(int ejeX) {
        this.ejeX = ejeX;
    }

    public int getEjeY() {
        return ejeY;
    }

    public void setEjeY(int ejeY) {
        this.ejeY = ejeY;
    }

    
    
    
}
