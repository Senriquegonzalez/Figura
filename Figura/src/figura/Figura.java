/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import java.awt.Graphics;

/**
 *
 * @author sergio
 */
public class Figura {

    Coordenada[] coordenadas = new Coordenada[4];

    private float lado1;
    private float lado2;
    private float lado3;

    private float area;
    private float perimetro;

    public Figura(Coordenada[] coordenadas) {
        this.coordenadas[0] = coordenadas[0];
        this.coordenadas[1] = coordenadas[1];
        this.coordenadas[2] = coordenadas[2];
         this.coordenadas[3] = coordenadas[3];
    }

    Figura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Dibujar(Graphics g) {
        g.drawLine(coordenadas[0].getEjeX(), coordenadas[0].getEjeY(), coordenadas[1].getEjeX(), coordenadas[1].getEjeY());
        g.drawLine(coordenadas[1].getEjeX(), coordenadas[1].getEjeY(), coordenadas[2].getEjeX(), coordenadas[2].getEjeY());
        g.drawLine(coordenadas[0].getEjeX(), coordenadas[0].getEjeY(), coordenadas[2].getEjeX(), coordenadas[2].getEjeY());
    }

    public float calcularPerimetro() {

        lado1 = (float) Math.sqrt(Math.pow((coordenadas[1].getEjeX() - coordenadas[0].getEjeX()), 2) + Math.pow((coordenadas[1].getEjeY() - coordenadas[0].getEjeY()), 2));
        if (lado1 < 0) {
            lado1 = lado1 * -1;
        }
        lado2 = (float) Math.sqrt(Math.pow((coordenadas[1].getEjeX() - coordenadas[2].getEjeX()), 2) + Math.pow((coordenadas[1].getEjeY() - coordenadas[2].getEjeY()), 2));
        if (lado2 < 0) {
            lado2 = lado2 * -1;
        }
        lado3 = (float) Math.sqrt(Math.pow((coordenadas[2].getEjeX() - coordenadas[0].getEjeX()), 2) + Math.pow((coordenadas[2].getEjeY() - coordenadas[0].getEjeY()), 2));
        if (lado3 < 0) {
            lado3 = lado3 * -1;
        }
        perimetro = lado1 + lado2 + lado3;
        return perimetro;

    }
    //CALCULA EL AREA DEL TRIANGULO CON LA FORMULA DE HERON
    public float calcularArea(){
        float semiPerimetro=(perimetro/2);
        area=(float) Math.sqrt(semiPerimetro *(semiPerimetro-lado1)*(semiPerimetro-lado2)*(semiPerimetro-lado3));
        return area;
    }

    public Coordenada[] getCoordenadas() {
        return coordenadas;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    

    public float getLado2() {
        return lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }

}
