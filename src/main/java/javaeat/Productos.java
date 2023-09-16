/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeat;
import java.awt.Image;
import java.io.Serializable;
import java.time.format.*;
/**
 *
 * @author alexv
 */
public class Productos implements Serializable{
    
    private String TITULO;
    
    private String INGREDIENTES;
    
    private float PRECIO;
    
    private Image FOTO;
    
    private int RestauranteIndex;
    
     public Productos(String TITULO, String INGREDIENTES, int PRECIO) {
        this.TITULO = TITULO;
        this.INGREDIENTES = INGREDIENTES;
        this.PRECIO = PRECIO;
        this.FOTO = FOTO;
    }
    
    public String getTITULO() {
        return TITULO;
    }

    public void setTITULO(String TITULO) {
        this.TITULO = TITULO;
    }

    public String getINGREDIENTES() {
        return INGREDIENTES;
    }

    public void setINGREDIENTES(String INGREDIENTES) {
        this.INGREDIENTES = INGREDIENTES;
    }

    public float getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(float PRECIO) {
        this.PRECIO = PRECIO;
    }

    public Image getFOTO() {
        return FOTO;
    }

    public void setFOTO(Image FOTO) {
        this.FOTO = FOTO;
    }
    
    public int getRestauranteIndex() {
        return RestauranteIndex; // 
    }
    
    public void setRestauranteIndex(int restauranteIndex) {
        this.RestauranteIndex = restauranteIndex;
    }

    @Override
    public String toString() {
      return "Titulo:" + this.TITULO  ; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
