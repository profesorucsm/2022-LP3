/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lp3.sesion07;

import java.util.Scanner;

/**
 *
 * @author UCSM
 */
public class LP3Sesion07 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        int num, den, rpta;
        
        Scanner sc = new Scanner(System.in);
        
        //System.out.println("Ingrese un numero entero para el numerador");
        //num = sc.nextInt();
        
        System.out.println("Ingrese un valor entre 10 y 20");
        
        
        try{
           den = sc.nextInt();
           if(den<10 || den>20){
                throw new MiException("ERROR de Mi Excepcion desconocida");
           }
        }
        catch(ArithmeticException e){
            System.out.println("Hubo una Excepcion Aritmetica");
        }
        catch(NullPointerException m){
            System.out.println("Hubo una Excepcion de puntero nulo");
        }
        catch(MiException n){
            System.out.println("SE MANEJO la Excepcion desconocida");
        }
        finally{
            System.out.println("Se cerraron todos los recursos antes de acabar programa");
        }
        
        
        System.out.println("Continua el flujo del programa 20");
        
        
        
    }

    
}
