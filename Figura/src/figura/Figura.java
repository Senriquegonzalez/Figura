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

    private Coordenada[] coordenadas = new Coordenada[4];

    private float lado1;
    private float lado2;
    private float lado3;

    private float area;
    private float perimetro;

    public Figura(Coordenada[] coordenadas) {
        this.coordenadas[0] = coordenadas[0];
        this.coordenadas[1] = coordenadas[1];
        this.coordenadas[2] = coordenadas[2];

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

}
