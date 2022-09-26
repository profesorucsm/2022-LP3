/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lp3.sesion06;

/**
 *
 * @author UCSM
 */
public class LP3Sesion06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EmpleadoAsalariado empAsalariado = new EmpleadoAsalariado();
        EmpleadoPorComision empPorComision = new EmpleadoPorComision();
        EmpleadoPorHoras empPorHoras = new EmpleadoPorHoras();
        EmpleadoBaseMasComision empBaseMasComision = new EmpleadoBaseMasComision();
       
        Empleado[] empleados = new Empleado[4];
        empleados[0] = empAsalariado;
        empleados[1] = empPorComision;
        empleados[2] = empPorHoras;
        empleados[3] = empBaseMasComision;

        int count=0;
        for( Empleado empPolimorfico : empleados){
            empPolimorfico.ingreso();

            if(empPolimorfico instanceof EmpleadoBaseMasComision){
                //empPolimorfico.especifico();Em
                EmpleadoBaseMasComision empleadoBaseMasComision;
                empleadoBaseMasComision = (EmpleadoBaseMasComision)empPolimorfico;
                empleadoBaseMasComision.especifico();
                count++;
                }

        }
        System.out.println("\nEn el arreglo de empleados hay: "+count+" empleadosBaseMasComision");
        
        for(int i=0; i<empleados.length; i++){
            System.out.println(empleados[i].getClass().getName());
        }
     }
    
}
