/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicionyagregacion;

import java.util.LinkedList;
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
    LinkedList<Empleado> lstEmpleados=new LinkedList<>();
    Empresa miEmpresa = new Empresa(lstEmpleados);  
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
   
  
   
  

    //Haciendo Composicion
   LinkedList<Empleado> imprimir = miEmpresa.listaEmpleado();
    
   for(int i=0;i<imprimir.size();i++){
   System.out.println(imprimir.get(i).get_Nombre()+""+imprimir.get(i).get_Sueldo() );
   
    }
   Cliente objCliente = new Cliente();
   objCliente.Set_Cliente("Cliente1");
   miEmpresa.agregarCliente(objCliente);
   
   Cliente objCliente2 = new Cliente();
   objCliente.Set_Cliente("Cliente2");
   miEmpresa.agregarCliente(objCliente);
   
   for(int i=0;i<miEmpresa.getLstCliente().size();i++){
   System.out.println(miEmpresa.getLstCliente().get(i).get_Cliente());
   

    }
   

   
   }
    
}
