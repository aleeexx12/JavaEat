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
public class almacenNombreUsuarios {
    private ArrayList<NombreUsuario> ListaUsuariosNombre;
    
    public almacenNombreUsuarios(){
        ListaUsuariosNombre = new ArrayList<>();
        // tendras que cambiar la ruta a tu gusto
        LeerFichero("");
    }

    public ArrayList<NombreUsuario> getListaUsuariosNombre() {
        return ListaUsuariosNombre;
    }
    
    private void LeerFichero(String ruta) {
        final String SEP_FICHERO = System.getProperty("file.separator");
        FileInputStream f = null;
        ObjectInputStream obs = null;

        try {
            f = new FileInputStream(ruta + SEP_FICHERO + "lista_Usua_Nombre.dat");
            obs = new ObjectInputStream(f);
            this.ListaUsuariosNombre = (ArrayList<NombreUsuario>) obs.readObject();
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
            f = new FileOutputStream(ruta + SEP_FICHERO + "lista_Usua_Nombre.dat");
            obs = new ObjectOutputStream(f);
            obs.writeObject(this.ListaUsuariosNombre);
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
