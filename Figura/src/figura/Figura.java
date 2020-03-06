/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author sergio
 */


public abstract  class Figura implements Figuras {
   
  
    private int[] coordenadasx;
    private int[] coordenadasy;
    private float[] lados;

    //Se declaran las variables   
    private float area;
    private float perimetro;
    private int cantidadLado;

    //Se crea el constructor el cual los vectores
    /**
     * 
     * costructor de la clase fugura
     * @param coordenadasx parametro que recibe un vector de cordenadas eje x
     * @param coordenadasy parametro que recibe un vector de cordenadas eje y
     * @param numeroLados  parametro que recibe la cantidad de lados de la fugura
     */
    public Figura(int coordenadasx[], int coordenadasy[], int numeroLados) {

        //inicializo los vectores de coordenadas y lados dependiendo de el numero de lados
        this.coordenadasx = new int[numeroLados];
        this.coordenadasy = new int[numeroLados];
        this.cantidadLado = numeroLados;
        lados = new float[numeroLados];        
        for (int i = 0; i < numeroLados; i++) {
            this.coordenadasx[i] = coordenadasx[i];
            this.coordenadasy[i] = coordenadasy[i];
        }
    }
/**
 * 
 * metodo para calcular el perimetro 
 * @return retorna el perimetro
 */
    public float calcularPerimetro() {

        for (int i = 0; i < lados.length-1; i++) {
            
            lados[i] = (float) Math.sqrt(Math.pow((coordenadasx[i + 1] - coordenadasx[i]), 2) + Math.pow((coordenadasy[i+1] - coordenadasy[i ]), 2));
            if (lados[i] < 0) {
                lados[i] = lados[i] * -1;
            }
            perimetro = perimetro + lados[i];
        }
        lados[lados.length-1]=(float) Math.sqrt(Math.pow((coordenadasx[lados.length-1] - coordenadasx[0]), 2) + Math.pow((coordenadasy[lados.length-1] - coordenadasy[0 ]), 2));
            if (lados[lados.length-1] < 0) {
                lados[lados.length-1] = lados[lados.length-1] * -1;
            }
            perimetro = perimetro + lados[lados.length-1];

        return perimetro;
    }

    
/**
 * metodo para enviar un array de coordenadas del eje x
 * 
 * @param coordenadasx 
 */
    public void setCoordenadasx(int[] coordenadasx) {
        this.coordenadasx = coordenadasx;
    }
/**
 * 
 * metodo para enviar un array de coordenadas del eje y
 * @param coordenadasy 
 */
    public void setCoordenadasy(int[] coordenadasy) {
        this.coordenadasy = coordenadasy;
    }
/**
 * 
 * metodo para enviar  la cantidad de lados de la figura
 * @param lados 
 */
    public void setLados(float[] lados) {
        this.lados = lados;
    }
/**
 * 
 * metodo para enviar un area a la figura
 * @param area 
 */
    public void setArea(float area) {
        this.area = area;
    }
/**
 * 
 * metodo para enviar un perometro a la figura
 * @param perimetro 
 */
    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
/**
 * 
 * metodo para enviar la cantidad de lados de la figura
 * @param cantidadLado 
 */
    public void setCantidadLado(int cantidadLado) {
        this.cantidadLado = cantidadLado;
    }
/**
 * 
 * metodo para recuperar un array de coordenadas del eje x
 * @return  vector de coordenadas eje x
 */
    public int[] getCoordenadasx() {
        return coordenadasx;
    }
/**
 * 
 * metodo para recuperar un array de coordenadas del eje y
 * @return vector de coordenadas eje y
 */
    public int[] getCoordenadasy() {
        return coordenadasy;
    }
/**
 * 
 * metodo para recuperar los lados de la figura
 * @return lados de la rigura
 */
    public float[] getLados() {
        return lados;
    }
/**
 * metodo para recuperar uel area de la figura
 * 
 * @return  area de la figura
 */
    public float getArea() {
        return area;
    }
/**
 * metodo para recuperar el primetro de la figura
 * 
 * @return  perimetro de la figura
 */
    public float getPerimetro() {
        return perimetro;
    }
/**
 * metodo para recuperar la cantidad de lados de la figura
 * 
 * @return  lados de la figura.
 */
    public int getCantidadLado() {
        return cantidadLado;
    }
    
    

    

}
