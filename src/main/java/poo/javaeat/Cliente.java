/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javaeat;

/**
 *
 * @author alexv
 */

import java.io.Serializable;
import javaeat.TarjetaCredito;
import javaeat.Usuario;

public class Cliente extends Usuario {

    private String Nombre;

    private String Direccion;

    private String Telefono;

    private String numeroTj;
    
    private String titularTj;
    
    private String fechaCad;

    
    
    public Cliente(String correo, String contraseña, String Nombre, String Direccion, String Telefono, String numeroTj, String titularTj, String fechaCad) {
        super(correo, contraseña);
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
           /////////////7
        
        this.numeroTj = numeroTj;
        this.titularTj= titularTj;
        this.fechaCad= fechaCad;
    }
    
   
    

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNumeroTj() {
        return numeroTj;
    }

    public void setNumeroTj(String numeroTj) {
        this.numeroTj = numeroTj;
    }

    public String getTitularTj() {
        return titularTj;
    }

    public void setTitularTj(String titularTj) {
        this.titularTj = titularTj;
    }

    public String getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(String fechaCad) {
        this.fechaCad = fechaCad;
    }

    
}
