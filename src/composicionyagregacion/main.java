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
    Empresa miEmpresa = new Empresa();  
    Empleado objEmpleado = new Empleado();
    String Nombre;
    float Sueldo;
    
    
    miEmpresa.set_NombreEmpresa("Venta de Canabis");
    
    for(int i=1; i<=3;i++){
    System.out.println("Ingrese el nombre");
    Nombre= sc.nextLine();
    System.out.println("Ingrese el Sueldo");
    Sueldo= sc.nextFloat();
    
    //Instancias empleado
   
    objEmpleado.set_Nombre(Nombre);
    objEmpleado.set_Sueldo(Sueldo);
    
    miEmpresa.Contratar(objEmpleado);
    
    objEmpleado=null;
    System.gc();
    
   }
   System.out.println(miEmpresa.get_NombreEmpresa());
   
  
   
  
    }
    
}
