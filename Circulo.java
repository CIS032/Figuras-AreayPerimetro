/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import javax.swing.JOptionPane;

/**
 *
 * @author Ferchitoo
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    

    public double area() {
        double area=Math.PI*(Math.pow(radio,2));
        return area;
    
    }

    public double perimetro() {
      double perimetro=2*(Math.PI*radio);
        return perimetro;
    }
}
