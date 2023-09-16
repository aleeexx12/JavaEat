/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author alexv
 */
public class almacenContra {
    private ArrayList<Contraseña> ListaContras;
    
    public almacenContra(){
        ListaContras = new ArrayList<>();
        // tendras que cambiar la ruta a tu gusto
        LeerFichero("");
    }

    public ArrayList<Contraseña> getListaContras() {
        return ListaContras;
    }
    
    private void LeerFichero(String ruta) {
        final String SEP_FICHERO = System.getProperty("file.separator");
        FileInputStream f = null;
        ObjectInputStream obs = null;

        try {
            f = new FileInputStream(ruta + SEP_FICHERO + "lista_contr.dat");
            obs = new ObjectInputStream(f);
            this.ListaContras = (ArrayList<Contraseña>) obs.readObject();
        } catch (IOException e) {
            System.err.println();
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
            f = new FileOutputStream(ruta + SEP_FICHERO + "lista_contr.dat");
            obs = new ObjectOutputStream(f);
            obs.writeObject(this.ListaContras);
        } catch (IOException e) {
            System.err.println();
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
}
