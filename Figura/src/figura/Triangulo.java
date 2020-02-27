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
    
    //variable para guardar el tipo de triangulo
    private String tipoTriangulo;
    //costructor que recibe como parametros un array de  coordenadas
    public Triangulo(Coordenada[] coordenadas) {
        super(coordenadas);

    }

    //metodo que compara los lados del triangulo para  su clasificacion

    public String definirTriangulo() {

        if (super.getLado1() == super.getLado2() && super.getLado2() == super.getLado3()) {

            tipoTriangulo = "Equilatero";

        } else if (super.getLado1() == super.getLado2() || super.getLado2() == super.getLado3() || super.getLado3() == super.getLado1()) {

            tipoTriangulo = "Isosceles";
        } else if ((super.getLado1() != super.getLado2()) && (super.getLado1() != super.getLado3()) && (super.getLado3() != super.getLado2())) {

            tipoTriangulo = "Escaleno";

        } else {

            System.out.println("no tomo valores");

        }

        return tipoTriangulo;

    }
}
