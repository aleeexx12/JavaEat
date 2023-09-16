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
public class OrdenarRelevancia implements Comparator<Restaurante> {
   
    public int compare(Restaurante r1, Restaurante r2){
        double d1 = r1.getCalificacion();
        double d2 = r2.getCalificacion();
        
        return Double.compare(d2, d1);
    }
    
}
    