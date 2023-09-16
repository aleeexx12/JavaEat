/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javaeat;

import java.io.Serializable;

/**
 *
 * @author alexv
 */
public class Empresa extends Cliente implements Serializable{
    
    private String CIF;
    
    private String WEB;

    public Empresa(String correo, String contraseña, String CIF, String WEB,String Nombre, String Direccion, String Telefono, String numeroTj, String titularTj, String fechaCad) {
        super(correo, contraseña, Nombre, Direccion, Telefono,numeroTj,titularTj,fechaCad );
        this.CIF = CIF;
        this.WEB = WEB;
    }

    

    public String getWEB() {
        return WEB;
    }

    public void setWEB(String WEB) {
        this.WEB = WEB;
    }


    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    
}
