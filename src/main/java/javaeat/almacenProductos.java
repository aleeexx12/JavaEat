/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaeat;

import poo.javaeat1.ModificacionesRestaurante;
import java.util.ArrayList;
import poo.javaeat1.Pedidos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author alexv
 */
public class almacenProductos implements Serializable{

    private ArrayList<Productos> producto;

    public almacenProductos() {
        producto = new ArrayList<>();
        LeerFichero("src/main/java/data");

        
    }

    public ArrayList<Productos> getProducto() {
        return producto;
    }

    private void LeerFichero(String ruta) {
        FileInputStream f = null;
        ObjectInputStream obs = null;

        try {
            f = new FileInputStream(ruta + File.separator + "lista_prod.dat");
            obs = new ObjectInputStream(f);
            this.producto = (ArrayList<Productos>) obs.readObject();
            
            
        } catch (IOException e) {
            System.err.println("IO EXCEPTION PRODUCTOS");
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
            f = new FileOutputStream(ruta + SEP_FICHERO + "lista_prod.dat");
            obs = new ObjectOutputStream(f);
            obs.writeObject(this.producto);
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

        for (Productos aux : producto) {
            a = a + aux;

        }
        return a;
    }
    
    public void borrarDatos() {
        this.producto.clear();
    }

}
