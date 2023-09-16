/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeat;
import java.time.*;
import java.time.format.*;
/**
 *
 * @author alexv
 */
public class Opinion {
    
    private float Calificacion;
    
    private String Comentario;
    
    private LocalDateTime FechaEscrita;

    public Opinion(float Calificacion, String Comentario, LocalDateTime Fecha) {
        this.Calificacion = Calificacion;
        this.Comentario = Comentario;
        this.FechaEscrita = Fecha;
    }
    

    public LocalDateTime getFechaEscrita() {
        return FechaEscrita;
    }

    public void setFechaEscrita(LocalDateTime FechaEscrita) {
        this.FechaEscrita = FechaEscrita;
    }


    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }


    public float getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(float Calificacion) {
        this.Calificacion = Calificacion;
    }

    
}
