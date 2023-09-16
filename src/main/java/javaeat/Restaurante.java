/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alexv
 */
public class Restaurante implements Serializable {
    
    private String cif;
    private String nombre;
    private String direccion;
    private String especialidad;
    private double calificacion;
    private double gastosEnvio;
    private int TiempoMedioEnvio;
    private boolean CateringParaEmpresas;
    private List<Productos> comidas;
    //private List<String> nombresCprivate List<Productos> comidas;omidas;

    public Restaurante(String cif, String nombre, String direccion, String especialidad, double calificacion,
                       double gastosEnvio, int tiempoMedioEnvio, boolean cateringParaEmpresas) {
        this.cif = cif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.calificacion = calificacion;
        this.gastosEnvio = gastosEnvio;
        this.TiempoMedioEnvio = tiempoMedioEnvio;
        this.CateringParaEmpresas = cateringParaEmpresas;
        this.comidas = new ArrayList<>();

        
        //this.nombresComidas = new ArrayList<>();
    }

    
    public List<Productos> getComidas() {
        return comidas;
    }
    
    public void setComidas(List<Productos> comidas) {
        this.comidas = comidas;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public double getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public int getTiempoMedioEnvio() {
        return TiempoMedioEnvio;
    }

    public void setTiempoMedioEnvio(int tiempoMedioEnvio) {
        this.TiempoMedioEnvio = tiempoMedioEnvio;
    }

    public boolean isCateringParaEmpresas() {
        return CateringParaEmpresas;
    }

    public void setCateringParaEmpresas(boolean cateringParaEmpresas) {
        this.CateringParaEmpresas = cateringParaEmpresas;
    }

   
}
