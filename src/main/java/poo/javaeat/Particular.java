/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javaeat;

import java.io.Serializable;
import javaeat.TarjetaCredito;

/**
 *
 * @author alexv
 */
public class Particular extends Cliente implements Serializable {

    private String DNI;

    public Particular(String correo, String contraseña,String DNI, String Nombre, String Direccion, String Telefono, String numeroTj, String titularTj, String fechaCad) {
        super(correo, contraseña, Nombre, Direccion, Telefono, numeroTj,titularTj,fechaCad);
        this.DNI = DNI;
    }



    

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    

}
