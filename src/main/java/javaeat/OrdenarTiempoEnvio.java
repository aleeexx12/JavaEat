/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeat;

import java.util.Comparator;
/**
 *
 * @author alexv
 */
public class OrdenarTiempoEnvio implements Comparator<Restaurante> {
    
    public int compare(Restaurante r1, Restaurante r2){
        int i1 = r1.getTiempoMedioEnvio();
        int i2 = r2.getTiempoMedioEnvio();
        
         return Integer.compare(i2, i1);
    }
    
}