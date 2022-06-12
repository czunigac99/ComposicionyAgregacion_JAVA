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
public class Cliente {
    

 String NombreCliente;
 
public Cliente(){
super();
}    

public Cliente(String NombreCliente){
this.NombreCliente=NombreCliente;
}
public void Set_Cliente(String NombreCliente){
this.NombreCliente=NombreCliente;
}    
public String get_Cliente(){
return NombreCliente;
}

}
