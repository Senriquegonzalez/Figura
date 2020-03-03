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
    //Se crea un objeto de la clase Coordenada
  
    private int[] coordenadasx;
    private int[] coordenadasy;
    private float[] lados;

    //Se declaran las variables   
    private float area;
    private float perimetro;
    private int cantidadLado;

    //Se crea el constructor el cual los vectores
    public Figura(int coordenadasx[], int coordenadasy[], int numeroLados) {

        //inicializo los vectores de coordenadas y lados dependiendo de el numero de lados
        this.coordenadasx = new int[numeroLados];
        this.coordenadasy = new int[numeroLados];
        lados = new float[numeroLados];        
        for (int i = 0; i < numeroLados; i++) {
            this.coordenadasx[i] = coordenadasx[i];
            this.coordenadasy[i] = coordenadasy[i];
        }
    }

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

    

    public void setCoordenadasx(int[] coordenadasx) {
        this.coordenadasx = coordenadasx;
    }

    public void setCoordenadasy(int[] coordenadasy) {
        this.coordenadasy = coordenadasy;
    }

    public void setLados(float[] lados) {
        this.lados = lados;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public void setCantidadLado(int cantidadLado) {
        this.cantidadLado = cantidadLado;
    }

    public int[] getCoordenadasx() {
        return coordenadasx;
    }

    public int[] getCoordenadasy() {
        return coordenadasy;
    }

    public float[] getLados() {
        return lados;
    }

    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public int getCantidadLado() {
        return cantidadLado;
    }
    
    

    

}
