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
public class Triangulo extends Figura {

    private float angulo1;
    private float angulo2;
    private float angulo3;
    private float pendiente1;
    private float pendiente2;
    private float pendiente3;
    private String tipoTriandulo;

    public Triangulo(Coordenada[] coordenadas) {
        super(coordenadas);

    }

    //metodo que me calcula las pendientes del triangulo
    public void pendientesTriandulo() {
        Coordenada[] coordenadas = super.getCoordenadas();
        pendiente1 = ((float) coordenadas[0].getEjeY() - (float) coordenadas[1].getEjeY()) / (float) (coordenadas[0].getEjeX() - (float) coordenadas[1].getEjeX());
        pendiente2 = (((float) coordenadas[2].getEjeY()) - ((float) coordenadas[1].getEjeY())) / (((float) coordenadas[2].getEjeX()) - ((float) coordenadas[1].getEjeX()));
        pendiente3 = ((float) coordenadas[0].getEjeY() - (float) coordenadas[2].getEjeY()) / ((float) coordenadas[0].getEjeX() - (float) coordenadas[2].getEjeX());
        System.out.println("pendiente1 = " + pendiente1 + "pendiente 2 = " + pendiente2 + "pendiente3 =" + pendiente3);
    }

    public void angulosTriandulo() {
        angulo1 = (float) Math.atan((pendiente3 - pendiente1) / (1 + (pendiente3 * pendiente1)));
        angulo1 = (float) Math.toDegrees(angulo1);
        if (angulo1 > 180) {
            angulo1 = 180 - angulo1;
        }
        angulo2 = (float) Math.atan((pendiente2 - pendiente1) / (1 + (pendiente1 * pendiente2)));
        angulo2 = (float) Math.toDegrees(angulo2);
        if (angulo3 > 180) {
            angulo1 = 180 - angulo2;
        }
        angulo3 = (float) Math.atan((pendiente3 - pendiente2) / (1 + (pendiente2 * pendiente3)));
        angulo3 = (float) Math.toDegrees(angulo3);
        if (angulo2 > 180) {
            angulo1 = 180 - angulo3;
        }
        System.out.println("angulo1 = " + angulo1 + "angulo2 = " + angulo2 + "angulo3 = " + angulo3);
    }

}
