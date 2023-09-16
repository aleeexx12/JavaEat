/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeat;

import java.io.Serializable;
import java.util.Scanner;
/**
 *
 * @author alexv
 */
public class Usuario implements Serializable {
    
    public String correo;
    public String contraseña;

    public Usuario(String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;

    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

   @Override
   public String toString(){
       return " - Correo electrónico = "+ correo + " - Contraseña = "+ contraseña;
   }
    
 
}

