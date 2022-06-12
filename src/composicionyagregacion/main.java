/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicionyagregacion;

import java.util.Scanner;

/**
 *
 * @author cris
 */
public class main {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
    String Nombre;
    float Sueldo;
    
    for(int i=1; i<=3;i++){
    System.out.println("Ingrese el nombre");
    Nombre= sc.nextLine();
    System.out.println("Ingrese el Sueldo");
    Sueldo= sc.nextFloat();
    
    //Instancias empleado
    Empleado objEmpleado = new Empleado();
    objEmpleado.setNombre(Nombre);
    
   }
    
    
    }
    
}
