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
public class OrdenarCatering implements Comparator<Restaurante> {
    public int compare(Restaurante r1, Restaurante r2) {
        boolean catering1 = r1.isCateringParaEmpresas();
        boolean catering2 = r2.isCateringParaEmpresas();

        if (catering1 && !catering2) {
            return -1; // r1 viene antes que r2
        } else if (!catering1 && catering2) {
            return 1; // r1 viene después de r2
        } else {
         
            String nombre1 = r1.getNombre();
            String nombre2 = r2.getNombre();   //
            return nombre1.compareTo(nombre2);
        }
    }
}
