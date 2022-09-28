/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp3.s05;

/**
 *
 * @author UCSM
 */
public class Triangulo extends FiguraGeometrica{

    public Triangulo(double area) {
        super(area);
    }
    
    public double CalcularArea(double base,double altura){
        return (base * altura) / 2;
    }
}
