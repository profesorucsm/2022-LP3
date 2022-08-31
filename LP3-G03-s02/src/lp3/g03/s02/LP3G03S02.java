/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lp3.g03.s02;
import java.util.*;
/**
 *
 * @author UCSM
 */
public class LP3G03S02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro p1 = new Perro("pekines", "amarillo");
        
        //System.out.println(p1.toString());
        
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Ingrese la nueva raza de tu perro: ");
        p1.setRaza(s1.next());
        
        System.out.println("Ingrese el nuevo peso de tu perro: ");
        p1.peso = s1.nextDouble();
        
        System.out.println(p1.getRaza());
        System.out.println(p1.peso);
        
        
    }
    
}
