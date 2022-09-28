/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp3.s05;

/**
 *
 * @author UCSM
 */
public abstract class FiguraGeometrica {
    private double area;

    public FiguraGeometrica(double area) {
        this.area = area;
    }
    
    
    abstract public double CalcularArea(double base,double altura);
}
