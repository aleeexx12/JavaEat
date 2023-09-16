/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author alexv
 */
public class almacenRestaurantes implements Serializable{

    public ArrayList<Restaurante> restaurante;

    public almacenRestaurantes() {
        restaurante = new ArrayList<>();
        LeerFichero("src/main/java/data");
        
    }

    public ArrayList<Restaurante> getRestaurante() {
        return restaurante;
    }

    private void LeerFichero(String ruta) {
        FileInputStream f = null;
        ObjectInputStream obs = null;

        try {
            f = new FileInputStream(ruta + File.separator + "lista_Restaurantes.dat");
            obs = new ObjectInputStream(f);
            this.restaurante = (ArrayList<Restaurante>) obs.readObject();
            
            
        } catch (IOException e) {
            System.err.println("IOEE EXCEPTION RESTAURANTES");
        } catch (ClassNotFoundException e2) {
            System.err.println(e2.getMessage());
        } finally {
            try {
                if (f != null) {
                    f.close();
                }
                if (obs != null) {
                    obs.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

    }
 
    public void EscribirFichero(String ruta) {
        final String SEP_FICHERO = System.getProperty("file.separator");
        FileOutputStream f = null;
        ObjectOutputStream obs = null;

        try {
            f = new FileOutputStream(ruta + SEP_FICHERO + "lista_Restaurantes.dat");
            obs = new ObjectOutputStream(f);
            obs.writeObject(this.restaurante);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (f != null) {
                    f.close();
                }
                if (obs != null) {
                    obs.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

    }
    
    @Override
    public String toString() {
              String a = "";

        for (Restaurante aux : restaurante) {
              a = a + aux;

        }
        return a;
        }

    public void borrarDatos() {
        this.restaurante.clear();
    }
}
