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

    float[] lados;

    //variable para guardar el tipo de triangulo
    private String tipoTriangulo;

    /**
     * costructor de la clase Triangulo
     *
     * @param coordenadasx recibe un vector de coordenadas en x
     * @param coordenadasy recibe un vector de coordenadas en y
     * @param lado recibe la cantidad de lados de la figura
     */
    public Triangulo(int coordenadasx[], int coordenadasy[], int lado) {
        super(coordenadasx, coordenadasy, lado);
        lados = super.getLados();

    }

    /**
     * metodo que compara los lados del triangulo para su clasificacion
     *
     * @return retorna el tipo de triangulo segun sus lados
     */
    public String definirTriangulo() {

        if (lados[0] == lados[1] && lados[1] == lados[2]) {

            tipoTriangulo = "Equilatero";

        } else if (lados[0] == lados[1] || lados[1] == lados[2] || lados[2] == lados[0]) {

            tipoTriangulo = "Isosceles";
        } else if ((lados[0] != lados[1]) && (lados[0] != lados[2]) && (lados[2] != lados[1])) {

            tipoTriangulo = "Escaleno";

        } else {

            System.out.println("no tomo valores");

        }

        return tipoTriangulo;

    }

    @Override
    //CALCULA EL AREA DEL TRIANGULO CON LA FORMULA DE HERON
    /**
     * METODO PARA CALCULAR EL AREA DEL TRIANGULO CON LA FORMULA DE HERON
     * 
     */
    public float calcularArea() {
        float semiPerimetro = (super.getPerimetro() / 2);
        super.setArea((float) Math.sqrt(semiPerimetro * (semiPerimetro - lados[0]) * (semiPerimetro - lados[1]) * (semiPerimetro - lados[2])));
        return super.getArea();

    }

    public String getTipoTriangulo() {
        return tipoTriangulo;
    }

}
