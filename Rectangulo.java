/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author Ferchitoo
 */
public class Rectangulo extends Figura{
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    
    
    public double area() {
        double area=largo*ancho;
        return area;
    }


    public double perimetro() {
        double perimetro=largo+ancho+largo+ancho;
        return perimetro;
        
    }
}
