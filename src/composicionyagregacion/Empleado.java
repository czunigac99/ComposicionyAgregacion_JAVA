/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicionyagregacion;

/**
 *
 * @author cris
 */
    
        
public class Empleado {

private String Nombre;
private float Sueldo;   

public Empleado(){

super();
}

public Empleado(String Nombre, float Sueldo){
this.Nombre=Nombre;
this.Sueldo=Sueldo;

}

public void set_Nombre(String Nombre){
this.Nombre=Nombre;
}
public void set_Sueldo(float Sueldo){
this.Sueldo=Sueldo;
}
public String get_Nombre(){
return Nombre;
}
public float get_Sueldo(){
return Sueldo;
}
}
