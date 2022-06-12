
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicionyagregacion;
import java.util.LinkedList;

/**
 *
 * @author cris
 */
public class Empresa {
 
 private String NombreEmpresa;
 int e = -1;
 private LinkedList<Empleado> lstEmpleados=new LinkedList<>();
 

 public Empresa(){
 super();

 }

public Empresa(String NombreEmpresa){
this.NombreEmpresa=NombreEmpresa;    

}
public void set_NombreEmpresa(String NombreEmpresa){
this.NombreEmpresa=NombreEmpresa;
} 
public String get_NombreEmpresa(){
return NombreEmpresa;
}   
public LinkedList<Empleado> getLstEmpleado() {
	return lstEmpleados;
}  

void Contratar(Empleado objEmpleado){
this.e++;
lstEmpleados.add(objEmpleado);
}
}
