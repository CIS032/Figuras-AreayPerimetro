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
public class Triangulo extends Figura{
    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo(double base, double altura, double lado1, double lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        System.out.println("-----------Construyendo triangulo------------");
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
    

    public double area() {
        //double base=8.5;
        //si quiero referirme a la base q tengo como atributo en la clase Triangulo base debe ser
        //double area=(this.base*altura)/2;
        //si yo quiero usar base heredada de la principal
        //debe ser double area=(super.base*altura)/2;
        double area=(base*altura)/2;
        return area;
    }


    public double perimetro() {
        double perimetro=lado1+lado2+base;
        return perimetro;
    }
}
