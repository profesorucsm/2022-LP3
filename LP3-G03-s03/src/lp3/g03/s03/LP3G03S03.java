/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lp3.g03.s03;
import java.math.*;
/**
 *
 * @author UCSM
 */
public class LP3G03S03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String Frase = "Quiero una bicicleta";
        //mostrarFrase(Frase); //Invocando al procedimiento
        //String rpta = mostrarFraseEnArgentino(Frase); //invocando a una Función
        //System.out.println(rpta);
        
        Bicicleta b1 = new Bicicleta("Carlos");
        //System.out.println(b1.getDuenio());
        
        Bicicleta b2 = new Bicicleta("Antonio");
        //System.out.println(b2.getDuenio());
        
        //System.out.println(Bicicleta.cantVendidas);
        
        Bicicleta b3 = new Bicicleta ("Laura");
        //System.out.println(b3.getDuenio()); 
        
        //System.out.println(Bicicleta.cantVendidas);
        
        //System.out.println(b3.getDuenio());
        System.out.println("La potencia de 2 al cuadrado es: "+Math.pow(2, 2));
    
    }
    
    //Procedimiento: Es aquel que puede o no recibir un argumento(s) pero NO retorna ningun valor.
    public static void mostrarFrase(String frase){
        System.out.println("La frase es: "+frase);
    }
    //Función: Es aquella que puede o no recibir un argumento(S) y NECESITA retonar un valor.
    public static String mostrarFraseEnArgentino(String frase){
        return "La frase en ingles es "+frase+" CHE";
    }
    
}
