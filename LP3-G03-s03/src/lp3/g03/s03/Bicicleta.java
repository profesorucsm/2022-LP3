/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp3.g03.s03;

/**
 *
 * @author UCSM
 */
public class Bicicleta {
    private String duenio;
    
    static int cantVendidas = 0;
    static final String LOTEFAB = "China2022";
    
    public Bicicleta(String duenio) {
        this.duenio = duenio;
        cantVendidas++;
    }
    
    //Esto es un procedimiento, pero por estar definida dentro de una clase es un METODO
    public static void mostrarInfoVentas(Bicicleta b){
        System.out.println("El duenio es: "+b.getDuenio());
        System.out.println("Lote de Fabricacion: "+LOTEFAB);
        System.out.println("Cantidad de bicicletas vendidas de este lote: "+cantVendidas);

    }
    
    //Es una función, pero por estar definida dentro de una clase es un METODO
    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
    
    
}
