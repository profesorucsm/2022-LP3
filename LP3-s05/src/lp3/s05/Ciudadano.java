/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp3.s05;

/**
 *
 * @author UCSM
 */
public class Ciudadano extends Persona{
    private String dni;

    public Ciudadano(String dni, String nombre, int edad) {
        super(nombre, edad);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "dni=" + dni + '}';
    }
    
    
}
