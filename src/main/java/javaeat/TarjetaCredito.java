/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeat;
import java.io.Serializable;
import java.time.*;
import java.time.format.*;
/**
 *
 * @author alexv
 */
public class TarjetaCredito implements Serializable {
    
    private String nombre; 
    private String numero;   
    private String fechatj;

    public TarjetaCredito(String nombre, String numero, String fechaTarjeta) {
        this.nombre = nombre;
        this.numero = numero;
        this.fechatj = fechaTarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechatj() {
        return fechatj;
    }

    public void setFechatj(String fechaTarjeta) {
        this.fechatj = fechaTarjeta;
    }
    
}
