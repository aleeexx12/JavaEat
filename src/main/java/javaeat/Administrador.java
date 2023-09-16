/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeat;
/**
 *
 * @author alexv
 */
public class Administrador extends Usuario {
    
    public Administrador(String contraseña, String correo) {
        super(contraseña,correo);
        this.contraseña="admin";
    }
    
    @Override 
    
    public void setContraseña(String contraseña){
        this.contraseña="admin";
    }
    
    public void setCorreo(String correo){
        this.correo="admin@javaeat.com";
    }
    

    

}
    

